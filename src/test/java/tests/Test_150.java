package tests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_150 extends BaseClass{
	
	@Test
	void TC_150() throws Exception
	{
		try {
			test = extent.createTest("Verify The Delivery Date Of The Product After Adding To Cart");
			Login();
			test.log(Status.INFO,"user logged in");
			enterData(homeObject.searchBar,"chair");
			test.log(Status.INFO,"entered chair in search bar");
			click(homeObject.searchBtn);
			test.log(Status.INFO,"clicked on search button");
			hover(searchResultObject.firstProductImg);
			test.log(Status.INFO,"hovered over product image");
			String product = searchResultObject.productTitles.get(0).getText();
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
			String dod = cartObject.deliveryDate.get(pos).getText();
			
			String day = dod.split(" ")[1].substring(0, 2);
			String month = dod.split(" ")[2].substring(0,3);
			String year = dod.split(" ")[3];
			Date d1 = new Date(day+" "+month+" "+year);
			LocalDate today = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
			String today1 = today.format(formatter);
			Date d2 = new Date(today1);
			Assert.assertTrue(d1.after(d2));
			test.log(Status.PASS,"delivery date verified");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
