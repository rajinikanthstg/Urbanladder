package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_132 extends BaseClass{
	
	@Test
	void TC_132() throws Exception
	{
		try {
			test =  extent.createTest("Verify The View Product Button Navigates To Product Page On Clicking");
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
			test.log(Status.INFO,"clicked on compare button");
			click(addToComparePopup.viewProduct);
			test.log(Status.INFO,"clicked on view product");
			Assert.assertTrue(driver.getCurrentUrl().contains("products"));
			test.log(Status.PASS,"avigated to product page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
