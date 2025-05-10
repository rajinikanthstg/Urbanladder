package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_164 extends BaseClass{
	
	@Test
	void TC_164() throws Exception
	{
		try {
			test = extent.createTest("Verify That Track Order Link Directs To The Orders Page");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon");
			click(cartObject.trackOrder);
			test.log(Status.INFO,"clicked on track order link");
			Assert.assertTrue(driver.getCurrentUrl().contains("orders"));
			test.log(Status.PASS,"navigated to orders page");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
