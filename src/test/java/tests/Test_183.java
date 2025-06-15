package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_183 extends BaseClass{
	
	@Test
	void TC_183() throws Exception
	{
		try {
			test = extent.createTest("Verify The View Offer Button Displays The Offers And Discounts For The Selected Payment Method");
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
			driver.switchTo().frame("rzpAffordabilityMainFrame");
			click(paymentPageObject.viewOffers);
			test.log(Status.INFO,"clicked on view offers");
			driver.switchTo().parentFrame();
			driver.switchTo().frame("rzpAffordabilityDetailFrame");
			Assert.assertTrue(paymentPageObject.offersAndDiscounts.isDisplayed());
			test.log(Status.PASS,"offers and discounts displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
