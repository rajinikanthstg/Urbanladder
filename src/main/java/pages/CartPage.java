package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(xpath="//*[@id=\"line_items\"]//div[@class=\"product-title\"]//a")
	public List<WebElement> productTitles;
	
	@FindBy(xpath="//a[normalize-space()='Add to Wishlist']")
	public List<WebElement> addToWishlist;
	
	@FindBy(xpath="//a[contains(text(),'Wishlist')]")
	public WebElement wishList;
	
	@FindBy(css=".delivery-date")
	public List<WebElement> deliveryDate;
	
	@FindBy(xpath="//select[@id=\"select_0_quantity\"]/option[@selected=\"selected\"]")
	public List<WebElement> quantity;

	@FindBy(xpath="//div[@class=\"final-price\"]")
	public List<WebElement> finalPrice;

	@FindBy(xpath="//div[@class=\"cart-item-delete\"]/a")
	public List<WebElement> deleteIcons;

	@FindBy(xpath="//div[@class=\"total-amt\"]")
	public WebElement cartTotal;

	@FindBy(xpath="//div[@class=\"order-amt delivery-charge\"]")
	public WebElement deliveryCharges;

	@FindBy(xpath="//div[@class=\"coupon_content\"]")
	public WebElement coupon;

	@FindBy(xpath="//button[@name=\"coupon-apply\"][@value=\"FLAT5\"]")
	public WebElement flat5;

	@FindBy(xpath="//div[@class=\"success-show\"]")
	public WebElement successShow;

	@FindBy(xpath="//input[@placeholder=\"Coupon code\"]")
	public WebElement couponCode;

	@FindBy(xpath="//button[@id=\"apply-coupon-button\"]")
	public WebElement apply;

	@FindBy(xpath="//div[@class=\"coupon-error\"]")
	public WebElement couponError;

	@FindBy(xpath="//div[@class=\"success-show\"]//div[@class=\"icofont-cross_thin\"]")
	public WebElement closePopup;

	@FindBy(xpath="//button[@name=\"checkout\"]")
	public List<WebElement>	 checkout;

	@FindBy(xpath="//a[@class=\"continueshop\"]")
	public List<WebElement> continueShoping;

	@FindBy(xpath="//div[@class=\"results-count\"]")
	public WebElement resultCount;

	@FindBy(xpath="//p[@class=\"empty_msg\"]")
	public WebElement emptyMessage;

	@FindBy(xpath="//ul[@id=\"account-logged-in\"]/li/a[text()=\"Track Order\"]")
	public WebElement trackOrder;
}
