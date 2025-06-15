package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_036 extends BaseClass{
	
	@Test
	void TC_036() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of UL Services Link");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.ulServices);
			test.log(Status.INFO,"clicked on ul services");
			Assert.assertTrue(driver.getCurrentUrl().contains("ul-services"));
			test.log(Status.PASS,"navigated to ul services page");			
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
}
