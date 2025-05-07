package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_013 extends BaseClass{
	
	@Test
	void TC_013() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Login Button Is Showing The Login PopUp On Clicking");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login");
			ExplicitWait(loginObject.loginText);
			Assert.assertTrue(loginObject.loginText.isDisplayed());
			test.log(Status.PASS,"login popup shown");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}		
	}

}
