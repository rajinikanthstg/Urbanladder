package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults {
	
	@FindBy(xpath="//div[normalize-space()='Category']")
	public WebElement catFilter;
	
	@FindBy(xpath="//div[normalize-space()=\"Price\"]")
	public WebElement priceFilter;
	
	@FindBy(css="div[class='headersection row text-center'] span[class='results-count']")
	public WebElement resultCount;
	
	@FindBy(xpath="//div[@data-group=\"category\"]//li/label")
	public List<WebElement> catDropdown;
	
	@FindBy(xpath="//span[@class='text']")
	public List<WebElement> selectedOptions;
	
	@FindBy(xpath="//input[@name=\"price_limit\"]")
	public List<WebElement> priceFilterOptions;
	
	@FindBy(xpath="//input[@value=\"In Stock Only\"]")
	public WebElement outOfStockCheck;
	
	@FindBy(xpath="//div[@class=\"sort-box\"]//span")
	public WebElement defaultSortOption;
	
	@FindBy(xpath="//ul[@class=\"sortoptions\"]/li")
	public List<WebElement> sortOptions;
	
	@FindBy(xpath="(//div[@class = \"wishproduct wishblock\"])[1]/span[1]")
	public WebElement firstProductPrice;
	
	@FindBy(xpath="(//a[@class=\"product-img\"])[1]")
	public WebElement firstProductImg;
	
	@FindBy(xpath="//ul/li[@itemscope=\"itemscope\"]/span")
	public WebElement productBreadcrumb;
	
	@FindBy(css="body > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > div:nth-child(14) > a:nth-child(2)")
	public WebElement firstProductViewBtn;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[3]/div[2]/a[1]")
	public WebElement addToCompareBtn;
	
	@FindBy(xpath="(//span[@itemprop=\"name\"])[1]")
	public WebElement searchedProduct;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[5]/div[2]/a[1]")
	public WebElement firstProductCompare;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[3]/ul/li[2]/div/div[5]/div[2]/a[1]")
	public WebElement secondProductCompare;
	
	@FindBy(xpath="(//a[@class=\"product-img\"])[2]")
	public WebElement secondProductImg;

	@FindBy(xpath = "//li[1]//div[1]//div[6]")
	public WebElement firstProductWishIcon;

	@FindBy(xpath = "//div[@class=\"product-info-block\"]/a/div/span[@itemprop=\"name\"]")
	public List<WebElement> productTitles;

}
