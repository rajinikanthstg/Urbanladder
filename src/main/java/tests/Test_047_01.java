package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_047_01 extends BaseClass {
	
	@Test
	void TC_047_01() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Main Category Links");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.oasisCollection);
			test.log(Status.INFO,"hovered over oasis collection");
			click(homeObject.exploreOasis);
			Assert.assertTrue(driver.getTitle().contains("Explore Oasis"));
			test.log(Status.PASS,"navigated to explore oasis page");
			
			hover(homeObject.dealsZone);
			test.log(Status.INFO,"hovered over deals zone");
			click(homeObject.topDeals);
			Assert.assertTrue(driver.getTitle().contains("Top Deals"));
			test.log(Status.PASS,"navigated to top deals");
			
			hover(homeObject.dealsZone);
			test.log(Status.INFO,"hovered over deals zone");
			click(homeObject.allFurniture);
			test.log(Status.INFO,"clicked on all furniture");
			Assert.assertTrue(driver.getCurrentUrl().contains("all-furniture"));
			test.log(Status.PASS,"navigated to all furniture page");
			driver.close();
			
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
	}
	
}
