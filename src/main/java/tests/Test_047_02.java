package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_047_02 extends BaseClass{
	
		@Test
		void TC_047_02() throws Exception
		{				
			try {
				test = extent.createTest("Verify The Functionality Of Main Category Links");
				Login();
				test.log(Status.INFO,"user logged in");
				hover(homeObject.sofasRecliners);
				test.log(Status.INFO,"hovered over sofas and recliners");
				click(homeObject.sofaSet);
				test.log(Status.INFO,"clicked on sofa set");
				Assert.assertTrue(driver.getTitle().contains("Sofa Set"));
				test.log(Status.PASS,"navigated to Sofa set page");

				hover(homeObject.sofasRecliners);
				test.log(Status.INFO,"hovered over sofas and recliners");
				click(homeObject.reclinerSofas);
				test.log(Status.INFO,"clicked on recliner sofas");
				Assert.assertTrue(driver.getCurrentUrl().contains("recliner-sofas"));
				test.log(Status.PASS,"navigated to recliner sofas page");
				
				hover(homeObject.sofasRecliners);
				test.log(Status.INFO,"hovered over sofas and recliners");
				click(homeObject.sofabed);
				test.log(Status.INFO,"clicked on sofa bed");
				Assert.assertTrue(driver.getCurrentUrl().contains("sofa-bed"));
				test.log(Status.PASS,"navigated to sofa bed page");
				
				hover(homeObject.sofasRecliners);
				test.log(Status.INFO,"hovered over sofas and recliners");
				click(homeObject.seating);
				test.log(Status.INFO,"clicked on seating");
				Assert.assertTrue(driver.getCurrentUrl().contains("seating"));
				test.log(Status.PASS,"navigated to seating page");			
				
			}
			catch(Exception e) {
				test.log(Status.FAIL,"test failed");
				screenshot();
			}
		}
	

}
