package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_060 extends BaseClass {
	
	@Test(priority=1)
	void TC_001() throws Exception
	{
		try {
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
//			Login();
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn1);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Adria Copa"));
			test.log(Status.PASS,"navigated to Adria Copa");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn2);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Aurelia Engineered"));
			test.log(Status.PASS,"navigated to Aurelia Engineered");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
			test.log(Status.INFO,"switched to parent window");
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn3);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Belle Round"));
			test.log(Status.PASS,"navigated to Belle Round");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.nextArrow);
			click(homeObject.arrBtn4);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Jean Solid"));
			test.log(Status.PASS,"navigated to jean solid");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn5);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Marlowe One"));
			test.log(Status.PASS,"navigated to Marlowe One");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn6);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Nina Solid"));
			test.log(Status.PASS,"navigated to Nina Solid");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.nextArrow);
			click(homeObject.arrBtn7);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getTitle().contains("Niyo Swivel"));
			test.log(Status.PASS,"navigated to Niyo Swivel");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
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
			test = extent.createTest("Verify The Shop Now Links In New Arrivals");
			test.log(Status.INFO, "user logged in");
			scrollToElement(homeObject.arrivalSection);
			test.log(Status.INFO,"scrolled to arrivals");
			click(homeObject.arrBtn8);
			test.log(Status.INFO,"clicked on shop now");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.getCurrentUrl().contains("nolan-fabric-sofa"));
			test.log(Status.PASS,"navigated to Nolan");
			driver.close();
			driver.switchTo().window(windows.getFirst());	
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}

}
