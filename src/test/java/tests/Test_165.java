package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_165 extends BaseClass{
	
	@Test
	void TC_165() throws Exception
	{
		try {
			test = extent.createTest("Verify The My Account Dropdown In Cart");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon");
			hover(cartObject.myAccount);
			test.log(Status.INFO,"hovered over my account");
			click(cartObject.myAccountOptions.get(0));
			test.log(Status.INFO,"clicked on profile");
			Assert.assertTrue(driver.getCurrentUrl().contains("profile"));
			test.log(Status.PASS,"navigated to profile page");
			driver.navigate().back();
			test.log(Status.INFO,"navigated to cart page");
			hover(cartObject.myAccount);
			test.log(Status.INFO,"hovered over my account");
			click(cartObject.myAccountOptions.get(1));
			test.log(Status.INFO,"clicked on orders");
			Assert.assertTrue(driver.getCurrentUrl().contains("orders"));
			test.log(Status.PASS,"navigated to orders");
			driver.navigate().back();
			test.log(Status.INFO,"navigated to cart page");
			hover(cartObject.myAccount);
			test.log(Status.INFO,"hovered over my account");
			click(cartObject.myAccountOptions.get(2));
			test.log(Status.INFO,"clicked on wishlist");
			Assert.assertTrue(driver.getCurrentUrl().contains("wishlists"));
			test.log(Status.PASS,"navigated to wishlist");
			driver.navigate().back();
			test.log(Status.INFO,"navigated to cart page");
			hover(cartObject.myAccount);
			test.log(Status.INFO,"hovered over my account");
			click(cartObject.myAccountOptions.get(3));
			test.log(Status.INFO,"clicked on vouchers");
			Assert.assertTrue(driver.getCurrentUrl().contains("vouchers"));
			test.log(Status.PASS,"navigated to vouchers");
			driver.navigate().back();
			test.log(Status.INFO,"navigated to cart page");
			hover(cartObject.myAccount);
			test.log(Status.INFO,"hovered over my account");
			click(cartObject.logout);
			test.log(Status.INFO,"clicked on logout");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(landingObject.loginOption.isDisplayed());
			test.log(Status.PASS,"user loged out");		
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
