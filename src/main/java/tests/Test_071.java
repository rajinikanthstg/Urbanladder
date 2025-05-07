package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;
import libraries.ExcelBase;

public class Test_071 extends BaseClass{
	
	List<WebElement> popularDecor = null;
	int i =0;
	
	@BeforeTest
	void setData() throws Exception
	{	
		filename = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		sheet = "PopularDecor";
		
		totalRows = ExcelBase.totalRowCount(filename, sheet);
		cellCount = ExcelBase.totalCellsCount(filename, sheet, totalRows);
		
		popularDecor = homeObject.popularDecor;
	}
	
	@Test(dataProvider="readExcel")
	void TC_071(String title) throws Exception
	{		
		try {
			test = extent.createTest("verify the "+popularDecor.get(i).getText()+" link");
			scrollToElement(homeObject.popularDecorCat);
			test.log(Status.INFO,"scrolled to popular decor categories");
			click(popularDecor.get(i));
			test.log(Status.INFO,"clicked on "+popularDecor.get(i++).getText());
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[@class=\"withsubtext\"]")).isDisplayed());
			Assert.assertEquals(driver.findElement(By.xpath("//h1[@class=\"withsubtext\"]")).getText(),title);
			driver.close();
			driver.switchTo().window(windows.getFirst());
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
		
	}

}
