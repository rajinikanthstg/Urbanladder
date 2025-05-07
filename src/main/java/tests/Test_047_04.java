package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_047_04 extends BaseClass {
	
	@Test
	void TC_047_04()
	{
		test = extent.createTest("verify main categories links");
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
		
		hover(homeObject.bedroomMattresses);
		test.log(Status.INFO,"hovered over bedroom and mattresses");
		click(homeObject.storage);
		test.log(Status.INFO,"clicked on storage and accessories");
		Assert.assertTrue(driver.getCurrentUrl().contains("storage-accessories"));
		test.log(Status.PASS,"navigated to storage & accessories page");
		
		hover(homeObject.dining);
		test.log(Status.INFO,"hovered over Dining");
		click(homeObject.storageBarfurniture);
		test.log(Status.INFO,"clicked on storage and Bar Furniture");
		Assert.assertTrue(driver.getCurrentUrl().contains("storage-bar-furniture"));
		test.log(Status.PASS,"navigated to storage & bar furniture page");
		
		hover(homeObject.dining);
		test.log(Status.INFO,"hovered over Dining");
		click(homeObject.storageBarfurniture);
		test.log(Status.INFO,"clicked on storage and Bar Furniture");
		Assert.assertTrue(driver.getCurrentUrl().contains("storage-bar-furniture"));
		test.log(Status.PASS,"navigated to storage & bar furniture page");
		
		hover(homeObject.dining);
		test.log(Status.INFO,"hovered over Dining");
		click(homeObject.dinigtableset);
		test.log(Status.INFO,"clicked Dining Table Set");
		Assert.assertTrue(driver.getCurrentUrl().contains("dining-table-set"));
		test.log(Status.PASS,"navigated to dining table set page");
		
		hover(homeObject.storageFurniture);
		test.log(Status.INFO,"hovered over Storage Furniture");
		click(homeObject.livingStorage);
		test.log(Status.INFO,"clicked Living storage");
		Assert.assertTrue(driver.getCurrentUrl().contains("living-storage"));
		test.log(Status.PASS,"navigated to living storage page");
		
		hover(homeObject.storageFurniture);
		test.log(Status.INFO,"hovered over Storage Furniture");
		click(homeObject.bedroomStorage);
		test.log(Status.INFO,"clicked Bedroom storage");
		Assert.assertTrue(driver.getCurrentUrl().contains("bedroom-storage"));
		test.log(Status.PASS,"navigated to bedroom storage page");
		
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

}
