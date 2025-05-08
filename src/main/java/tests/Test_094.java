package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_094 extends BaseClass{
	
	@Test(priority=1)
	void TC_094() throws Exception
	{
		try {
			test = extent.createTest("Verify The Navigation To Product Page On Clicking The Product In Homepage");
			Login();
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn1);
			test.log(Status.INFO,"clicked on shop now");
			Thread.sleep(5000);
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(searchResultObject.productBreadcrumb.isDisplayed());
			test.log(Status.PASS,"navigated to product page");
			driver.close();
			driver.switchTo().window(windows.get(0));
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}
	
	@Test(priority=2)
	void TC_002() throws Exception
	{
		try {
			test = extent.createTest("Verify The Navigation To Product Page On Clicking The Product In Homepage");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn2);
			test.log(Status.INFO,"clicked on shop now");
			Thread.sleep(5000);
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(searchResultObject.productBreadcrumb.isDisplayed());
			test.log(Status.PASS,"navigated to product page");
			driver.close();
			driver.switchTo().window(windows.get(0));
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}
	
	@Test(priority=3)
	void TC_003() throws Exception
	{
		try {
			test = extent.createTest("Verify The Navigation To Product Page On Clicking The Product In Homepage");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn3);
			test.log(Status.INFO,"clicked on shop now");
			Thread.sleep(5000);
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(searchResultObject.productBreadcrumb.isDisplayed());
			test.log(Status.PASS,"navigated to product page");
			driver.close();
			driver.switchTo().window(windows.get(0));
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}

}
