package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCompare{
	
	@FindBy(xpath="//div[@class=\"prod-name\"]")
	public List<WebElement> compareProducts;
	
	@FindBy(xpath="//div[@class=\"compare-error-message\"]")
	public WebElement errorMessage;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[6]/div/div")
	public WebElement errorMessage2;
	
	@FindBy(xpath="//button[@id=\"compare-cta\" and @class=\"button\"]")
	public WebElement compareBtn;
	
	@FindBy(xpath="//button[@class=\"button disabled\"]")
	public WebElement compareBtnDisabled;
	
	@FindBy(xpath="//*[@id=\"comparator-modal\"]/div/div[1]/div")
	public WebElement comparePageHeading;
	
	@FindBy(xpath="//*[@id=\"comparator-modal\"]/div/div[2]/div[3]")
	public WebElement compareProps;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	public WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"comparator-modal\"]/div/div[2]/div[1]/div[1]/div[3]/a")
	public WebElement viewProduct;

	@FindBy(xpath = "(//div[@class=\"remove-prod-cta\"])[3]")
	public WebElement removeBtn;

	@FindBy(xpath = "//div[@class=\"products-comparator row row-centered\"]/div")
	public List<WebElement> productsInCompare;

	@FindBy(xpath = "//div[@class=\"remove-prod-cta\"]")
	public List<WebElement> removeInPopup;

	@FindBy(xpath = "//*[@id=\"comparator-modal\"]/div/div[1]/div/a/img")
	public WebElement logo;
}
