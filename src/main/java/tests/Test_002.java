package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_002 extends BaseClass{
	
	@Test
	void TC_002() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Show Password Button On Signup Page");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.signupOption);
			test.log(Status.INFO,"clicked on signup");
			enterData(signupObject.password,"password");
			test.log(Status.INFO,"entered password");
			click(signupObject.showPassword);
			test.log(Status.INFO,"clicked on show password");
			Assert.assertEquals("password",signupObject.password.getAttribute("value"));
			test.log(Status.PASS,"password visible");			
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
}
