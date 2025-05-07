package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_045 extends BaseClass{
	
	@Test
	void TC_045() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Cart Icon");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
			test.log(Status.PASS,"navigated to cart");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}

}
