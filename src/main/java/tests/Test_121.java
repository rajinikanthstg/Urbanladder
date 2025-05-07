package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_121 extends BaseClass{
	
	@Test
	void TC_121() throws Exception
	{
		try {
			test = extent.createTest("Verify The Product Can Be Added To Compare From Featured Products On Homepage");
			Login();
			test.log(Status.INFO,"user logged in");
			scrollToView(homeObject.newArrivals);
			test.log(Status.INFO,"scrolled to products on homepage");
			click(homeObject.arrBtn1);
			test.log(Status.INFO,"clicked on a product");
			List<String> windows = WindowHandles();
			driver.switchTo().window(windows.get(1));
			click(productPageObject.addToCompare);
			test.log(Status.INFO,"clicked on add to compare");
			Assert.assertTrue(addToComparePopup.compareProducts.get(0).isDisplayed());
			test.log(Status.PASS,"product added to compare");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.INFO,"test failed");
		}
	}

}
