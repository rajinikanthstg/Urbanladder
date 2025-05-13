package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_166 extends BaseClass{
	
	@Test
	void TC_166() throws Exception
	{
		try {
			test = extent.createTest("Verify The Change Pincode Link In Cart Allows To Change The Pincode");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"wardrobe");
			test.log(Status.INFO,"entered coffee table in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered overe first product");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			click(cartObject.changePincode);
			test.log(Status.INFO,"clicked on change pincode");
			cartObject.yourPincode.clear();
			test.log(Status.INFO,"cleared old pincode");
			enterData(cartObject.yourPincode,"500097");
			test.log(Status.INFO,"entered pincode 500097");
			click(cartObject.check);
			test.log(Status.INFO,"clicked on check");
			Thread.sleep(2000);
			Assert.assertTrue(cartObject.newPincode.getText().contains("500097"));
			test.log(Status.PASS,"pincode changed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
