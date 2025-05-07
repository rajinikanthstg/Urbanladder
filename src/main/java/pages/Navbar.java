package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navbar extends CategoryLinks{
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Oasis Collection\"]")
	public WebElement oasisCollection;
	
	@FindBy(xpath="//li[@class='topnav_item oasiscollectionunit']//li[@class='sublist_item']")
	public WebElement oasisDropdown;
	
	@FindBy(xpath="//span[normalize-space()='Explore Oasis']")
	public WebElement exploreOasis;
	
	@FindBy(xpath="//span[normalize-space()='Explore Full Collection']")
	public WebElement exploreFullCollection;
	
	@FindBy(xpath="//span[normalize-space()='Oasis Sofas Collection']")
	public WebElement oasisSofaCollection;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Deal Zone\"]")
	public WebElement dealsZone;
	
	@FindBy(xpath="//li[@class=\"topnav_item dealzoneunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement dealzoneDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Top Deals']")
	public WebElement topDeals;
	
	@FindBy(xpath="//a[normalize-space()='All Furniture']")
	public WebElement allFurniture;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Sofas & Recliners\"]")
	public WebElement sofasRecliners;
	
	@FindBy(xpath="//li[@class=\"topnav_item sofasunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement sofasDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Sofa Set']")
	public WebElement sofaSet;
	
	@FindBy(xpath="//a[normalize-space()='Recliner Sofas']")
	public WebElement reclinerSofas;
	
	@FindBy(xpath="//a[normalize-space()='Sofa Bed']")
	public WebElement sofabed;
	
	@FindBy(xpath="//a[normalize-space()='Seating']")
	public WebElement seating;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Living\"]")
	public WebElement living;
	
	@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement livingDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Tables']")
	public WebElement tables;
	
	@FindBy(xpath="//a[normalize-space()='Living Storage']")
	public WebElement livingstorage;
	
	@FindBy(xpath="//a[@href='/seating?src=g_topnav_living_seating']")
	public WebElement livingseating;
	
	@FindBy(xpath="//li[@class='topnav_item livingunit']//li[4]//div[1]")
	public WebElement outdoor;
	
	@FindBy(xpath="//a[@rel='nofollow'][normalize-space()='Oasis Collection']")
	public WebElement livingOasisCollec;	
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Bedroom & Mattresses\"]")
	public WebElement bedroomMattresses;
	
	@FindBy(xpath="//li[@class=\"topnav_item bedroomunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement bedroomMattressesDropdown;
	
	@FindBy(xpath="//a[normalize-space()='All Beds']")
	public WebElement allBeds;
	
	@FindBy(xpath="//a[normalize-space()='Mattresses']")
	public WebElement mattresses;
	
	@FindBy(xpath="//a[normalize-space()='Storage & Accessories']")
	public WebElement storage;
	
	
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Dining\"]")
	public WebElement dining;
	
	@FindBy(xpath="//li[@class=\"topnav_item diningunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement diningDropdown;
	
	@FindBy(xpath="//a[normalize-space()='Storage & Bar Furniture']")
	public WebElement storageBarfurniture;
	
	@FindBy(xpath="//a[normalize-space()='Dining Table Set']")
	public WebElement dinigtableset;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Storage Furniture\"]")
	public WebElement storageFurniture;
	
	@FindBy(xpath="//li[@class=\"topnav_item storagefurnitureunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement storageFurnitureDropdown;
	
	@FindBy(xpath="(//a[normalize-space()='Living Storage'])[2]")
	public WebElement livingStorage;
	
	@FindBy(xpath="//a[normalize-space()='Bedroom Storage']")
	public WebElement bedroomStorage;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Study\"]")
	public WebElement study;
	
	@FindBy(xpath="//li[@class=\"topnav_item studyunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement studyDropdown;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Lighting & Decor\"]")
	public WebElement lightDecor;
	
	@FindBy(xpath="//li[@class=\"topnav_item lightingunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement lightingdropdown;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Interiors\"]")
	public WebElement interiors;
	
	@FindBy(xpath="//li[@class=\"topnav_item interiorsunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement interiorsDropdown;
	
	@FindBy(xpath="//div[@id=\"topnav_wrapper\"]//span[normalize-space()=\"Stores\"]")
	public WebElement stores;
	
	@FindBy(xpath="//li[@class=\"topnav_item storesunit\"]//ul[@class=\"inline-list left\"]")
	public WebElement storesDropdown;
	
	//a[@href='/explore-oasis-collection?src=g_topnav_oasis-collection_oasis-collection_explore-oasis']

}
