package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_114 extends BaseClass{
	
	@Test
	void TC_114() throws Exception
	{
		try {
			test = extent.createTest("Verify The View Plans Button In EMI plans And Offers");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			driver.switchTo().frame("rzpAffordabilityMainFrame");
			click(productPageObject.viewPlans);
			test.log(Status.INFO,"clicked on view plans");
			driver.switchTo().parentFrame();
			driver.switchTo().frame("rzpAffordabilityDetailFrame");
			Assert.assertTrue(productPageObject.sidebar.isDisplayed());
			test.log(Status.PASS,"emi plans section displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
