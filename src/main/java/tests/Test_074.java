package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_074 extends BaseClass{
	
	@Test
	void TC_074() throws Exception
	{
		try {
			test = extent.createTest("Verify links in Delivering In");
			scrollToView(homeObject.deliveringIn);
			test.log(Status.INFO,"scrolled to delivering in");
			click(homeObject.deliveringInLink);
			test.log(Status.INFO,"clicked on more");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			test.log(Status.INFO,"switched to child window");
			Assert.assertEquals(driver.findElement(By.xpath("//h1[@class=\"withsubtext\"]")).getText(),"Cities We Deliver In");
			test.log(Status.PASS,"navigated to Cities We Deliver In");
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
