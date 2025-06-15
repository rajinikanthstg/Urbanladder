package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_175 extends BaseClass {
	
	@Test
	void TC_175() throws Exception
	{
		try {
			test = extent.createTest("Verify That Billing Address Can Be Different From Shipping Address");
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
			test.log(Status.INFO,"clicked on use shipping address checkbox");
			shippingPageObject.billingFirstname.clear();
			test.log(Status.INFO,"cleared first name");
			shippingPageObject.billingFirstname.sendKeys("Rajesh");
			test.log(Status.INFO,"changed first name");
			shippingPageObject.billingLastname.clear();
			test.log(Status.INFO,"cleared last name");
			shippingPageObject.billingLastname.sendKeys("Chatla");
			test.log(Status.INFO,"changed lastname");
			shippingPageObject.billingPincode.clear();
			test.log(Status.INFO,"cleared pincode");
			shippingPageObject.billingPincode.sendKeys("500058");
			test.log(Status.INFO,"changed pincode");
			shippingPageObject.billAddress.clear();
			test.log(Status.INFO,"cleared city");
			shippingPageObject.billAddress.sendKeys("kanchanbagh");
			test.log(Status.INFO,"changed city");
			shippingPageObject.billingMnumber.clear();
			test.log(Status.INFO,"cleared mobile number");
			shippingPageObject.billingMnumber.sendKeys("8897953981");
			test.log(Status.INFO,"cleared mobile number");
			scrollToView(shippingPageObject.saveAndContinue);
			test.log(Status.INFO,"scrolled to save and continue");
			click(shippingPageObject.saveAndContinue);
			test.log(Status.INFO,"clicked on save and continue");
			Thread.sleep(3000);
			Assert.assertTrue(driver.getCurrentUrl().contains("payment"));
			test.log(Status.PASS,"billing address change accepted");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}	
	}

}