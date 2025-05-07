package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_097 extends BaseClass{
	
	@Test
	void TC_097() throws Exception
	{
		try {
			test = extent.createTest("Verify The Product Image Is Displayed in product page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered on product in search results");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on product view button");
			Thread.sleep(5000);
			List<String> windows = WindowHandles();
			if(windows.size()==2)
				driver.switchTo().window(windows.getLast());
			Assert.assertTrue(driver.findElement(By.cssSelector("div[id='sofaoverview-7496'] li:nth-child(2) img:nth-child(1)")).isDisplayed());
			test.log(Status.PASS,"product image displayed");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
