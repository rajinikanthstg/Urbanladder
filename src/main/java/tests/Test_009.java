package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_009 extends BaseClass{
	
	@Test
	void TC_009() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Functionality Of Close Button On SignUp PopUp");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.signupOption);
			test.log(Status.INFO,"clicked on signup");
			click(signupObject.closeButton);
			test.log(Status.INFO,"clicked on close button");			
			Thread.sleep(2000);
			Assert.assertFalse(signupObject.signupText.isDisplayed());
			test.log(Status.PASS,"signup text shown");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
