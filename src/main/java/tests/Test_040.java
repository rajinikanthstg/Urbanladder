package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_040 extends BaseClass{
	
	@Test
	void TC_040() throws Exception
	{
		try {
			test = extent.createTest("Verify The Search Bar Is Accepting Text");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair"+Keys.ENTER);
			test.log(Status.INFO,"entered text in search");
			Assert.assertTrue(homeObject.searchResult.isDisplayed());
			test.log(Status.PASS,"search results displayed");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}

}
