package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_127 extends BaseClass{
	
	@Test
	void TC_127() throws Exception
	{
		try {
			test = extent.createTest("Verify The Compare PopUp Appears On Adding A Product To Compare");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"study table");
            test.log(Status.INFO,"entered chair in search bar");
            click(homeObject.searchBtn);
            test.log(Status.INFO,"clicked on search button");
            hover(searchResultObject.firstProductImg);
            test.log(Status.INFO,"hovered over product");
            Thread.sleep(2000);
            click(driver.findElement(By.xpath("//li[1]//div[1]//div[5]//div[2]//a[1]")));
            Thread.sleep(2000);
            Assert.assertTrue(wishListObject.comparePopup.isDisplayed());
            test.log(Status.PASS,"compare popup displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
