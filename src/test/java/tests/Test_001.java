package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_001 extends BaseClass{
	
	@Test
	void TC_001() throws Exception
	{
		try {
			
			test = extent.createTest("Verify The Signup Button Is Showing The Signup PopUp On Clicking");
			hover(landingObject.profileIcon);
			test.log(Status.INFO,"hovered on profile icon");
			click(landingObject.signupOption);
			test.log(Status.INFO,"clicked on signup option");
			
			ExplicitWait(signupObject.signupText);
			test.log(Status.INFO,"signup text visible");
			
			Assert.assertTrue(signupObject.signupText.isDisplayed());
		}
		catch(Exception e) {
			
			screenshot();
			test.log(Status.FAIL,"Signup Button Test Failed");
		}
		
	}

}
