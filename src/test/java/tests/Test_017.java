package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_017 extends BaseClass{
	
	@Test
	void TC_017() throws Exception
	{
		try {
			test = extent.createTest("Verify The Login Functionality With InValid Email And Invalid Password");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			loginObject.userEmail.clear();
			test.log(Status.INFO,"cleared user email");
			enterData(loginObject.userEmail,"rajinikanth@gmail.com");
			test.log(Status.INFO,"entered user email");
			enterData(loginObject.password,"password");
			test.log(Status.INFO,"entered password");
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
