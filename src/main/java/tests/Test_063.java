package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_063 extends BaseClass{
	
	@Test(priority=1)
	void TC_001() throws Exception
	{
		test = extent.createTest("Verify The Links In 'The Company'");
//		Login();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		List<String> titles = new ArrayList<>();
		
		titles.add("About Us");
		titles.add("Help");
		titles.add("Interior Design");
		titles.add("Urban Ladder Stories");
		titles.add("Work With Us");
		titles.add("Urban Ladder in the News");
		titles.add("LinkedIn Login, Sign in");
		titles.add("Privacy Policy");
		
		scrollToElement(homeObject.footerLinks);
		test.log(Status.INFO,"scrolled to footer links");
		
		List<WebElement> links = homeObject.company;		
		
		for(int i=0;i<links.size();i++)
		{
			String title = homeObject.company.get(i).getText();
			click(homeObject.company.get(i));
			test.log(Status.INFO,"clicked on "+ title);
			List<String> windows = WindowHandles();
			if(windows.getFirst().equals(windows.getLast()))
			{
				Assert.assertTrue(driver.getTitle().contains(titles.get(i)));
				test.log(Status.PASS,"navigated to "+titles.get(i)+" page");
				driver.navigate().back();
				test.log(Status.INFO,"navigating back to home page");
				js.executeScript("arguments[0].scrollIntoView()",homeObject.footerLinks);
				test.log(Status.INFO,"scrolled to footer links");
			}
			else
			{
				driver.switchTo().window(windows.getLast());
				Assert.assertTrue(driver.getTitle().contains(titles.get(i)));
				test.log(Status.PASS,"navigated to "+titles.get(i)+" page");
				driver.close();
				driver.switchTo().window(windows.getFirst());
				test.log(Status.INFO,"switched to parent window");
			}			
		}
	}
}
