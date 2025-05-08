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

public class Test_069 extends BaseClass{
	
	List<WebElement> popularLinks = null;
	int i =0;
	
	@BeforeTest
	void setData() throws Exception
	{	
		filename = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		sheet = "PopularFurniture";
		
		totalRows = ExcelBase.totalRowCount(filename, sheet);
		cellCount = ExcelBase.totalCellsCount(filename, sheet, totalRows);
		
		popularLinks = homeObject.popularLinks;
	}
	
	@Test(dataProvider="readExcel")
	void TC_069(String title) throws Exception
	{
		try {
			test = extent.createTest("verify the "+popularLinks.get(i).getText()+" link");
			scrollToElement(homeObject.popularFurnitureCat);
			test.log(Status.INFO,"scrolled to popular furniture categories");
			click(popularLinks.get(i));
			test.log(Status.INFO,"clicked on "+popularLinks.get(i++).getText());
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Assert.assertEquals(driver.findElement(By.xpath("//h1[@class=\"withsubtext\"]")).getText(),title);
			driver.close();
			driver.switchTo().window(windows.get(0));
			test.log(Status.INFO,"switched to parent window");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}		
	}
}
