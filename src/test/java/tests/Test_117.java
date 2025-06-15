package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_117 extends BaseClass{
	
	@Test
	void TC_117() throws Exception
	{
		try {
			test = extent.createTest("Verify The Links In Browse Popular Categories");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"table");
			test.log(Status.INFO,"entered table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(driver.findElement(By.xpath("(//a[@class=\"button\"])[1]")));
			test.log(Status.INFO,"clicked on view product");
			scrollToView(productPageObject.popularCat);
			test.log(Status.INFO,"scrolled to popular categories");
			List<WebElement> links = productPageObject.popularLinks;
			
			boolean result = true;			
			
			for(int i=0;i<links.size();i++)
			{
				click(links.get(i));
				if(driver.findElement(By.xpath("//div[@class=\"row text-center\"]/h1")).isDisplayed())
				{
					driver.navigate().back();
					Thread.sleep(2000);
				}
				else
				{
					result= false;
					break;
				}
			}
			Assert.assertTrue(result);
			test.log(Status.PASS,"all links are enabled");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
