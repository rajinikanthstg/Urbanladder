package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_092 extends BaseClass{
	
	@Test
	void TC_092() throws Exception
	{
		try {
			test = extent.createTest("Verify The Navigation To Product Page On Clicking The Product In Wishlist");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.whishList);
			test.log(Status.INFO,"clicked on wishlist icon and navigated to wishlist");
			click(driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/div/a/img")));
			test.log(Status.INFO,"clicked on first product");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			Thread.sleep(2000);
			boolean result = driver.getCurrentUrl().contains("products");
			Assert.assertTrue(result);
			test.log(Status.PASS,"nvigated to product page");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
