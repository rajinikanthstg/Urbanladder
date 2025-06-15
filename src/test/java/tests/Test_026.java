package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_026 extends BaseClass{
	
	@Test
	void TC_026() throws Exception
	{
		try {		
			test = extent.createTest("Verify That The Forget Password Button In Login PopUp Directs To Set Account Password Page");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered on profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			click(loginObject.forgotPassword);
			test.log(Status.INFO,"clicked on forget password");
			Assert.assertTrue(driver.getCurrentUrl().contains("resetpassword"));
			test.log(Status.INFO,"url contains resetpassword");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"Forget Password Test Failed");
		}
	}
}
