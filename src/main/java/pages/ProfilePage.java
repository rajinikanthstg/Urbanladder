package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage{
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	public WebElement name;
	
	@FindBy(xpath="//input[@placeholder=\"Name\"]")
	public WebElement ename;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
	public WebElement email;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")
	public WebElement mnumber;
	
	@FindBy(xpath="//input[@placeholder=\"Mobile Number\"]")
	public WebElement emnumber;
	
	@FindBy(xpath="//td[@class='profile-value password']")
	public WebElement password;
	
	@FindBy(xpath="//a[@id='edit']")
	public WebElement edit;
	
	@FindBy(xpath="//input[@value='Update']")
	public WebElement update;
	
	@FindBy(xpath="//a[@id='cancel']")
	public WebElement cancel;
	
	@FindBy(xpath="//a[@id='change_password']")
	public WebElement changePassword;
	
	@FindBy(xpath="//input[@id='user_password']")
	public WebElement pword;
	
	@FindBy(xpath="//input[@id='user_password_confirmation']")
	public WebElement cpword;
	
	@FindBy(xpath="//*[@id=\"existing-customer\"]/div/div")
	public WebElement updated;
	
	@FindBy(xpath="(//input[@id=\"spree_user_email\"])[2]")
	public WebElement newEmail;
	
	@FindBy(xpath="(//input[@name=\"spree_user[password]\"])[3]")
	public WebElement newPassword;
	
	@FindBy(xpath="(//input[@id=\"ul_site_login\"])[1]")
	public WebElement newLogin;
	
	@FindBy(xpath="//div[contains(text(),'The email or password you entered is incorrect. Pl')]")
	public WebElement loginError;

}
