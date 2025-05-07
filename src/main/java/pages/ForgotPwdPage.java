package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPwdPage {
	
	@FindBy(xpath="//td/input[@placeholder=\"Email Address\"]")
	public WebElement forgotEmail;
	
	@FindBy(xpath="//h6[text()=\"Please submit your registered email address, so that we can send you the link to set your password.\"]")
	public WebElement infoMessage;

}
