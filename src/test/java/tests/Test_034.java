package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_034 extends BaseClass{
	
	@Test
	void TC_034() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Find A Store Link");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"Hovered Over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"Clicked On Login Option");
			enterData(loginObject.userEmail,config.getProperty("email"));
			test.log(Status.INFO,"Entered user email");
			enterData(loginObject.password,config.getProperty("password"));
			test.log(Status.INFO,"entered password");
			click(loginObject.loginButton);
			test.log(Status.INFO,"clikced on login button");
			click(homeObject.findAStore);
			test.log(Status.INFO,"clicked on find a store");
			Assert.assertTrue(driver.getCurrentUrl().contains("store-cities"));
			test.log(Status.PASS,"navigated to nearest store page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}		
	}
}
