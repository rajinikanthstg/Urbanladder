package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_047_05 extends BaseClass{
	
	@Test
	void TC_047_05()
	{
		try {
			test = extent.createTest("verify ctegory links");
			Login();
			test.log(Status.INFO,"user logged in");
			
			
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
			
			hover(homeObject.bedroomMattresses);
			test.log(Status.INFO,"hovered over bedroom and mattresses");
			click(homeObject.allBeds);
			test.log(Status.INFO,"clicked on all beds");
			Assert.assertTrue(driver.getCurrentUrl().contains("all-beds"));
			test.log(Status.PASS,"navigated to all beds page");
			
			hover(homeObject.bedroomMattresses);
			test.log(Status.INFO,"hovered over bedroom and mattresses");
			click(homeObject.mattresses);
			test.log(Status.INFO,"clicked on all mattresses");
			Assert.assertTrue(driver.getCurrentUrl().contains("mattresses"));
			test.log(Status.PASS,"navigated to mattresses page");
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
		}
		
	}

}
