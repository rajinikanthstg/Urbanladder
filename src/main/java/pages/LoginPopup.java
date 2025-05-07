package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopup {
	
	@FindBy(xpath="//input[@placeholder=\"Email Address\"]")
	public WebElement userEmail;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	public WebElement password;
	
	@FindBy(id="ul_site_login")
	public WebElement loginButton;
	
	@FindBy(xpath="//div[text()=\"Login with your email ID\"]")
	public WebElement loginTitle;
	
	@FindBy(xpath="//a[text()=\"Forgot Password?\"]")
	public WebElement forgotPassword;
	
	@FindBy(xpath="//a[text()=\"Sign-up\"]")
	public WebElement signupLink;
	
	@FindBy(xpath="//a[text()=\"Terms of Service\"]")
	public WebElement termsOfService;
	
	@FindBy(xpath="//a[text()=\"Privacy & Legal Policy\"]")
	public WebElement privacyPolicy;
	
	@FindBy(xpath="//a[normalize-space()=\"Close\"]")
	public WebElement closeButton;
	
	@FindBy(xpath="//div[text()=\"Login with your email ID\"]")
	public WebElement loginText;
	
	@FindBy(xpath="//div[text()=\"The email or password you entered is incorrect. Please try again.\"]")
	public WebElement loginError;
	
	@FindBy(xpath="(//label[@class=\"error\"])[1]")
	public WebElement emailError;
	
	@FindBy(xpath="(//label[@class=\"error\"])[2]")
	public WebElement passwordError;
	
	@FindBy(xpath="//div[text()=\"SIGN UP FOR SALE UPDATES\"]")
	public WebElement signupText;
}
