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

public class Test_073 extends BaseClass{
	
	List<WebElement> popularTableWare = null;
	int i =0;
	
	@BeforeTest
	void setData() throws Exception
	{	
		filename = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		sheet = "PopularTableWareCat";
		
		totalRows = ExcelBase.totalRowCount(filename, sheet);
		cellCount = ExcelBase.totalCellsCount(filename, sheet, totalRows);
		
		popularTableWare = homeObject.popularTableWare;
	}
	
	@Test(dataProvider="readExcel")
	void TC_073(String title) throws Exception
	{
		try {
			test = extent.createTest("verify the "+popularTableWare.get(i).getText()+" link");
			test.log(Status.INFO,"user logged in");
			scrollToElement(homeObject.popularTableWareCat);
			test.log(Status.INFO,"scrolled to popular tableware categories");
			click(popularTableWare.get(i));
			test.log(Status.INFO,"clicked on "+popularTableWare.get(i++).getText());
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
