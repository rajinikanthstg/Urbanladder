package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_093 extends BaseClass{
	
	@Test
	void TC_093() throws Exception
	{
		try {
			test = extent.createTest("Verify The Navigation To Product Page On Clicking The Product In Cart");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon and navigated to cart");
			click(productPageObject.productInCart);
			test.log(Status.INFO,"clicked on a product in cart");
			Thread.sleep(5000);
			List<String> windows = WindowHandles();
			if(windows.size()==2)
				driver.switchTo().window(windows.get(1));
			Assert.assertTrue(searchResultObject.productBreadcrumb.isDisplayed());
			test.log(Status.PASS,"navigated to product page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
