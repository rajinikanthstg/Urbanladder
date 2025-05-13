package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_177 extends BaseClass{
	
	@Test
	void TC_177() throws Exception
	{
		try {
			test = extent.createTest("Verify The Save And Continue Button Directs To Payment Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"coffee table");
			test.log(Status.INFO,"entered coffee table in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered overe first product");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			click(cartObject.checkout.get(0));
			test.log(Status.INFO,"clicked on checkout");
			Thread.sleep(3000);
			scrollToView(shippingPageObject.saveAndContinue);
			test.log(Status.INFO,"clicked on save and continue");
			click(shippingPageObject.saveAndContinue);
			test.log(Status.INFO,"clicked on save and continue");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getCurrentUrl().contains("payment"));
			test.log(Status.PASS,"navigated to payment page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
