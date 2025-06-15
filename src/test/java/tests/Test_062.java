package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_062 extends BaseClass{
	
	@Test(priority=1)
	void TC_001() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in banglore");
//			Login();
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.bangloreStore);
			test.log(Status.INFO,"clicked on Banglore");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Bangalore"));
			test.log(Status.PASS,"navigated to stores in Bangalore");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
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
			test = extent.createTest("verify the stores in Delhi & NCR");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.delhiStore);
			test.log(Status.INFO,"clicked on Delhi & NCR");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Delhi & NCR"));
			test.log(Status.PASS,"navigated to stores in Delhi & NCR");
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
			test = extent.createTest("verify the stores in Mumbai");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.mumbaiStore);
			test.log(Status.INFO,"clicked on Mumbai");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Mumbai"));
			test.log(Status.PASS,"navigated to stores in Mumbai");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
		
	}
	
	@Test(priority=4)
	void TC_004() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in Hyderabad");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.nextStore);
			test.log(Status.INFO,"clicked on next store");
			click(homeObject.hyderabadstore);
			test.log(Status.INFO,"clicked on Hyderabad");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Hyderabad"));
			test.log(Status.PASS,"navigated to stores in Hyderabad");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(priority=5)
	void TC_005() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in Chennai");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.chennaiStore);
			test.log(Status.INFO,"clicked on Chennai");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Chennai"));
			test.log(Status.PASS,"navigated to stores in Chennai");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(priority=6)
	void TC_006() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in Pune");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.puneStore);
			test.log(Status.INFO,"clicked on Pune");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Pune"));
			test.log(Status.PASS,"navigated to stores in Pune");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(priority=7)
	void TC_007() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in Kolkata");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			click(homeObject.nextStore);
			test.log(Status.INFO,"clicked on next store button");
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.kolkataStore);
			test.log(Status.INFO,"clicked on Kolkata");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
//			Assert.assertTrue(driver.getTitle().contains("Urban Ladder Furniture Store in Kolkata"));
			test.log(Status.PASS,"navigated to stores in Kolkata");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(priority=8)
	void TC_008() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in Kochi");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.kochiStore);
			test.log(Status.INFO,"clicked on Kochi");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("Furniture Stores In Kochi"));
			test.log(Status.PASS,"navigated to stores in Kochi");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(priority=9)
	void TC_009() throws Exception
	{
		try {
			test = extent.createTest("verify the stores in all stores");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.storeLinks);
			test.log(Status.INFO,"scrolled to stores");
			click(homeObject.allStores);
			test.log(Status.INFO,"clicked on all stores");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getTitle().contains("City Pages"));
			test.log(Status.PASS,"navigated to city pages");
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
