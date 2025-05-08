package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_145 extends BaseClass{
	
	@Test
	void TC_145() throws Exception
	{
		try {
			test = extent.createTest("Verify That Wishlist Link In Cart Directs To Wishlist Page");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"navigated to cart page");
			click(cartObject.wishList);
			test.log(Status.INFO,"clicked on wishlist link");
			String title = driver.getCurrentUrl();
			Assert.assertTrue(title.contains("wishlist"));
			test.log(Status.PASS,"navigated to wishlist page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
