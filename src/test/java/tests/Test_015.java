package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_015 extends BaseClass{
	
	@Test
	void TC_015() throws Exception
	{
		try {
			test = extent.createTest("Verify The Login Functionality With Valid Email And Invalid Password");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hover over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			enterData(loginObject.userEmail,config.getProperty("email"));
			test.log(Status.INFO,"entered valid email");
			enterData(loginObject.password,"password");
			test.log(Status.INFO,"entered invalid password");
			click(loginObject.loginButton);
			test.log(Status.INFO,"clicked on login button");
			Assert.assertTrue(loginObject.loginError.isDisplayed());
			test.log(Status.PASS,"login error displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
