package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_203 extends BaseClass{
	
	@Test
	void TC_203() throws Exception
	{
		try {
			test = extent.createTest("Verify The Voucher Option In Profile Dropdown Directs To Vouchers Page");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.vouchers);
			test.log(Status.INFO,"clicked on vouchers");
			Assert.assertTrue(driver.getCurrentUrl().contains("vouchers"));
			test.log(Status.PASS,"navigated to vouchers page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
