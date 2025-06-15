package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_151 extends BaseClass{
	
	@Test
	void TC_151() throws Exception
	{
		try {
			test = extent.createTest("Verify The Default Quantity Of The Product After Adding To Cart Is 1");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"shoe rack");
			test.log(Status.INFO,"entered chair in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			String product = searchResultObject.productTitles.get(0).getText();
			test.log(Status.INFO,"hovered over product image");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product button");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart");
			List<WebElement> products = cartObject.productTitles;
			
			int pos = -1;
			for(int i=0;i<products.size();i++)
			{
				if(products.get(i).getText().equalsIgnoreCase(product))
				{
					pos=i;
					break;
				}
			}
			
			scrollToView(cartObject.productTitles.get(pos));
			Assert.assertEquals(cartObject.quantity.get(pos).getText(),"1");
			test.log(Status.PASS,"default quantity of product is 1");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
