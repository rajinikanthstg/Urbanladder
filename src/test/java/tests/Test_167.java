package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_167 extends BaseClass{
	
	@Test
	void TC_167() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Delivery Date Updates As Per The Pncode");
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
			String dod = cartObject.deliveryDate.get(0).getText();
			test.log(Status.INFO,"initial date of delivery: "+dod);
			click(cartObject.changePincode);
			test.log(Status.INFO,"clicked on change pincode");
			cartObject.yourPincode.clear();
			test.log(Status.INFO,"cleared old pincode");
			enterData(cartObject.yourPincode,"500097");
			test.log(Status.INFO,"entered pincode 500097");
			click(cartObject.check);
			test.log(Status.INFO,"clicked on check");
			Thread.sleep(3000);
			String ndod = cartObject.deliveryDate.get(0).getText();
			test.log(Status.INFO,"modified delivery date:"+ndod);
			Assert.assertFalse(dod.equals(ndod));
			test.log(Status.PASS,"date of delivery modified");
						
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
