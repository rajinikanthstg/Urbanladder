package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPopUp {
	
	@FindBy(id="spree_user_email")
	public WebElement userEmail;
	
	@FindBy(xpath="(//input[@placeholder=\"Password*\"])[2]")
	public WebElement password;
	
	@FindBy(xpath="//input[@value=\"Sign Up\"]")
	public WebElement signupButton;
	
	@FindBy(xpath="//a[text()=\"Show Password\"]")
	public WebElement showPassword;
	
	@FindBy(xpath="//a[text()=\"Log-in\"]")
	public WebElement loginLink;
	
	@FindBy(xpath="//a[text()=\"Terms of Service\"]")
	public WebElement termsOfService;
	
	@FindBy(xpath="//a[text()=\"Privacy & Legal Policy\"]")
	public WebElement privacyPolicy;
	
	@FindBy(xpath="//a[normalize-space()=\"Close\"]")
	public WebElement closeButton;
	
	@FindBy(xpath="//div[text()=\"SIGN UP FOR SALE UPDATES\"]")
	public WebElement signupText;
	
	@FindBy(xpath="//li[text()=\"Email has already been taken\"]")
	public WebElement emailError;

}
