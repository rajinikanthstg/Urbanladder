package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_083 extends BaseClass {
	
	@Test
	void TC_083() throws Exception
	{
		try {
			test = extent.createTest("Verify The Exclude Out Of stock Checkbox In Search Results");
			Login();
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			String icount = searchResultObject.resultCount.getText();
			int ic = Integer.parseInt(icount.split(" ")[0].substring(1));
			click(searchResultObject.outOfStockCheck);
			test.log(Status.INFO,"selected out of stock filter");
			Thread.sleep(2000);
			String fcount = searchResultObject.resultCount.getText();
			int fc = Integer.parseInt(fcount.split(" ")[0].substring(1));
			Assert.assertTrue(ic>fc,"filtered by out of stock");
			test.log(Status.PASS,"search results are filtered by stock availability");
			Logout();
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
			
		}
	}

}
