package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_148 extends BaseClass{
	
	@Test
	void TC_148() throws Exception
	{
		try {
			test = extent.createTest("Verify The Add To Cart Functionality In Product Page");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered chair in search");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over product image");
			String title = searchResultObject.productTitles.get(0).getText().trim();
			click(driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[5]/div[2]/a[2]")));
			test.log(Status.INFO,"clicked on view product");
			click(productPageObject.addToCart);
			test.log(Status.INFO,"clicked on add to cart button");
			
			List<WebElement> products = cartObject.productTitles;

            boolean result = false;
            for (int i=0;i<products.size();i++)
            {
            	String pname = products.get(i).getText().trim();
                if (pname.equalsIgnoreCase(title)) 
                {
                    result = true;
                    break;
                }
            }

            Assert.assertTrue(result);
            test.log(Status.PASS,"product added to cart");
			
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
