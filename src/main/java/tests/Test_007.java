package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_007 extends BaseClass {
	
	@Test(description="Verify The Terms Of Service Link On Signup PopUp")
	void TC_007() throws Exception
	{	
		try {
			test = extent.createTest("Verify The Terms Of Service Link On Signup PopUp");
			hover(landingObject.profileIcon);
			test.log(Status.INFO, "hovered over profile icon");			
			click(landingObject.signupOption);
			test.log(Status.INFO,"clicked on signup");
			click(signupObject.termsOfService);
			test.log(Status.INFO,"clicked on tesrms of services");
			Assert.assertEquals("Terms of Use | Urban Ladder - Urban Ladder",getPageTitle());
			test.log(Status.PASS,"navigated to terms and services page");
		}
		catch(Exception e) {
			test.log(Status.INFO,"test failed");
			screenshot();
		}
	}

}
