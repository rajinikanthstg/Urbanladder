package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_144 extends BaseClass{
	
	@Test
	void TC_144() throws Exception
	{
		try {
			test = extent.createTest("Verify That Wishlist Icon On Homepage Directs To Wishlist Page");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.whishList);
			test.log(Status.INFO,"clicked on wishlist icon");
			String title = driver.getCurrentUrl();
			Assert.assertTrue(title.contains("wishlist"));
			test.log(Status.PASS,"navigated to wishlist");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
