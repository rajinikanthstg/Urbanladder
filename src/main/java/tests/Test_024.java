package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_024 extends BaseClass{
	
	@Test
	void TC_024() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Close Button On LoginPopUp");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login options");
			click(loginObject.closeButton);
			test.log(Status.INFO,"clicked on close button");
			Thread.sleep(1000);
			Assert.assertFalse(loginObject.loginText.isDisplayed());
			test.log(Status.PASS,"login popup closed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
