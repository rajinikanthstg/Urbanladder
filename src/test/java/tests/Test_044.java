package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_044 extends BaseClass{
	
	@Test
	void TC_044() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Wishlist Icon");
			Login();
			click(homeObject.whishList);
			test.log(Status.INFO, "clicked on wishlist");
			Assert.assertTrue(driver.getCurrentUrl().contains("wishlist"));
			test.log(Status.PASS,"navigated to wishlist");			
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
