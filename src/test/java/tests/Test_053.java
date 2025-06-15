package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_053 extends BaseClass{
	
	@Test(enabled=true,priority=1)
	void TC_001() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			Login();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.newArrivals);
			test.log(Status.INFO,"clicked on new arrivals");
			Assert.assertTrue(driver.getCurrentUrl().contains("oasis-collection"));
			test.log(Status.INFO,"navigated to oasis collection");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=2)
	void TC_002() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.sofas);
			test.log(Status.INFO,"clicked on sofas");
			Assert.assertTrue(driver.getCurrentUrl().contains("sofa"));
			test.log(Status.INFO,"navigated to sofas page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=3)
	void TC_003() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.sofacumbed);
			test.log(Status.INFO,"clicked on beds");
			Assert.assertTrue(driver.getCurrentUrl().contains("sofa-cum-bed"));
			test.log(Status.INFO,"navigated to beds page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=4)
	void TC_004() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.beds);
			test.log(Status.INFO,"clicked on beds");
			Assert.assertTrue(driver.getCurrentUrl().contains("bed"));
			test.log(Status.INFO,"navigated to beds page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=5)
	void TC_005() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.diningLink);
			test.log(Status.INFO,"clicked on dining");
			Assert.assertTrue(driver.getCurrentUrl().contains("dining-table-set"));
			test.log(Status.INFO,"navigated to dining page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=6)
	void TC_006() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.wardrobes);
			test.log(Status.INFO,"clicked on wardrobes");
			Assert.assertTrue(driver.getCurrentUrl().contains("wardrobes"));
			test.log(Status.INFO,"navigated to wardrobes page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=7)
	void TC_007() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.shoeracks);
			test.log(Status.INFO,"clicked on shoeracks");
			Assert.assertTrue(driver.getCurrentUrl().contains("shoe-rack"));
			test.log(Status.INFO,"navigated to shoe rack page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=8)
	void TC_008() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.boockshelves);
			test.log(Status.INFO,"clicked on bookshelves");
			Assert.assertTrue(driver.getCurrentUrl().contains("bookshelf"));
			test.log(Status.INFO,"navigated to shoe bookshelf page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
				
	}
	
	@Test(enabled=true,priority=9)
	void TC_009() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[1]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.tvunits);
			test.log(Status.INFO,"clicked on tv units");
			Assert.assertTrue(driver.getCurrentUrl().contains("tv-units"));
			test.log(Status.INFO,"navigated to shoe tv units page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}

	
	@Test(enabled=true,priority=10)
	void TC_010() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[2]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.recliners);
			test.log(Status.INFO,"clicked on decors");
			Assert.assertTrue(driver.getCurrentUrl().contains("recliners"));
			test.log(Status.INFO,"navigated to recliners page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=11)
	void TC_011() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[2]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.seatingLink);
			test.log(Status.INFO,"clicked on seating");
			Assert.assertTrue(driver.getCurrentUrl().contains("seating"));
			test.log(Status.INFO,"navigated to seating page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=12)
	void TC_012() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[2]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.coffeetable);
			test.log(Status.INFO,"clicked on coffee table");
			Assert.assertTrue(driver.getCurrentUrl().contains("coffee-table"));
			test.log(Status.PASS,"navigated to coffee table page");	
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}	
	}
	
	@Test(enabled=true,priority=13)
	void TC_013() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[2]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.studyLink);
			test.log(Status.INFO,"clicked on study");
			Assert.assertTrue(driver.getCurrentUrl().contains("study-room-furniture"));
			test.log(Status.INFO,"navigated to study room furniture page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
	@Test(enabled=true,priority=14)
	void TC_014() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[2]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.dealzn);
			test.log(Status.INFO,"clicked on deals zone");
			Assert.assertTrue(driver.getCurrentUrl().contains("top-deals"));
			test.log(Status.PASS,"navigated to top deals page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}			
	}
	
	@Test(enabled=true,priority=15)
	void TC_015() throws Exception
	{
		try {
			test = extent.createTest("verify category links");
			driver.navigate().back();
			test.log(Status.INFO, "user logged in");
			action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"categories row\"])[2]")));
			test.log(Status.INFO, "moved to category links");
			click(homeObject.store50);
			test.log(Status.INFO,"clicked on 50+ stores");
			Assert.assertTrue(driver.getCurrentUrl().contains("store-cities"));
			test.log(Status.PASS,"navigated to store cites page");		
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}
}
