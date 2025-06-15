package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_156 extends BaseClass{
	
	@Test
	void TC_156() throws Exception
	{
		try {
			test = extent.createTest("Verify The Total Price Displayed In Cart");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"kids table");
			test.log(Status.INFO,"entered kids table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			String title = searchResultObject.productTitles.get(0).getText();
			test.log(Status.INFO,"hovered over product image");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart button");	
			List<WebElement> products = cartObject.productTitles;
			
			int pos = -1;
			for(int i=0;i<products.size();i++)
			{
				if(products.get(i).getText().equalsIgnoreCase(title))
				{
					pos=i;
					break;
				}
			}
			
			scrollToView(cartObject.productTitles.get(pos));
			test.log(Status.INFO,"scrolled to added product in cart");
			String xpath = "(//select[@id=\"select_0_quantity\"])["+(pos+1)+"]/option";
			List<WebElement> options = driver.findElements(By.xpath(xpath));
			
			int qty=2;
			SelectByValue(options,String.valueOf(qty));
			test.log(Status.INFO,"caluclating sum of all product's price in cart");
			
			int sumOfPrices=0;
			int deliveryCharges = Integer.parseInt(cartObject.deliveryCharges.getText().replaceAll("[^0-9]",""));
			List<WebElement> prices = cartObject.finalPrice;
			for(int i=0;i<prices.size();i++)
			{
				int sum=Integer.parseInt(prices.get(i).getText().replaceAll("[^0-9]",""));
				sumOfPrices+=sum;
			}
			test.log(Status.INFO,"caluclating final price including delivery charges");
			int caluclatedTotal = (sumOfPrices+deliveryCharges);
			int cartTotal = Integer.parseInt(cartObject.cartTotal.getText());
			scrollToView(cartObject.cartTotal);
			test.log(Status.INFO,"scrolled to total price");
			Assert.assertEquals(caluclatedTotal,cartTotal);
			test.log(Status.PASS,"cart total price verified");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
