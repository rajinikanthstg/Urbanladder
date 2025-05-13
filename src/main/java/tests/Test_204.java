package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_204 extends BaseClass{
	
	@Test
	void TC_204() throws Exception
	{
		try {
			test = extent.createTest("Verify The Logout Option In Profile Dropdown Logs Out The User");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.logout);
			test.log(Status.INFO,"clicked on logout");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(landingObject.loginOption.isDisplayed());
			test.log(Status.PASS,"user logged out");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
