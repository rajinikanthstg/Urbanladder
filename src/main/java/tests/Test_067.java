package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_067 extends BaseClass {
	
	@Test
	void TC_067() throws Exception
	{
		List<WebElement> links = driver.findElements(By.xpath("//ul[@id='footer-social']/li/a"));
		List<String> hrefs = new ArrayList<>();
		
		hrefs.add("empty");
		hrefs.add("empty");
		hrefs.add("facebook.com");
		hrefs.add("x.com");
		hrefs.add("pinterest.com");
		hrefs.add("youtube.com");
		hrefs.add("instagram.com");
		hrefs.add("linkedin.com");
		
		scrollToElement(homeObject.footerSocial);
		
		for(int i=2;i<links.size();i++)
		{
			try {
				test = extent.createTest("verify "+hrefs.get(i)+" link in footer");
				click(links.get(i));
				test.log(Status.INFO,"clicked on "+hrefs.get(i)+" link");
				List<String> windows = WindowHandles();
				driver.switchTo().window(windows.get(1));
				test.log(Status.INFO,"switched to child window");
				Assert.assertTrue(driver.getCurrentUrl().contains(hrefs.get(i)));
				test.log(Status.PASS,"navigated to "+hrefs.get(i)+" page");
				driver.close();
				test.log(Status.INFO,"closed child window");
				driver.switchTo().window(windows.get(0));
				test.log(Status.INFO,"switched to parent window");
				scrollToElement(homeObject.footerSocial);
				test.log(Status.INFO,"scrolled to footer-social links");
			}
			catch(Exception e) {
				screenshot();
				test.log(Status.FAIL,"test failed");
			}
			
		}
		
	}	
}
