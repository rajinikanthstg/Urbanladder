package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_173 extends BaseClass{
	
	@Test
	void TC_173() throws Exception
	{
		try {
			test = extent.createTest("Verify The Unfreezed Fields In Shipping Address Are Editable ");
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
			shippingPageObject.pincode.clear();
			test.log(Status.INFO,"pinode cleared");
			shippingPageObject.pincode.sendKeys("500058");
			test.log(Status.PASS,"changed pincode");
			shippingPageObject.address.clear();
			test.log(Status.INFO,"cleared address textarea");
			shippingPageObject.address.sendKeys("Ameerpet");
			test.log(Status.PASS,"changed city name");
			shippingPageObject.firstName.clear();
			test.log(Status.INFO,"first name cleared");
			shippingPageObject.firstName.sendKeys("Rajinikanth");
			test.log(Status.PASS,"changed firstname");
			shippingPageObject.lastName.clear();
			test.log(Status.INFO,"cleared last name");
			shippingPageObject.lastName.sendKeys("Chatla");
			test.log(Status.PASS,"last name changed");
			shippingPageObject.mnumber.clear();
			test.log(Status.INFO,"cleared mobile number");
			shippingPageObject.mnumber.sendKeys("8897953981");
			test.log(Status.PASS,"entered mobile number");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
