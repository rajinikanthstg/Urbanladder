package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_205 extends BaseClass{
	
	@Test
	void TC_205() throws Exception
	{
		try {
			test = extent.createTest("Verify The Browse Back Button Directs To Login Page After Logout");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.logout);
			test.log(Status.INFO,"clicked on logout");
			Thread.sleep(3000);
			driver.navigate().back();
			test.log(Status.INFO,"clicked on browse back");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(landingObject.loginOption.isDisplayed());
			test.log(Status.PASS,"navigated to landing page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
