package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_085 extends BaseClass{
	
	@Test
	void TC_085() throws Exception
	{
		try {
			test = extent.createTest("Verify The Search Results Can Be Sorted From Price Range Low To High");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.defaultSortOption);
			SelectByText(searchResultObject.sortOptions,"Price: Low to High");
			Thread.sleep(2000);
			test.log(Status.INFO,"selected low to high price range");
			String price = searchResultObject.priceFilterOptions.get(0).getAttribute("value").split("-")[0];
			Assert.assertTrue(searchResultObject.firstProductPrice.getAttribute("data-price").contains(price));
			test.log(Status.PASS,"products price sorted from low to high");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
