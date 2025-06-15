package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_174 extends BaseClass{
	
	@Test
	void TC_174() throws Exception
	{
		try {
			test = extent.createTest("Verify The Checkbox In Billing Address Takes Address From Shiiping Address");
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
			click(shippingPageObject.addressCheckBox);
			test.log(Status.INFO,"unchecked use shipping address checkbx");
			Assert.assertTrue(shippingPageObject.billingAddress.isDisplayed());
			test.log(Status.PASS,"billing address displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
