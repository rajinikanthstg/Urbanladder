package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_068 extends BaseClass{
	
	@Test
	void TC_068() throws Exception
	{
		List<WebElement> downloads = homeObject.downloads;
		List<String> urls = new ArrayList<>();
		
		urls.add("apps.apple.com");
		urls.add("play.google.com");
		
		scrollToElement(homeObject.downloadImages);
		
		for(int i=0;i<downloads.size();i++)
		{
			try {
				test = extent.createTest("verify the "+downloads.get(i).getAttribute("class")+" download link");
				
				click(downloads.get(i));
				test.log(Status.INFO,"clicked on "+urls.get(i)+" link");
				List<String> windows = WindowHandles();
				driver.switchTo().window(windows.get(1));
				test.log(Status.INFO,"switched to child window");
				Assert.assertTrue(driver.getCurrentUrl().contains(urls.get(i)));
				test.log(Status.PASS,"navigated to "+urls.get(i));
				driver.close();
				driver.switchTo().window(windows.get(0));
				scrollToElement(homeObject.downloadImages);
				test.log(Status.INFO,"scrolled to footer links");
			}
			catch(Exception e) {
				screenshot();
				test.log(Status.FAIL,"test failed");
			}
		}
	}
}
