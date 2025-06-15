package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_088 extends BaseClass{
	
	@Test
	void TC_088() throws Exception
	{
		try {
			test = extent.createTest("Verify The Products In Search Results Direct To Product Page On Clicking The Product Image");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"table");
			test.log(Status.INFO,"entered sofa in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			click(searchResultObject.firstProductImg);
			test.log(Status.INFO,"clicked on product image");
			Thread.sleep(5000);
			List<String> windows = WindowHandles();
			if(windows.size()==2)
				driver.switchTo().window(windows.get(1));
			Assert.assertTrue(searchResultObject.productBreadcrumb.isDisplayed());
			test.log(Status.PASS,"navigated to product page");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
