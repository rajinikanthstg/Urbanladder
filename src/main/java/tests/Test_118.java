package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_118 extends BaseClass{
	
	@Test
	void TC_118() throws Exception
	{
		try {
			test = extent.createTest("Verify The Logo Navigates To Homepage On Clicking");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"table");
			test.log(Status.INFO,"entered table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			click(homeObject.logo);
			test.log(Status.INFO,"clicked on logo");
			Assert.assertTrue(homeObject.picon.isDisplayed());
			test.log(Status.PASS,"naigated to home page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
