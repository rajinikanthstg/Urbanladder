package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Navbar{
	
	@FindBy(xpath="//a/strong[text()=\"Shop Now\"]")
	public WebElement shopNow;
	
	@FindBy(xpath="(//a[normalize-space()=\"Help\"])[1]")
	public WebElement help;
	
	@FindBy(xpath="//a[normalize-space()=\"Find a Store\"] ")
	public WebElement findAStore;
	
	@FindBy(xpath="//a[normalize-space()=\"Bulk Orders\"] ")
	public WebElement bulkOrders;
	
	@FindBy(xpath="//a[normalize-space()=\"UL Services\"] ")
	public WebElement ulServices;
	
	@FindBy(className="header__topBar_logo")
	public WebElement logo;
	
	@FindBy(id="search")
	public WebElement searchBar;
	
	@FindBy(xpath="//li[@class=\"header__topBarIconList_profile-icon\"]")
	public WebElement picon;
	
	@FindBy(xpath="//a[@id=\"header-icon-profile\"]")
	public WebElement profileOption;
	
	@FindBy(xpath="//a[text()=\"Orders\"]")
	public WebElement orders;
	
	@FindBy(xpath="//a[text()=\"Vouchers\"]")
	public WebElement vouchers;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	public WebElement logout;
	
	@FindBy(xpath="//div[@id=\"head-alert\"]//a")
	public WebElement headerAlert;
	
	@FindBy(xpath="//div[@id=\"search-results\"]")
	public WebElement searchResult;
	
	@FindBy(xpath="//a[@title=\"Wishlist\"]")
	public WebElement whishList;
	
	@FindBy(xpath="//button[@id=\"search_button\"]")
	public WebElement searchBtn;
	
	@FindBy(xpath="//a[@title=\"Track Order\"]")
	public WebElement trackOrdericon;
	
	@FindBy(xpath="//a[@title=\"Cart\"]")
	public WebElement cartIcon;

}
