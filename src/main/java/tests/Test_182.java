package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_182 extends BaseClass{
	
	@Test
	void TC_182() throws Exception
	{
		try {
			test = extent.createTest("Verify The EMI Plans Can Be Viewed From The Available Plans");
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
			driver.switchTo().frame("rzpAffordabilityMainFrame");
			click(paymentPageObject.viewPlans);
			test.log(Status.INFO,"clicked on view plans");
			driver.switchTo().parentFrame();
			driver.switchTo().frame("rzpAffordabilityDetailFrame");
			click(paymentPageObject.planHeaders.get(0));
			test.log(Status.INFO,"clicked on emi plan header");
			Assert.assertTrue(paymentPageObject.plansList.isDisplayed());
			test.log(Status.PASS,"emi plans displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
