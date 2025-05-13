package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_189 extends BaseClass{
	
	@Test
	void TC_189() throws Exception
	{
		try {
			test=extent.createTest("Verify The Place Order Button Directs To The Payment Options");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"study lamp");
			test.log(Status.INFO,"entered study lamp in search");
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
			scrollToView(shippingPageObject.saveAndContinue);
			click(shippingPageObject.saveAndContinue);
			test.log(Status.INFO,"clicked on save and continue");
			click(paymentPageObject.placeOrder);
			test.log(Status.INFO,"clicked on place order");
			driver.switchTo().frame(paymentPageObject.checkoutFrame);
			test.log(Status.INFO,"switched to frame");
			Thread.sleep(3000);
			Assert.assertTrue(paymentPageObject.paymentOptions.isDisplayed());
			test.log(Status.PASS,"payment options page displayed");				
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}
}
