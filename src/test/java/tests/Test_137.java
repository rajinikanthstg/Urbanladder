package tests;

import com.aventstack.extentreports.Status;
import libraries.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test_137 extends BaseClass {

    @Test
    void TC_137() throws Exception {
        try{
            test = extent.createTest("Verify That Product Can Be Added To Wishlist From The Search Results");
            Login();
            test.log(Status.INFO,"user logged in");
            enterData(homeObject.searchBar,"chair");
            test.log(Status.INFO,"entered chair in search box");
            click(homeObject.searchBtn);
            test.log(Status.INFO,"clicked on search button");
            hover(searchResultObject.firstProductImg);
            test.log(Status.INFO,"hovered over product");
            click(searchResultObject.firstProductWishIcon);
            test.log(Status.INFO,"clicked on wishlist icon");
            String title = searchResultObject.productTitles.get(0).getAttribute("title");
            scrollToElement(homeObject.logo);
            click(homeObject.whishList);

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
        catch (Exception e){
            screenshot();
            test.log(Status.FAIL,"test failed");
        }
    }
}
