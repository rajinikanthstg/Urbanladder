package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_043 extends BaseClass{
	
	@Test
	void TC_043() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of User Profile Icon");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
		}
		catch(Exception e){
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
