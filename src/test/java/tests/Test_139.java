package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_139 extends BaseClass{
	
	@Test
	void TC_139() throws Exception
	{
		try {
			test = extent.createTest("Verify That Product Can Be Added To Wishlist From The Product Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered chair in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over product");
			String title = searchResultObject.productTitles.get(0).getAttribute("title");
			System.out.println(title);
			click(driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[5]/div[2]/a[2]")));
			test.log(Status.INFO, "clicked on view product");			
			click(productPageObject.addToWishList);
			test.log(Status.INFO,"clicked on add to wishlist");
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
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
