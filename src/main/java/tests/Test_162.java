package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_162 extends BaseClass {
	
	@Test
	void TC_162() throws Exception
	{
		try {
			test = extent.createTest("Verify The Continue shopping Button Directs To Continue shopping page");
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
			click(cartObject.continueShoping.get(0));
			test.log(Status.INFO,"clicked on continue shopping");
			Assert.assertTrue(driver.getCurrentUrl().contains("cart_contshop"));
			test.log(Status.PASS,"navigated to continue shoping");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
