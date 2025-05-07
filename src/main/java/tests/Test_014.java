package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_014 extends BaseClass{
	
	@Test
	void TC_014() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Login Functionality With Valid Email And Valid Password");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login");
			enterData(loginObject.userEmail,config.getProperty("email"));
			test.log(Status.INFO,"entered email");
			enterData(loginObject.password,config.getProperty("password"));
			test.log(Status.INFO,"entered password");
			click(loginObject.loginButton);
			test.log(Status.INFO,"clicked on login button");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.PASS,"profile option displayed");
			click(homeObject.logout);
			test.log(Status.INFO,"clicked on logout");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
