package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_090 extends BaseClass {
	
	@Test
	void TC_090() throws Exception
	{
		try {
			test = extent.createTest("Verify The Navigation To Product Page On Clicking The View Product Button In Search Results");
			Login();
			test.log(Status.INFO,"user logged in");
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over product");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on product view button");
			Assert.assertTrue(searchResultObject.productBreadcrumb.isDisplayed());
			test.log(Status.PASS,"navigated to product page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
