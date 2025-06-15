package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_041 extends BaseClass {
	
	@Test
	void TC_041() throws Exception
	{
		try {
			test = extent.createTest("Verify The Magnifier Icon In Search");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered text in search");	
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			Assert.assertTrue(homeObject.searchResult.isDisplayed());
			test.log(Status.PASS,"search results displayed");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
