package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_159 extends BaseClass{
	
	@Test
	void TC_159() throws Exception
	{
		try {
			test = extent.createTest("Verify The Total Price Of Cart After Applying The Discount Coupon");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"study lamp");
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
			int cartTotal1 = Integer.parseInt(cartObject.cartTotal.getText());
			test.log(Status.INFO,"scrolled to cart total");
			click(cartObject.coupon);
			test.log(Status.INFO,"clicked on apply coupon and save");
			click(cartObject.flat5);
			test.log(Status.INFO,"clicked on FLAT5 coupon");
			ExplicitWait(cartObject.successShow);
			click(cartObject.closePopup);
			test.log(Status.INFO,"closed success popup");
			scrollToView(cartObject.cartTotal);
			test.log(Status.INFO,"scrolled to cart total");
			int cartTotal2 = Integer.parseInt(cartObject.cartTotal.getText());
			Assert.assertTrue(cartTotal2<cartTotal1);
			test.log(Status.PASS,"displayed discounted price");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
