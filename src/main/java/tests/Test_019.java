package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_019 extends BaseClass{
	
	@Test
	void TC_019() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Functionality Of Signup Button On Login Popup");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			click(loginObject.signupLink);
			test.log(Status.INFO,"clicked on signup");
			Assert.assertTrue(loginObject.signupText.isDisplayed());
			test.log(Status.PASS,"signup popup displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}
}
