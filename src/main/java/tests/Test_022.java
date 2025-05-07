package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_022 extends BaseClass {
	
	@Test
	void TC_022() throws Exception
	{
		try {
			test = extent.createTest("Verify The Terms Of Service Link On Login PopUp");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			click(loginObject.termsOfService);
			test.log(Status.INFO,"clicked on terms of service");
			Assert.assertEquals("Terms of Use | Urban Ladder - Urban Ladder",getPageTitle());	
			test.log(Status.PASS,"navigated to terms of use");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
