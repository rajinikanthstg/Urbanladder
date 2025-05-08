package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;


public class Test_123 extends BaseClass{
	
	@Test
	void TC_123() throws Exception
	{
		try {
			test = extent.createTest("Verify That Two Different Products Of Same Category Can Be Added To Compare");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"study lamp");
			test.log(Status.INFO,"entered lamp in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			driver.navigate().back();
			hover(driver.findElement(By.xpath("(//a[@class=\"product-img\"])[2]")));
			test.log(Status.INFO,"hovered over second product");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[2]")));
			test.log(Status.INFO,"clicked on second product");
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			Thread.sleep(5000);
			Assert.assertEquals(addToComparePopup.compareProducts.size(),2);
			test.log(Status.PASS,"products added to compare");		
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
