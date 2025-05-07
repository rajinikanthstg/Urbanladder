package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_033 extends BaseClass{
	
	@Test
	void TC_033() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of TrackOrder link on homepage");
			Login();
			test.log(Status.INFO,"Login sucessful");
			hover(homeObject.picon);
			test.log(Status.INFO,"Hovered ove profile icon");
			click(homeObject.orders);
			test.log(Status.INFO,"Clicked on track orders link");
			Assert.assertTrue(driver.getCurrentUrl().contains("orders"));
			test.log(Status.PASS,"Navigated to orders page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}
}
