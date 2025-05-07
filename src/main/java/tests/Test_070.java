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

public class Test_070 extends BaseClass{
	
	List<WebElement> furnitureByRoom = null;
	int i =0;
	
	@BeforeTest
	void setData() throws Exception
	{	
		filename = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		sheet = "FurnitureByRoom";
		
		totalRows = ExcelBase.totalRowCount(filename, sheet);
		cellCount = ExcelBase.totalCellsCount(filename, sheet, totalRows);
		
		furnitureByRoom = homeObject.furnitureByRoom;
	}
	
	@Test(dataProvider="readExcel")
	void TC_070(String title) throws Exception
	{
		try {
			test = extent.createTest("verify the "+furnitureByRoom.get(i).getText()+" link");
			scrollToElement(homeObject.popularFurnitureCat);
			test.log(Status.INFO,"scrolled to furniture by room categories");
			click(furnitureByRoom.get(i));
			test.log(Status.INFO,"clicked on "+furnitureByRoom.get(i++).getText());
			List<String> windows = WindowHandles();
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
