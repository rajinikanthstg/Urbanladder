package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_199 extends BaseClass{
	
	@Test
	void TC_199() throws Exception
	{
		try {
			test = extent.createTest("Verify Password Is Updated Successfully By Loging In With The New Password");
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
			enterData(profilePageObject.newPassword,"Rajini@223");
			test.log(Status.INFO,"enetered new password");
			click(profilePageObject.newLogin);
			test.log(Status.INFO,"clicked on login");
			scrollToView(homeObject.picon);
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.PASS,"login sucess");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
