package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_047_03 extends BaseClass{
	
	@Test
	void TC_047()
	{
		try {
			test = extent.createTest("Verify The Functionality Of Main Category Links");
			Login();
			hover(homeObject.living);
			test.log(Status.INFO,"hovered over living");
			click(homeObject.tables);
			test.log(Status.INFO,"clicked on tables");
			Assert.assertTrue(driver.getCurrentUrl().contains("tables"));
			test.log(Status.PASS,"navigated to tables page");
			
			hover(homeObject.living);
			test.log(Status.INFO,"hovered over living");
			click(homeObject.livingstorage);
			test.log(Status.INFO,"clicked on living storage");
			Assert.assertTrue(driver.getCurrentUrl().contains("living-storage"));
			test.log(Status.PASS,"navigated to living storage page");
			
			hover(homeObject.living);
			test.log(Status.INFO,"hovered over living");
			click(homeObject.livingseating);
			test.log(Status.INFO,"clicked on seating");
			Assert.assertTrue(driver.getCurrentUrl().contains("living_seating"));
			test.log(Status.PASS,"navigated to seating page");
			
			hover(homeObject.living);
			test.log(Status.INFO,"hovered over living");
			click(homeObject.outdoor);
			test.log(Status.INFO,"clicked on outdoor");
			Assert.assertTrue(driver.getCurrentUrl().contains("outdoor"));
			test.log(Status.PASS,"navigated to outdoor page");
			
			hover(homeObject.living);
			test.log(Status.INFO,"hovered over living");
			click(homeObject.livingOasisCollec);
			test.log(Status.INFO,"clicked on oasis collection");
			Assert.assertTrue(driver.getCurrentUrl().contains("oasis-collection"));
			test.log(Status.PASS,"navigated to oasis collection page");	
			
			
			
		}
		catch(Exception e) {
			
		}
	}

}
