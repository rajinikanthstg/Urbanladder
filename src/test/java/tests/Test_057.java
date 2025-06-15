package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_057 extends BaseClass{
	
	@Test(priority=1)
	void TC_001() throws Exception
	{
		try {
			test = extent.createTest("verify the 60-70% off image link in premium products at steal prizes");
			Login();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div")));
			test.log(Status.INFO,"moved to image");
			click(homeObject.imgLink1);
			test.log(Status.INFO,"clicked on image link");
			Assert.assertTrue(driver.getCurrentUrl().contains("furniture-at-60-70-ccs"));
			test.log(Status.PASS,"navigated to 60-70% off furniture page");
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
			test = extent.createTest("verify the 60-70% off shop now link in premium products at steal prizes");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div")));
			test.log(Status.INFO,"moved to image");
			click(homeObject.shopNowLink1);
			test.log(Status.INFO,"clicked on shop now link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Furniture at 60-70% OFF\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to 60 -70% off furniture page");
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
			test = extent.createTest("verify the 50-60% off image link in premium products at steal prizes");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div")));
			test.log(Status.INFO,"moved to image");
			click(homeObject.imgLink2);
			test.log(Status.INFO,"clicked on shop now link");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).isDisplayed());
			test.log(Status.PASS,"navigated to 50-60% off furniture page");
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
			test = extent.createTest("verify the 50-60% off shop now link in premium products at steal prizes");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div")));
			test.log(Status.INFO,"moved to image");
			click(homeObject.shopNowLink2);
			test.log(Status.INFO,"clicked on shop now link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Furniture at 50-60% OFF\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to 50-60% off furniture page");
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
			test = extent.createTest("verify the 40-50% off image link in premium products at steal prizes");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div")));
			test.log(Status.INFO,"moved to image");
			click(homeObject.imgLink2);
			test.log(Status.INFO,"clicked on shop now link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Furniture at 40-50% OFF\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to 40-50% off furniture page");
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
			test = extent.createTest("verify the 40-50% off shop now link in premium products at steal prizes");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div")));
			test.log(Status.INFO,"moved to image");
			click(homeObject.shopNowLink3);
			test.log(Status.INFO,"clicked on shop now link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Furniture at 40-50% OFF\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to 40-50% off furniture page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}

}
