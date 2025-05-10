package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_158 extends BaseClass{
	
	@Test
	void TC_158() throws Exception
	{
		try {
			test = extent.createTest("Verify That Error Message Is Displayed On Applying Invalid Discount Coupon");
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
			enterData(cartObject.couponCode,"1234");
			test.log(Status.INFO,"entered a invalid coupon code");
			click(cartObject.apply);
			test.log(Status.INFO,"clicked on apply button");
			Assert.assertTrue(cartObject.couponError.isDisplayed());
			test.log(Status.PASS,"coupon error displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
