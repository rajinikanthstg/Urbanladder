package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_154 extends BaseClass{
	
	@Test
	void TC_154() throws Exception
	{
		try {
			test = extent.createTest("Verify The Price Of The Product Is Updated As Per The Quantity");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"coffee table");
			test.log(Status.INFO,"entered coffee table in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			String product = searchResultObject.productTitles.get(0).getText();
			int price = Integer.parseInt(searchResultObject.firstProductPrice.getAttribute("data-price"));
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
			test.log(Status.INFO,"scrolled to added product in cart");
			String xpath = "(//select[@id=\"select_0_quantity\"])["+(pos+1)+"]/option";
			List<WebElement> options = driver.findElements(By.xpath(xpath));
			
			int qty=2;
			SelectByValue(options,String.valueOf(qty));
			ExplicitWait(cartObject.finalPrice.get(pos));
			scrollToView(cartObject.productTitles.get(pos));
			int fprice = Integer.parseInt(cartObject.finalPrice.get(pos).getText().replaceAll("[^0-9]",""));
			test.log(Status.INFO,"comparing actual and expected price");
			Assert.assertEquals(fprice,price*qty);
			test.log(Status.PASS,"product price modified as per quqntity");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL, "test failed");
		}
	}

}
