package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_152 extends BaseClass{
	
	@Test
	void TC_152() throws Exception
	{
		try {
			test = extent.createTest("Verify The Product Quantity Of The Product In Cart Can Be Altered");
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
			int qty = Integer.parseInt(cartObject.quantity.get(pos).getText());
			String xpath = "(//select[@id=\"select_0_quantity\"])["+(pos+1)+"]/option";
			List<WebElement> options = driver.findElements(By.xpath(xpath));
			qty=qty+3;
			SelectByValue(options,String.valueOf(qty));
			Assert.assertTrue(cartObject.quantity.get(pos).getText().equals(String.valueOf(qty)));
			test.log(Status.PASS,"product quantity altered");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
