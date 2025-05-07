package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_065 extends BaseClass {
	
	@Test
	void TC_065() throws Exception
	{
		try {
			test = extent.createTest("Verify The Links In 'Explore More'");
			scrollToView(homeObject.footerLinks);
			test.log(Status.INFO,"scrolled to footer links");
			click(homeObject.referAndEarn);
			test.log(Status.INFO,"clicked on reffer and earn");
			Assert.assertTrue(driver.getCurrentUrl().contains("refer_and_earn"));
			test.log(Status.PASS,"navigated to refer and earn");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
