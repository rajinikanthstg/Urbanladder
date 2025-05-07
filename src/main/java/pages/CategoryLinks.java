package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryLinks {
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[1]")
	public WebElement newArrivals;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[2]")
	public WebElement sofas;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[3]")
	public WebElement sofacumbed;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[4]")
	public WebElement beds;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[5]")
	public WebElement diningLink;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[6]")
	public WebElement wardrobes;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[7]")
	public WebElement shoeracks;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[1]//a[8]")
	public WebElement boockshelves;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[1]")
	public WebElement tvunits;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[2]")
	public WebElement recliners;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[3]")
	public WebElement seatingLink;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[4]")
	public WebElement coffeetable;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[5]")
	public WebElement studyLink;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[6]")
	public WebElement dealzn;
	
	@FindBy(xpath="(//div[@class=\"categories row\"])[2]//a[7]")
	public WebElement store50;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div[1]/div")
	public WebElement imgLink1;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div[3]/ul/li[2]/a[1]/img")
	public WebElement imgLink2;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div[3]/ul/li[2]/a[1]/img")
	public WebElement imgLink3;
	
	
	@FindBy(xpath="(//a[text()=\"Shop now\"])[1]")
	public WebElement shopNowLink1;
	
	@FindBy(xpath="(//a[text()=\"Shop now\"])[2]")
	public WebElement shopNowLink2;
	
	@FindBy(xpath="(//a[text()=\"Shop now\"])[3]")
	public WebElement shopNowLink3;
	
	@FindBy(xpath="//h2[text()=\"Lounge Chairs\"]/following-sibling::a")
	public WebElement loungueChairs;
	
	@FindBy(xpath="//h2[text()=\"Carpets\"]/following-sibling::a")
	public WebElement carpets;
	
	@FindBy(xpath="//h2[text()=\"Shoe Racks\"]/following-sibling::a")
	public WebElement shoeRacksLink;
	
	@FindBy(xpath="//h2[text()=\"Floor Lamps\"]/following-sibling::a")
	public WebElement floorLamps;
	
	@FindBy(xpath="//img[@alt='Collection RANGE']")
	public WebElement collectRangeImg1;
	
	@FindBy(xpath="//body/div[@class='container']/div[@id='wrapper']/div[@id='content']/div[8]/div[1]/div[3]/a[1]")
	public WebElement cExplore1;
	
	@FindBy(xpath="//img[@alt='Baltoro Range']")
	public WebElement collectRangeImg2;	
	
	@FindBy(xpath="//ul[@class='range-products three-column']//li[1]//a[2]")
	public WebElement cExplore2;
	
	@FindBy(xpath="//img[@alt='Iwaki Range']")
	public WebElement collectRangeImg3;
	
	@FindBy(xpath="//ul[@class='range-products three-column']//li[2]//a[2]")
	public WebElement cExplore3;
	
	@FindBy(xpath="//img[@alt='Vector Range']")
	public WebElement collectRangeImg4;
	
	@FindBy(xpath="//div[@class='content row range-section divider-line dual-bg-second-half text-center']//li[3]//a[2]")
	public WebElement cExplore4;
	
	
	@FindBy(xpath="//body/div[@class='container']/div[@id='wrapper']/div[@id='content']/div[9]/div[1]")
	public WebElement arrivalSection;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[1]//a[2]//button[1]")
	public WebElement arrBtn1;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[2]//a[2]//button[1]")
	public WebElement arrBtn2;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[3]//a[2]//button[1]")
	public WebElement arrBtn3;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[1]//a[2]//button[1]")
	public WebElement arrBtn4;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[2]//a[2]//button[1]")
	public WebElement arrBtn5;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[3]//a[2]//button[1]")
	public WebElement arrBtn6;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[1]//a[2]//button[1]")
	public WebElement arrBtn7;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//li[2]//a[2]//button[1]")
	public WebElement arrBtn8;
	
	@FindBy(xpath="//span[@data-ganextaction='home.carousel.newarrivals.next']")
	public WebElement nextArrow;
	
	@FindBy(xpath="//body/div[@class='container']/div[@id='wrapper']/div[@id='content']/div[10]/div[1]")
	public WebElement storeLinks;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//img[@alt='Desktop_Carousel_Bangalore-store']")
	public WebElement bangloreStore;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//img[@alt='Desktop_Carousel_Delhi-store']")
	public WebElement delhiStore;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//img[@alt='Desktop_Carousel_Mumbai-store']")
	public WebElement mumbaiStore;
	
	@FindBy(xpath="//img[@alt='Desktop_Carousel_Hyderabad-store']")
	public WebElement hyderabadstore;
	
	@FindBy(xpath="//img[@alt='Desktop_Carousel-Chennai-store']")
	public WebElement chennaiStore;
	
	@FindBy(xpath="//img[@alt='Desktop_Carousel_Pune-store']")
	public WebElement puneStore;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//img[@alt='Desktop_Carousel-Kolkata-store']")
	public WebElement kolkataStore;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//img[@alt='Desktop_Carousel-Kochi-store']")
	public WebElement kochiStore;
	
	@FindBy(xpath="//li[@class='slick-slide slick-active']//img[@alt='Desktop_Carousel-Explore-stores']")
	public WebElement allStores;
	
	@FindBy(xpath="//span[@data-ganextaction='home.carousel.limtedtimedeals.next']")
	public WebElement nextStore;
	
	@FindBy(xpath="//div[@id='footer-links']")
	public WebElement footerLinks;
	
	@FindBy(xpath="//div[@id='footer-links']//div[@class='col-md-3 links']/ul/li/a")
	public List<WebElement> company;
	
	@FindBy(xpath="//div[@class='footer-delivery']")
	public WebElement footerDelivery;
	
	@FindBy(xpath="//div[@class='col-md-4 links']//ul/li/a")
	public List<WebElement> moreInformation;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[1]")
	public WebElement feesAndPayment;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[2]")
	public WebElement shippinAndDelivery;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[3]")
	public WebElement termsAndConditions;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[4]")
	public WebElement warranty;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[5]")
	public WebElement contactUs;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[6]")
	public WebElement visitUs;
	
	@FindBy(xpath="(//div[@class='col-md-4 links']//ul/li/a)[7]")
	public WebElement buyInBulk;
	
	@FindBy(xpath="//a[normalize-space()='Refer & Earn']")
	public WebElement referAndEarn;
	
	@FindBy(xpath="//ul[@id='footer-social']")
	public WebElement footerSocial;
	
	@FindBy(xpath="//div[@class=\"download-btns\"]")
	public WebElement downloadImages;
	
	@FindBy(xpath="//div[@class=\"download-btns\"]/a/img")
	public List<WebElement> downloads;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[1]")
	public WebElement popularFurnitureCat;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[1]/following-sibling::ul/li/a")
	public List<WebElement> popularLinks;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[2]")
	public WebElement furnitureByRoomCat;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[2]/following-sibling::ul/li/a")
	public List<WebElement> furnitureByRoom;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[3]")
	public WebElement popularDecorCat;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[3]/following-sibling::ul/li/a")
	public List<WebElement> popularDecor;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[4]")
	public WebElement popularMattressCat;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[4]/following-sibling::ul/li/a")
	public List<WebElement> popularMattress;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[5]")
	public WebElement popularTableWareCat;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[5]/following-sibling::ul/li/a")
	public List<WebElement> popularTableWare;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[6]")
	public WebElement deliveringIn;
	
	@FindBy(xpath="(//div[@class=\"category-heading\"])[6]/following-sibling::div//a")
	public WebElement deliveringInLink;
	
	
	
	
	
}
