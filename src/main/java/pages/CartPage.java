package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(xpath="//*[@id=\"line_items\"]//div[@class=\"product-title\"]//a")
	public List<WebElement> productTitles;

}
