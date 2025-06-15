package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_172 extends BaseClass{
	
	@Test
	void TC_172() throws Exception
	{
		try {
			test = extent.createTest("VerifyThe Fields In Shipping Address Are Auto Filled With The User Registration Data ");
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
			boolean email = shippingPageObject.email.getAttribute("value").equals(config.getProperty("email"));
			Assert.assertTrue(email);
			test.log(Status.PASS,"Email verified");
			boolean name = shippingPageObject.firstName.getAttribute("value").equals("Rajinikanth");
			Assert.assertTrue(name);
			test.log(Status.PASS,"user name verified");
			boolean mnum = shippingPageObject.mnumber.getAttribute("value").equals("8897953981");
			Assert.assertTrue(mnum);
			test.log(Status.PASS,"mobile number verified");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
