package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_079 extends BaseClass {
	
	@Test
	void TC_079() throws Exception
	{
		try {
			test = extent.createTest("Verify The Search Bar With Empty String");
			enterData(homeObject.searchBar," ");
			test.log(Status.INFO,"entered empty string in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			Assert.assertTrue(driver.findElement(By.xpath("//div[@id=\"search-results\"]//div[text()=\"No products found\"]")).isDisplayed());
			test.log(Status.PASS,"no search results shown");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
