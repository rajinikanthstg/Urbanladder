package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_105 extends BaseClass{
	
	@Test
	void TC_105() throws Exception
	{
		try {
			test = extent.createTest("Verify The Add To Cart Button In Product Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"table");
			test.log(Status.INFO,"entered table in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			String product = productPageObject.productTitle.getText();
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			scrollToView(homeObject.logo);
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon");
			
			List<WebElement> products = cartObject.productTitles;
			
			boolean result = false;
			for(WebElement e:products)
			{
				if(e.getText().equalsIgnoreCase(product))
				{
					result=true;
					break;
				}
			}
			
			Assert.assertTrue(result,"product added to cart");
			test.log(Status.PASS,product+" added to cart");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
