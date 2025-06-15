package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_008 extends BaseClass{
	
	@Test
	void TC_008()
	{
		try {
			test = extent.createTest("Verify The Privacy & Legal Policy Link On Signup PopUp");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered over profile icon");
			click(landingObject.signupOption);
			test.log(Status.INFO,"clicked on signup");
			click(signupObject.privacyPolicy);
			test.log(Status.INFO,"clicked on privacy policy");
			Assert.assertEquals("Privacy Policy | Urban Ladder - Urban Ladder",getPageTitle());
			test.log(Status.PASS,"navigated to privacy policy");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
		}
	}

}
