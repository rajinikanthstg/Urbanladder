package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_163 extends BaseClass{
	
	@Test
	void TC_163() throws Exception
	{
		try {
			test = extent.createTest("Verify The Empty Cart Shows Your Cart Is Empty Message");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"wardrobe");
			test.log(Status.INFO,"entered coffee table in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered overe first product");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			List<WebElement> delIcons = cartObject.deleteIcons;
			test.log(Status.INFO,"removing products from cart");
			
			for(int i=0;i<delIcons.size();i++)
			{
				click(delIcons.get(0));
			}
			
			Assert.assertTrue(cartObject.emptyMessage.isDisplayed());
			test.log(Status.PASS,"cart empty message displayed");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
