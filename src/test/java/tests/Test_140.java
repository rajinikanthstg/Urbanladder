package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_140 extends BaseClass{
	
	@Test
	void TC_140() throws Exception
	{
		try {
			test = extent.createTest("Verify That Product Can Be Added To Wishlist From The Cart");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.cartIcon);
			test.log(Status.INFO,"clicked on cart icon");
			String title = cartObject.productTitles.get(0).getText();
			click(cartObject.addToWishlist.get(0));
			test.log(Status.INFO,"clicked on add to wishlist");
			click(cartObject.wishList);
			test.log(Status.INFO,"navigated to wishlist");
			
			List<WebElement> products = wishListObject.productNames;

            boolean result = false;
            for (int i=0;i<products.size();i++)
            {
                if (products.get(i).getAttribute("title").contains(title)) {
                    result = true;
                    break;
                }
            }

            Assert.assertTrue(result);
            test.log(Status.INFO,"product added to wishlist");
			
			
			
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
