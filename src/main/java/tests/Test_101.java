package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_101 extends BaseClass{
	
	@Test
	void TC_101() throws Exception
	{
		try {
			test = extent.createTest("Verify The Add To Wishlist Icon In Product Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToWishList);
			test.log(Status.INFO,"clicked on add to wishlist");
			String product = productPageObject.productTitle.getText();
			scrollToElement(homeObject.logo);
			click(homeObject.whishList);
			test.log(Status.INFO,"navigated to wishlist page");
			
			boolean result = false;
			List<WebElement> products = wishListObject.wishListProducts;
			for(WebElement e:products)
			{
				if(e.getText().equalsIgnoreCase(product))
				{
					result=true;
					break;
				}
			}
			
			Assert.assertTrue(result);
			test.log(Status.PASS,product+" added to wishlist");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
