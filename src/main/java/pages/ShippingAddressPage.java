package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingAddressPage {
	
	@FindBy(xpath="//div[@class='user-email-wrap clearfix']//input")
	public WebElement email;
	
	@FindBy(xpath="(//input[@placeholder=\"PIN Code\"])[1]")
	public WebElement pincode;
	
	@FindBy(xpath="//input[@id=\"city_state\"]")
	public WebElement city;
	
	@FindBy(xpath="(//textarea[@placeholder=\"Address\"])[1]")
	public WebElement address;
	
	@FindBy(xpath="(//input[@placeholder=\"First Name\"])[1]")
	public WebElement firstName;
	
	@FindBy(xpath="(//input[@placeholder=\"Last Name\"])[1]")
	public WebElement lastName;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter 10 digit mobile number\"])[1]")
	public WebElement mnumber;
	
	@FindBy(xpath="//input[@id=\"order_use_shipping\"]")
	public WebElement addressCheckBox;
	
	@FindBy(xpath="(//ul[@class=\"inner\"])[2]")
	public WebElement billingAddress;
	
	@FindBy(xpath="(//input[@placeholder=\"First Name\"])[2]")
	public WebElement billingFirstname;
	
	@FindBy(xpath="(//input[@placeholder=\"Last Name\"])[2]")
	public WebElement billingLastname;
	
	@FindBy(xpath="(//input[@placeholder=\"PIN Code\"])[2]")
	public WebElement billingPincode;
	
	@FindBy(xpath="(//textarea[@placeholder=\"Address\"])[2]")
	public WebElement billAddress;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter 10 digit mobile number\"])[2]")
	public WebElement billingMnumber;
	
	@FindBy(xpath="//input[@value=\"Save and Continue\"]")
	public WebElement saveAndContinue;
	
	@FindBy(xpath="//img[@alt='Urban Ladder - Online furniture store']")
	public WebElement logo;

}
