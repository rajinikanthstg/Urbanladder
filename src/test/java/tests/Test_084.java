package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_084 extends BaseClass{
	
	@Test
	void TC_084() throws Exception
	{
		try {
			test = extent.createTest("Verify The Sort By Dropdown In Search Results Shows Recomended Prodcts By Default");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			Assert.assertTrue(searchResultObject.defaultSortOption.isDisplayed());
			test.log(Status.PASS,"sorted by recommended");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
