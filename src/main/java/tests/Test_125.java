package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_125 extends BaseClass{
	
	@Test
	void TC_125() throws Exception
	{
		try {
			test = extent.createTest("Verify That Three Products Can Not Be Added To Compare");
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
			Thread.sleep(3000);
			driver.navigate().back();
			hover(driver.findElement(By.xpath("(//a[@class=\"product-img\"])[3]")));
			test.log(Status.INFO,"hovered over second product");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[3]")));
			test.log(Status.INFO,"clicked on third product");
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			Thread.sleep(3000);
			Assert.assertTrue(addToComparePopup.errorMessage2.isDisplayed());
			test.log(Status.PASS,"error message displayed");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
