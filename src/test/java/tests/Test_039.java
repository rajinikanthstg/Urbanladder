package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_039 extends BaseClass{
	
	@Test
	void TC_039() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Uban Ladder Logo");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.logo);
			Assert.assertEquals(driver.getCurrentUrl(),"https://www.urbanladder.com/");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}
}
