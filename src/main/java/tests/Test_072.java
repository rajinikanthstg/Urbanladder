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

public class Test_072 extends BaseClass{
	
	List<WebElement> popularMattress = null;
	int i =0;
	
	@BeforeTest
	void setData() throws Exception
	{	
		filename = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		sheet = "PopularMattressCat";
		
		totalRows = ExcelBase.totalRowCount(filename, sheet);
		cellCount = ExcelBase.totalCellsCount(filename, sheet, totalRows);
		
		popularMattress = homeObject.popularMattress;
//		Login();
	}
	
	@Test(dataProvider="readExcel")
	void TC_072(String title) throws Exception
	{
		List<String> windows = null;
		try {
			test = extent.createTest("verify the "+popularMattress.get(i).getText()+" link");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.popularMattressCat);
			test.log(Status.INFO,"scrolled to popular mattress categories");
			click(popularMattress.get(i));
			test.log(Status.INFO,"clicked on "+popularMattress.get(i++).getText());
			windows = WindowHandles();
			driver.switchTo().window(windows.getLast());
			test.log(Status.INFO,"switched to child window");
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
