package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_130 extends BaseClass{
	
	@Test
	void TC_130() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Description Of Comparing Products Is Displayed In Product Comparing Page ");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"study lamp");
			test.log(Status.INFO,"entered lamp in search box");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over first search result");
			click(searchResultObject.firstProductCompare);
			Thread.sleep(2000);
			hover(searchResultObject.secondProductImg);
			test.log(Status.INFO,"hovered over second search result");
			click(searchResultObject.secondProductCompare);
			Thread.sleep(2000);
			click(addToComparePopup.compareBtn);
			Assert.assertTrue(addToComparePopup.compareProps.isDisplayed());
			test.log(Status.PASS,"product compare properties displayed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
