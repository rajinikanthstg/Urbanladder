package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_157 extends BaseClass{
	
	@Test
	void TC_157() throws Exception
	{
		try {
			test = extent.createTest("Verify That Discount Coupon Can Be Applied On Total Price Of Cart");
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
			scrollToView(cartObject.cartTotal);
			test.log(Status.INFO,"scrolled to cart total");
			click(cartObject.coupon);
			test.log(Status.INFO,"clicked on apply coupon and save");
			click(cartObject.flat5);
			test.log(Status.INFO,"clicked on FLAT5 coupon");
			ExplicitWait(cartObject.successShow);
			Assert.assertTrue(cartObject.successShow.isDisplayed());
			test.log(Status.INFO,"coupon code applied");		

		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
