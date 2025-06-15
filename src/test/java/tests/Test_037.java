package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_037 extends BaseClass {
	
	@Test
	void TC_037() throws Exception
	{
		try {
			test = extent.createTest("Verify The Functionality Of Header Alert Shop now Link");
			Login();
			click(homeObject.headerAlert);
			
			System.out.println(driver.getCurrentUrl().contains("ticker"));
			System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			test.log(Status.FAIL,"test failed");
			screenshot();
		}
		
	}
}
