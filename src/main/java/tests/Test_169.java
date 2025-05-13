package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_169 extends BaseClass{
	
	@Test
	void TC_169() throws Exception
	{
		try {
			test = extent.createTest("Verify The Help Link In Cart Directs To The Help Page");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon");
			click(cartObject.help);
			test.log(Status.INFO,"clicked on help link");
			Assert.assertTrue(driver.getCurrentUrl().contains("help"));
			test.log(Status.PASS,"navigated to help page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
