package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_201 extends BaseClass{
	
	@Test
	void TC_201() throws Exception
	{
		try {
			test = extent.createTest("Verify The Cancel Button Terminates The Uppdation Process");
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
			Assert.assertTrue(profilePageObject.pword.isDisplayed());
			test.log(Status.INFO,"new password field displayed");
			click(profilePageObject.cancel);
			test.log(Status.INFO,"clicked on cancel");
			Assert.assertTrue(profilePageObject.edit.isDisplayed());
			test.log(Status.PASS,"change password terminated");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
