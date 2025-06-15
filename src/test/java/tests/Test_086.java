package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_086 extends BaseClass{
	
	@Test
	void TC_086() throws Exception
	{
		try {
			test = extent.createTest("Verify The Search Results Can Be Sorted From Price Range High To Low");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"bed");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.defaultSortOption);
			SelectByText(searchResultObject.sortOptions,"Price: High to Low");
			Thread.sleep(2000);
			test.log(Status.INFO,"selected high to low price range");
			String price = searchResultObject.priceFilterOptions.get(searchResultObject.priceFilterOptions.size()-1).getAttribute("value").split("-")[1];
			Assert.assertTrue(searchResultObject.firstProductPrice.getAttribute("data-price").contains(price));
			test.log(Status.PASS,"products price sorted from high to low");
			Logout();
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
