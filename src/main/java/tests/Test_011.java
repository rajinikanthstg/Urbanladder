package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_011 extends BaseClass{
	
	@Test
	void TC_011() throws Exception
	{	
		try {
			test = extent.createTest("Verify The  SignUp Functionality With Existing User Id And Password");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.signupOption);
			test.log(Status.INFO,"clicked on signup");
			enterData(signupObject.userEmail,config.getProperty("email"));
			test.log(Status.INFO,"entered email");
			enterData(signupObject.password,config.getProperty("password"));
			test.log(Status.INFO,"entered password");
			click(signupObject.signupButton);
			test.log(Status.INFO,"clicked on signup button");
			Assert.assertTrue(signupObject.emailError.isDisplayed());
			test.log(Status.PASS,"error message displayed");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
