package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_113 extends BaseClass{
	
	@Test
	void TC_113() throws Exception
	{
		try {
			test = extent.createTest("Verify The Read more Link In Featured Testimonials");
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
			scrollToElement(driver.findElement(By.cssSelector(".source")));
			boolean result = driver.findElement(By.cssSelector(".source")).getTagName().equals("a");
			Assert.assertTrue(result);
			test.log(Status.PASS,"link is enabled");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
