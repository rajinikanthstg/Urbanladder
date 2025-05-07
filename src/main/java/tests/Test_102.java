package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_102 extends BaseClass{
	
	@Test
	void TC_102() throws Exception
	{
		try {
			test = extent.createTest("Verify The Add To Compare Icon In Product Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"table");
			test.log(Status.INFO,"entered table in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			String product = productPageObject.productTitle.getText();
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			String cproduct = addToComparePopup.compareProducts.get(0).getText();
			Assert.assertEquals(product,cproduct);
			test.log(Status.PASS,cproduct+" added to compare");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
