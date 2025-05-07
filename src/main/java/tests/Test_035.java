package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_035 extends BaseClass{
	
	@Test
	void TC_035() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Bulk Orders Link");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.bulkOrders);
			Assert.assertTrue(driver.getCurrentUrl().contains("institutional-business"));
			test.log(Status.PASS,"navigated to bulk orders page");					
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
}
