package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_004 extends BaseClass{
	
	@Test
	void TC_004() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Login Button On Signup Page Is Directing To Login Page");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over pofile icon");
			click(landingObject.signupOption);
			test.log(Status.INFO,"cliked on signup");
			click(signupObject.loginLink);
			test.log(Status.INFO,"clicked on login");
			Assert.assertTrue(loginObject.loginTitle.isDisplayed());
			test.log(Status.PASS,"displayed login popup");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}

}
