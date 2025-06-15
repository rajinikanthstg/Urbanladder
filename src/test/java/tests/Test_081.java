package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_081 extends BaseClass{
	
	@Test
	void TC_081() throws Exception
	{
		try {
			test = extent.createTest("Verify The Cartegory Filter In Search Results");
			Login();
			enterData(homeObject.searchBar,"sofa");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			String icount = searchResultObject.resultCount.getText();
			int ic = Integer.parseInt(icount.split(" ")[0].substring(1));
			hover(searchResultObject.catFilter);
			test.log(Status.INFO,"hovered over category dropdown");
			SelectByText(searchResultObject.catDropdown,"fabric sofa sets");
			test.log(Status.INFO,"selected option in category filter");
			Thread.sleep(2000);
			String fcount = searchResultObject.resultCount.getText();
			int fc = Integer.parseInt(fcount.split(" ")[0].substring(1));
			Assert.assertTrue(ic>fc);
			test.log(Status.PASS,"search results are filtered by category");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
