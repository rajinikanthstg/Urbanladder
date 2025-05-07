package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_064 extends BaseClass{
	
	@Test
	void TC_064() throws Exception
	{
		List<String> titles = new ArrayList<>();
		
		titles.add("Payments and Security");
		titles.add("Shipping and Delivery");
		titles.add("Terms of Use");
		titles.add("Terms of Offer for Sale");
		titles.add("Contact Us");
		titles.add("Visit Us");
		titles.add("Buy In Bulk");
		
		List<WebElement> links = homeObject.moreInformation;
		
		for(int i=0;i<links.size();i++)
		{
			String title = links.get(i).getText();
			test = extent.createTest("verify "+title+" link in more information");
			scrollToView(homeObject.footerLinks);
			test.log(Status.INFO,"scrolled to footer links");
			
			click(links.get(i));
			test.log(Status.INFO,"clicked on "+title);
			try {
				Assert.assertTrue(driver.getTitle().contains(titles.get(i)));
				test.log(Status.PASS,"navigated to "+titles.get(i));
				driver.navigate().back();
			}
			catch(Exception e) {
				screenshot();
				test.log(Status.FAIL,"test failed");
				driver.navigate().back();
			}
		}
	}
}