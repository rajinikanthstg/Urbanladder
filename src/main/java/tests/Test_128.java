package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_128 extends BaseClass{
	
	@Test
	void TC_128() throws Exception
	{
		try {
			test = extent.createTest("Verify The Compare Button On The Compare PopUp Is Enable Only After Adding Two Products");
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
			Assert.assertTrue(addToComparePopup.compareBtnDisabled.isDisplayed());
			hover(searchResultObject.secondProductImg);
			test.log(Status.INFO,"hovered over second search result");
			click(searchResultObject.secondProductCompare);
			Thread.sleep(2000);
			Assert.assertTrue(addToComparePopup.compareBtn.isDisplayed());
			test.log(Status.PASS,"compare button enabled");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test faailed");
		}
	}

}
