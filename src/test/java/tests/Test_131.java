package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_131 extends BaseClass{
	
	@Test
	void TC_131() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Product Can Be Added To Cart From The Product Comparing Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"study lamp");
			test.log(Status.INFO,"entered lamp in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(searchResultObject.firstProductCompare);
			Thread.sleep(2000);
			hover(searchResultObject.secondProductImg);
			test.log(Status.INFO,"hovered over second search result");
			click(searchResultObject.secondProductCompare);
			Thread.sleep(2000);
			click(addToComparePopup.compareBtn);
			test.log(Status.INFO,"navigated to product compare page");
			click(addToComparePopup.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
			test.log(Status.PASS,"added to cart");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}
}
