package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_082 extends BaseClass{
	
	@Test
	void TC_082() throws Exception
	{
		try {
			test = extent.createTest("Verify The Price Filter In Search Results");
			Login();
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			String icount = searchResultObject.resultCount.getText();
			int ic = Integer.parseInt(icount.split(" ")[0].substring(1));
			hover(searchResultObject.priceFilter);
			test.log(Status.INFO,"hovered over price filter");
			SelectByValue(searchResultObject.priceFilterOptions,"51801-103600");
			test.log(Status.INFO,"selected option in price filter");
			Thread.sleep(2000);
			String fcount = searchResultObject.resultCount.getText();
			int fc = Integer.parseInt(fcount.split(" ")[0].substring(1));
			Assert.assertTrue(ic>fc,"filtered by price");
			test.log(Status.PASS,"search results are filtered by price range");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
