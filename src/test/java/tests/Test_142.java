package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_142 extends BaseClass{
	
	@Test
	void TC_142() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Products Added To Wishlist Can Be Removed From Wishlist");
			Login();
			test.log(Status.INFO,"user logged in");
			click(homeObject.whishList);
			test.log(Status.INFO,"navigated to wishlist");
			String title = wishListObject.wishListProducts.get(0).getText();
			click(wishListObject.wishIcons.get(0));
			test.log(Status.INFO,"clicked on wish icon");
			
			List<WebElement> products = wishListObject.productNames;

            boolean result = false;
            for (int i=0;i<products.size();i++)
            {
                if (products.get(i).getAttribute("title").contains(title)) {
                    result = true;
                    break;
                }
            }

            Assert.assertFalse(result);
            test.log(Status.INFO,"product removed from wishlist");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
