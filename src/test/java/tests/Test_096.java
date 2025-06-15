package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_096 extends BaseClass {
	
	@Test
	void TC_096() throws Exception
	{
		try {
			test = extent.createTest("Verify The Product Name Is Displayed");
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
				driver.switchTo().window(windows.get(1));
			scrollToView(driver.findElement(By.xpath("//section[@class='header__topBar_sectionLeft']")));
			Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Weston Half Leather Sofa (Licorice Italian Leather')]")).isDisplayed());
			test.log(Status.PASS,"product title displayed");	
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL, "test failed");
		}
	}

}
