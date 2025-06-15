package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_056 extends BaseClass{
	
	@Test(priority=1,description="Verify The Links In Shop The Full Look")
	void TC_001() throws Exception
	{
		try {
			test = extent.createTest("verify the collection range image link");
			Login();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(homeObject.collectRangeImg1);
			click(homeObject.collectRangeImg1);
			test.log(Status.INFO,"clicked on image1");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("New-collections"));
			test.log(Status.PASS,"navigated to new collections");
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
			test = extent.createTest("verify the collection range explore now link");
			action.moveToElement(homeObject.cExplore1);
			click(homeObject.cExplore1);
			test.log(Status.INFO,"clicked on explore now");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("New-collections"));
			test.log(Status.PASS,"navigated to new collections");
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
			test = extent.createTest("verify the collection range image link");
			action.moveToElement(homeObject.collectRangeImg2);
			click(homeObject.collectRangeImg2);
			test.log(Status.INFO,"clicked on image link");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("Brie Fabric Sofa"));
			test.log(Status.PASS,"navigated to new collections");
			driver.close();
			driver.switchTo().window(windows.get(0));
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
			test = extent.createTest("verify the collection range image link");
			action.moveToElement(homeObject.cExplore2);
			click(homeObject.cExplore2);
			test.log(Status.INFO,"clicked on image link");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("Brie Fabric Sofa"));
			test.log(Status.PASS,"navigated to new collections");
			driver.close();
			driver.switchTo().window(windows.get(0));
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
			test = extent.createTest("verify the collection range image link");
			action.moveToElement(homeObject.collectRangeImg3);
			click(homeObject.collectRangeImg3);
			test.log(Status.INFO,"clicked on image link");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("Mia Fabric Sofa"));
			test.log(Status.PASS,"navigated to new collections");
			driver.close();
			driver.switchTo().window(windows.get(0));
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
			test = extent.createTest("verify the collection range image link");
			action.moveToElement(homeObject.cExplore3);
			click(homeObject.cExplore3);
			test.log(Status.INFO,"clicked on image link");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Mia Fabric Sofa"));
			
			test.log(Status.PASS,"navigated to new collections");
			driver.close();
			driver.switchTo().window(windows.get(0));
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
			test = extent.createTest("verify the collection range image link");
			action.moveToElement(homeObject.collectRangeImg4);
			click(homeObject.collectRangeImg4);
			test.log(Status.INFO,"clicked on image link");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("Gretta Fabric Sofa"));
			test.log(Status.PASS,"navigated to new collections");
			driver.close();
			driver.switchTo().window(windows.get(0));
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
			test = extent.createTest("verify the collection range image link");
			action.moveToElement(homeObject.cExplore4);
			click(homeObject.cExplore4);
			test.log(Status.INFO,"clicked on image link");
			List<String> windows = WindowHandles();	
			driver.switchTo().window(windows.get(1));
			Assert.assertTrue(driver.getTitle().contains("Gretta Fabric Sofa"));
			test.log(Status.PASS,"navigated to new collections");
			driver.close();
			driver.switchTo().window(windows.get(0));
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
