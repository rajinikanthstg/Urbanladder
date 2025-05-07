package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	@FindBy(xpath="(//ul/li[@class=\"product hovercard\"])[1]")
	public WebElement firstProduct;
	
	@FindBy(xpath="(//div[@id=\"line_items\"]//a)[1]")
	public WebElement productInCart;
	
	@FindBy(xpath="//nav[@id=\"breadcrumbs\"]/ul/li/a")
	public List<WebElement> breadcrumb;
	
	@FindBy(xpath="//span[@class=\"wishtext\"]")
	public WebElement addToWishList;
	
	@FindBy(xpath="//h1[@class=\"product-title\"]")
	public WebElement productTitle;
	
	@FindBy(xpath="//div[@class=\"add-to-compare text-center\"]")
	public WebElement addToCompare;
	
	@FindBy(xpath="//button[@data-event=\"add_to_cart\"]")
	public WebElement addToCart;
	
	@FindBy(xpath="//span[@data-testid=\"action-section\"]")
	public WebElement viewPlans;
	
	@FindBy(xpath="//span[text()=\"EMI Options\"]")
	public WebElement sidebar;
	
	@FindBy(xpath="//span[@class='arrow-icon']")
	public WebElement change;
	
	@FindBy(xpath="//input[@placeholder=\"YOUR PINCODE\"]")
	public WebElement pincode;
	
	@FindBy(xpath="//button[text()=\"CHECK\"]")
	public WebElement check;
	
	@FindBy(xpath="//label[text()=\"Invalid pincode.\"]")
	public WebElement invalidPin;
	
	@FindBy(css=".interlink-wrap")
	public WebElement popularCat;
	
	@FindBy(css=".interlink-wrap a")
	public List<WebElement> popularLinks;

}
