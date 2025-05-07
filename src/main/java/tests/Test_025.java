package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_025 extends BaseClass{
	
	@Test
	void TC_025() throws Exception
	{
		try {
			test = extent.createTest("Verify The Browse Back Button Directs To Homepage After Login");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			enterData(loginObject.userEmail,config.getProperty("email"));
			test.log(Status.INFO,"entered user email");
			enterData(loginObject.password,config.getProperty("password"));
			test.log(Status.INFO,"entered password");
			click(loginObject.loginButton);
			test.log(Status.INFO,"clicked on login button");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.INFO,"profile options displayed");
			driver.navigate().back();
			hover(homeObject.picon);
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.PASS,"profile options displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
