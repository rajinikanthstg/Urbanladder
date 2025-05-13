package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_170 extends BaseClass{
	
	@Test
	void TC_170() throws Exception
	{
		try {
			test = extent.createTest("Verify The Logo Navigates To Homepage On Clicking");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon");
			click(cartObject.logo);
			test.log(Status.INFO,"clicked on logo");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.PASS,"navigated to homepage");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
