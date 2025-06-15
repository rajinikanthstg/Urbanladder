package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_200 extends BaseClass{
	
	@Test
	void TC_200() throws Exception
	{
		try {
			test = extent.createTest("Verify Login With Old Password Is Not Allowed After Changing The Password");
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
			test.log(Status.PASS,"password updated");
			enterData(profilePageObject.newEmail,"rajinikanthc.testing@gmail.com");
			test.log(Status.INFO,"entered email id");
			enterData(profilePageObject.newPassword,"Rajesh@123");
			test.log(Status.INFO,"enetered new password");
			click(profilePageObject.newLogin);
			test.log(Status.INFO,"clicked on login");
			Assert.assertTrue(profilePageObject.loginError.isDisplayed());
			test.log(Status.PASS,"login error message displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
