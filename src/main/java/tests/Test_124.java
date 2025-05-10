package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_124 extends BaseClass{
	
	@Test
	void TC_124() throws Exception
	{
		try {
			test = extent.createTest("Verify That Two Different Products From Different Categories Cannot Be Added To Compare");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"lamp");
			test.log(Status.INFO,"entered lamp in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			scrollToView(homeObject.searchBar);
			enterData(homeObject.searchBar,"chair");
			click(homeObject.searchBtn);
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			Thread.sleep(3000);
			Assert.assertTrue(addToComparePopup.errorMessage.isDisplayed());
			String msg = addToComparePopup.errorMessage.getText().replace("GOT IT","").trim();
			test.log(Status.PASS,"error message displayed: "+msg);
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
