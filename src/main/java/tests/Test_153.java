package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_153 extends BaseClass{
	
	@Test
	void TC_153() throws Exception
	{
		try {
			test = extent.createTest("Verify The Price Of The Product After Adding To Cart Is For Single Quantity");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"wardrobe");
			test.log(Status.INFO,"entered chair in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			String product = searchResultObject.productTitles.get(0).getText();
			String price = searchResultObject.firstProductPrice.getAttribute("data-price");
			test.log(Status.INFO,"hovered over product image");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product button");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			List<WebElement> products = cartObject.productTitles;
			
			int pos = -1;
			for(int i=0;i<products.size();i++)
			{
				if(products.get(i).getText().equalsIgnoreCase(product))
				{
					pos=i;
					break;
				}
			}
			
			scrollToView(cartObject.productTitles.get(pos));
			String xpath = "(//select[@id=\"select_0_quantity\"])["+(pos+1)+"]/option";
			List<WebElement> options = driver.findElements(By.xpath(xpath));
			SelectByValue(options,"1");
			String cartPrice = cartObject.finalPrice.get(pos).getText();
			cartPrice = cartPrice.replaceAll("[^0-9]","");
			Assert.assertEquals(cartPrice,price);
			test.log(Status.PASS,"product price verified in cart");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
