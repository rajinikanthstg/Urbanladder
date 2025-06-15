package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_190 extends BaseClass{
	
	@Test
	void TC_190() throws Exception
	{
		try {
			test = extent.createTest("Verify The Logo Navigates To Homepage On Clicking");
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
			click(paymentPageObject.logo);
			test.log(Status.INFO,"clicked on logo");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			Assert.assertTrue(homeObject.profileOption.isDisplayed());
			test.log(Status.PASS,"navigated to homepage");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
