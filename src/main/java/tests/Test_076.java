package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_076 extends BaseClass{
	
	@Test
	void TC_076() throws Exception
	{
		try {
			test = extent.createTest("Verify The Search Bar Provides The Relevant Results");
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered chair in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"results-count\"]/span")).isDisplayed());
			test.log(Status.PASS,"search results displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
		finally {
			test.log(Status.INFO,"user logged out");
		}
	}

}
