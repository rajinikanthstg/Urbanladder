package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_192 extends BaseClass{
	
	@Test
	void TC_192() throws Exception
	{
		try {
			test = extent.createTest("Verify The User Profile Dropdown Is Displayed On Hovering Over The Profile Icon");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.PASS,"user profile dropdown displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
