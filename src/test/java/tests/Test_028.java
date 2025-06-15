package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_028 extends BaseClass{
	
	@Test
	void TC_028() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Forget Password Button In Login PopUp Directs To Set Account Password Page");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered on profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			click(loginObject.forgotPassword);
			test.log(Status.INFO,"clicked on forget password");
			enterData(forgotPwdObject.forgotEmail,config.getProperty("email"));
			test.log(Status.INFO,"entered a registered email");
			Assert.assertTrue(forgotPwdObject.infoMessage.isDisplayed());
			test.log(Status.INFO,"error message displayed");
			
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
