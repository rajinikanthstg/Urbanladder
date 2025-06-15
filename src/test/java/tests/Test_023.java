package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_023 extends BaseClass{
	
	@Test(description="",priority=9)
	void TC_023() throws Exception
	{
		try {
			test = extent.createTest("Verify The Privacy & Legal Policy Link On Login PopUp");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.loginOption);
			test.log(Status.INFO,"clicked on login option");
			click(loginObject.privacyPolicy);
			test.log(Status.INFO,"clicked on privacy policy");
			Assert.assertEquals("Privacy Policy | Urban Ladder - Urban Ladder", getPageTitle());
			test.log(Status.PASS,"navigated to privacy policy");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
