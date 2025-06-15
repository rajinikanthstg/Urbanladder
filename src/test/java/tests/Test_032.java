package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_032 extends BaseClass{
	
	@Test
	void TC_032() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Help Link on homepage");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on the login button");
			enterData(loginObject.userEmail,config.getProperty("email"));
			test.log(Status.INFO,"entered user email");
			enterData(loginObject.password,config.getProperty("password"));
			test.log(Status.INFO,"entered password");
			click(loginObject.loginButton);
			test.log(Status.INFO,"user logged in");
			click(homeObject.help);
			test.log(Status.INFO,"clicked on help link");
			Assert.assertTrue(driver.getTitle().contains("Help"));
			test.log(Status.INFO,"navigated to help page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
}
