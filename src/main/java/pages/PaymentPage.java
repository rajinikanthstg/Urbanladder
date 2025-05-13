package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	
	@FindBy(xpath="//span[text()=\"View plans\"]")
	public WebElement viewPlans;
	
	@FindBy(xpath="//span[text()=\"Available on payments made via Razorpay\"]")
	public WebElement emiOptions;
	
	@FindBy(xpath="//button[@data-testid=\"plan-header\"]")
	public List<WebElement> planHeaders;
	
	@FindBy(xpath="//ul[@class=\"plans-list svelte-epef1g\"]")
	public WebElement plansList;
	
	@FindBy(xpath="//span[text()=\"View offers\"]")
	public WebElement viewOffers;
	
	@FindBy(xpath="//span[text()=\"Available on payments made via Razorpay\"]")
	public WebElement offersAndDiscounts;
	
	@FindBy(xpath="//span[text()=\"Email-Id:\"]/following-sibling::strong")
	public WebElement email;
	
	@FindBy(xpath="//span[text()=\"Mobile:\"]/following-sibling::strong")
	public WebElement mnumber;
	
	@FindBy(xpath="//input[@value='Place Order']")
	public WebElement placeOrder;
	
	@FindBy(xpath="//span[@class='font-semibold leading-5 text-on-surface text-opacity-70']")
	public WebElement paymentOptions;
	
	@FindBy(xpath="//iframe[@class=\"razorpay-checkout-frame\"]")
	public WebElement checkoutFrame;
	
	@FindBy(xpath="//img[@alt='Urban Ladder - Online furniture store']")
	public WebElement logo;
}
