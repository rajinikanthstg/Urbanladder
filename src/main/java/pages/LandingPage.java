package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	public WebElement profileIcon;
	
	@FindBy(id="header-icon-login")
	public WebElement loginOption;
	
	@FindBy(id="header-icon-signup")
	public WebElement signupOption;
}
