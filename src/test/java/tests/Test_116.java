package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_116 extends BaseClass{
	
	@Test
	void TC_116() throws Exception
	{
		try {
			test = extent.createTest("Verify The Change Link In Delivery Address");
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
			click(productPageObject.change);
			test.log(Status.INFO,"clicked on change button");
			enterData(productPageObject.pincode,"500097");
			test.log(Status.INFO,"entered a pincode");
			click(productPageObject.check);
			test.log(Status.INFO,"clicked on check button");
			click(productPageObject.change);
			Assert.assertFalse(productPageObject.invalidPin.isDisplayed());
			test.log(Status.PASS,"pincode identified successfuly");				
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
