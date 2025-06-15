package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_055 extends BaseClass{
	
	@Test(priority=1,description="Verify The Functionality Of Category Links In Our Bestsellers, Handpicked Just for You")
	void TC_001() throws Exception
	{
		try {
			test = extent.createTest("verify loungue chair image link");
			Login();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(homeObject.floorLamps);
			click(homeObject.loungueChairs);
			test.log(Status.INFO,"clicked on loungue chairs image link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Lounge Chairs\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to lounge chairs page");
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
			test = extent.createTest("verify carpet image link");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(homeObject.floorLamps);
			click(homeObject.carpets);
			test.log(Status.INFO,"clicked on carpet image link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Carpets\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to carpets page");
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
			test = extent.createTest("verify shoe racks image link");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(homeObject.floorLamps);
			click(homeObject.shoeRacksLink);
			test.log(Status.INFO,"clicked on shoe racks image link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Shoe Racks\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to shoe racks page");
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
			test = extent.createTest("verify lamp floors image link");
			driver.navigate().back();
			test.log(Status.INFO,"user logged in");
			action.moveToElement(homeObject.floorLamps);
			click(homeObject.floorLamps);
			test.log(Status.INFO,"clicked on lamp floor image link");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Floor Lamps\"]")).isDisplayed());
			test.log(Status.PASS,"navigated to floor lamps page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

}
