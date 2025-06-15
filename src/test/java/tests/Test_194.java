package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_194 extends BaseClass{
	
	@Test
	void TC_194() throws Exception
	{
		try {
			test = extent.createTest("Verify That The User Registration Details Like Name, Email, Mobile Number, Password Are Displayed In My Account Page");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.profileOption);
			Thread.sleep(3000);
			test.log(Status.INFO,"navigated to my account");
			Assert.assertTrue(profilePageObject.name.isDisplayed());
			test.log(Status.PASS,"user name displayed");
			Assert.assertTrue(profilePageObject.email.isDisplayed());
			test.log(Status.PASS,"user email displayed");
			Assert.assertTrue(profilePageObject.mnumber.isDisplayed());
			test.log(Status.PASS,"mobile number displayed");
			Assert.assertTrue(profilePageObject.password.isDisplayed());
			test.log(Status.PASS,"password field displayed");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
