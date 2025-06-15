package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_146 extends BaseClass{
	
	@Test
	void TC_146() throws Exception
	{
		try {
			test = extent.createTest("Verify The Logo Navigates To Homepage On Clicking from wishlist");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.whishList);
			test.log(Status.INFO,"clicked on wishlist icon");
			scrollToView(homeObject.logo);
			test.log(Status.INFO,"scrolled to logo");
			click(homeObject.logo);
			test.log(Status.INFO,"clicked on logo");
			Assert.assertTrue(driver.getCurrentUrl().equals("https://www.urbanladder.com/"));
			test.log(Status.PASS,"navigated to homepage");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
