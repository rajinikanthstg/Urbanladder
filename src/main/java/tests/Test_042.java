package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_042 extends BaseClass{
	
	@Test
	void TC_042() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Track Order Icon");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.trackOrdericon);
			Assert.assertTrue(driver.getCurrentUrl().contains("track-order"));
			test.log(Status.PASS,"navigated to track order page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
}
