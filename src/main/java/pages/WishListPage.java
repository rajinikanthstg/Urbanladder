package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage {
	
	@FindBy(css="a span[class='name']")
	public List<WebElement> wishListProducts;
	
	@FindBy(xpath="//div[@class=\"compare-widget-wrapper\"]")
	public WebElement comparePopup;
	
	@FindBy(xpath = "//div[@class=\"product-info-block\"]/a")
	public List<WebElement> productNames;
	
	@FindBy(xpath="//div[@class=\"wishproduct wishblock\"]")
	public List<WebElement> wishIcons;
}
