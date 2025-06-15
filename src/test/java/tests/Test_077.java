package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_077 extends BaseClass{
	
	@Test
	void TC_077() throws Exception
	{
		try {
			test = extent.createTest("Verify The Search Bar With Spelling Mistake In Search Keywords");
			enterData(homeObject.searchBar,"soofa");
			test.log(Status.INFO,"entered text into search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			Assert.assertTrue(driver.findElement(By.xpath("//div[@id=\"search-results\"]//div[text()=\"No products found\"]")).isDisplayed());
			test.log(Status.PASS,"");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
