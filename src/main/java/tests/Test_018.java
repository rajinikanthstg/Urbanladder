package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_018 extends BaseClass{
	
	@Test
	void TC_018() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Login Functionality With Email And Password As Blank");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			loginObject.userEmail.clear();
			test.log(Status.INFO, "email cleared");
			enterData(loginObject.userEmail,"");
			test.log(Status.INFO,"user email left blank");
			enterData(loginObject.password,"");
			test.log(Status.INFO,"password left blank");
			click(loginObject.loginButton);
			test.log(Status.INFO,"clicked on login button");
			Assert.assertTrue(loginObject.emailError.isDisplayed());
			Assert.assertTrue(loginObject.passwordError.isDisplayed());
			test.log(Status.PASS,"error mesage displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.INFO,"test failed");
		}
	}

}
