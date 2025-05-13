package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_197 extends BaseClass{
	
	@Test
	void TC_197() throws Exception
	{
		try {
			test = extent.createTest("Verify The Change Password Link Is Allowing To Change Password");
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
			test.log(Status.INFO,"entered new password");
			profilePageObject.cpword.sendKeys("Rajini@223");
			test.log(Status.INFO,"re entered password to confirm");
			click(profilePageObject.update);
			test.log(Status.INFO,"clicked on update");
			Assert.assertTrue(profilePageObject.updated.isDisplayed());
			test.log(Status.PASS,"password updated");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
