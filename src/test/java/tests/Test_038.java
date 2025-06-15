package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_038 extends BaseClass{
	
	@Test
	void TC_038() throws Exception
	{
		try {
			test = extent.createTest("Verify The Visibility Of Urban Ladder Logo");
			Login();
			test.log(Status.INFO,"user logged in");
			Assert.assertTrue(homeObject.logo.isEnabled());
			test.log(Status.PASS,"logo is enabled");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
		
	}

}
