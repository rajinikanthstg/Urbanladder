package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_188 extends BaseClass{
	
	@Test
	void TC_188() throws Exception
	{
		try {
			test = extent.createTest("Verify The User Email And Mobile Number Displayed Above Place Order Button");
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
			Assert.assertTrue(paymentPageObject.email.getText().contains(config.getProperty("email")));
			test.log(Status.PASS,"email verified");
			Assert.assertTrue(paymentPageObject.mnumber.getText().contains("8897953981"));
			test.log(Status.PASS,"mobile number verified");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
