package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_155 extends BaseClass{
	
	@Test
	void TC_155() throws Exception
	{
		try {
			test = extent.createTest("Verify That Product Can Be Removed From Cart");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"kids table");
			test.log(Status.INFO,"entered kids table in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			String title = searchResultObject.productTitles.get(0).getText();
			test.log(Status.INFO,"hovered over product image");
			click(searchResultObject.firstProductViewBtn);
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart button");			
			List<WebElement> products = cartObject.productTitles;
			
			int pos = -1;
			for(int i=0;i<products.size();i++)
			{
				if(products.get(i).getText().equalsIgnoreCase(title))
				{
					pos=i;
					break;
				}
			}
			
			scrollToView(cartObject.productTitles.get(pos));
			test.log(Status.INFO,"scrolled to the product in cart");
			click(cartObject.deleteIcons.get(pos));
			test.log(Status.INFO,"clicked on remove button");
			
			List<WebElement> cartProducts = cartObject.productTitles;
			test.log(Status.INFO,"checking for the removed product in cart");
			boolean result = true;
			for(int i=0;i<cartProducts.size();i++) {
				if(cartProducts.get(i).getText().equalsIgnoreCase(title))
				{
					result=false;
					break;
				}
			}
			
			Assert.assertTrue(result);
			test.log(Status.PASS,"product removed from cart");			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
