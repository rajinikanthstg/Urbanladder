package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_193 extends BaseClass{
	
	@Test
	void TC_193() throws Exception
	{
		try {
			test = extent.createTest("Verify The Profile Option In User Profile Dropdown Directs To My Account Page");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.profileOption);
			test.log(Status.INFO,"clicked on profile");
			Assert.assertTrue(driver.getCurrentUrl().contains("profile"));
			test.log(Status.PASS,"navigated to my account");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
