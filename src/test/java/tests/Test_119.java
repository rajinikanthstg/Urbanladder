package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_119 extends BaseClass{
	
	@Test
	void TC_119() throws Exception
	{
		try {
			test = extent.createTest("Verify The Product Can Be Added To Compare From The Search Results");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"table");
			test.log(Status.INFO,"entered table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			String title = searchResultObject.searchedProduct.getText();
			click(searchResultObject.addToCompareBtn);			
			test.log(Status.INFO,"clicked on add to compare");
			String ctitle = addToComparePopup.compareProducts.get(0).getText();
			Assert.assertEquals(title,ctitle);
			test.log(Status.PASS,"aproduct added to compare");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
