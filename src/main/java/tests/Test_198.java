package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_198 extends BaseClass{
	
	@Test
	void TC_198() throws Exception
	{
		try {
			test = extent.createTest("Verify Errror Message Is Displayed When Password And Confirm Password Are The Existing One");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.profileOption);
			test.log(Status.INFO,"clicked on profile");
			click(profilePageObject.edit);
			test.log(Status.INFO,"clicked on edit button");
			click(profilePageObject.changePassword);
			test.log(Status.INFO,"clicked on change password");
			profilePageObject.pword.sendKeys("Rajini@223");
			test.log(Status.INFO,"entered old password");
			profilePageObject.cpword.sendKeys("Rajini@223");
			test.log(Status.INFO,"re entered old password to confirm");
			click(profilePageObject.update);
			test.log(Status.INFO,"clicked on update");
			Assert.assertFalse(profilePageObject.updated.isDisplayed());
			test.log(Status.PASS,"error message displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
