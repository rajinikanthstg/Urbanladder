package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_046 extends BaseClass{
	
	@Test()
	void TC_046() throws Exception
	{
		try {
			test = extent.createTest("Verify The Visibility Of Category Links");
			
			Login();
			test.log(Status.INFO,"user logged in");
			
			checkDropdown(homeObject.oasisCollection,homeObject.oasisDropdown);
			
			checkDropdown(homeObject.dealsZone,homeObject.dealzoneDropdown);
			
			checkDropdown(homeObject.sofasRecliners,homeObject.sofasDropdown);
			
			checkDropdown(homeObject.living,homeObject.livingDropdown);			
			
			checkDropdown(homeObject.bedroomMattresses,homeObject.bedroomMattressesDropdown);
			
			checkDropdown(homeObject.dining,homeObject.diningDropdown);
			
			checkDropdown(homeObject.storageFurniture,homeObject.storageFurnitureDropdown);
			
			checkDropdown(homeObject.study,homeObject.studyDropdown);
			
			checkDropdown(homeObject.lightDecor,homeObject.lightingdropdown);
			
			checkDropdown(homeObject.interiors,homeObject.interiorsDropdown);
			
			checkDropdown(homeObject.stores,homeObject.storesDropdown);
			
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}

}
