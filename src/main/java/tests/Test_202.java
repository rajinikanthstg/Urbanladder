package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_202 extends BaseClass{
	
	@Test
	void TC_202() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Orders Option In Profile Dropdown Displays The Orders Page");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.orders);
			test.log(Status.INFO,"clicked on orders");
			Assert.assertTrue(driver.getCurrentUrl().contains("orders"));
			test.log(Status.PASS,"navigated to orders page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
