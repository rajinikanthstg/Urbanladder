package libraries;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.*;

public class BaseClass extends ExcelBase {
	
	public static WebDriver driver;
	public static Properties config;
	public static File f;
	public static FileInputStream fis;
	public static Actions action;
	
	
	public static String filename;
	public static String sheet;
	public static int totalRows;
	public static int cellCount;
	
	public static ExtentHtmlReporter htmlReporter = null;
	public static ExtentReports extent = null;
	public static ExtentTest test = null;
	
	public static HomePage homeObject = null;
	public static LandingPage landingObject = null;
	public static LoginPopup loginObject = null;
	public static SignupPopUp signupObject = null;
	public static ForgotPwdPage forgotPwdObject = null;
	public static List<WebElement> links = null;
	public static ListIterator<WebElement> it = null;
	public static SearchResults searchResultObject = null;
	public static ProductPage productPageObject = null;
	public static WishListPage wishListObject = null;
	public static AddToCompare addToComparePopup = null;
	public static CartPage cartObject = null;
	public static ShippingAddressPage shippingPageObject= null;
	public static PaymentPage paymentPageObject = null;
	public static ProfilePage profilePageObject = null;
	
	@BeforeSuite
	public static void init() throws Exception
	{
		config = new Properties();
		f = new File(System.getProperty("user.dir")+"\\config.properties");
		fis = new FileInputStream(f);
		
		config.load(fis);
		
		if(config.getProperty("BrowserType").equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(config.getProperty("BrowserType").equals("FireFox"))
		{
			WebDriverManager.edgedriver().setup();			
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(config.getProperty("URL"));
		driver.manage().window().maximize();
		action = new Actions(driver);
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\TestReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
           
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Test Reports");
        htmlReporter.config().setReportName("Test Reports ");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        
        homeObject = PageFactory.initElements(driver,HomePage.class);
		landingObject = PageFactory.initElements(driver,LandingPage.class);
		loginObject = PageFactory.initElements(driver,LoginPopup.class);
		signupObject = PageFactory.initElements(driver,SignupPopUp.class);
		forgotPwdObject = PageFactory.initElements(driver,ForgotPwdPage.class);
		searchResultObject = PageFactory.initElements(driver,SearchResults.class);
		productPageObject = PageFactory.initElements(driver,ProductPage.class);
		wishListObject = PageFactory.initElements(driver,WishListPage.class);
		addToComparePopup = PageFactory.initElements(driver,AddToCompare.class);
		cartObject = PageFactory.initElements(driver,CartPage.class);
		shippingPageObject  = PageFactory.initElements(driver,ShippingAddressPage.class);
		paymentPageObject = PageFactory.initElements(driver, PaymentPage.class);
		profilePageObject = PageFactory.initElements(driver,ProfilePage.class);
		
//		Login();
	}
	
	public static void ExplicitWait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void enterData(WebElement element,String data)
	{
		element.sendKeys(data);
	}	
	
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void hover(WebElement element)
	{
		action.moveToElement(element).build().perform();
	}
	
	public static void actionsClick(WebElement element)
	{
		action.click(element).build().perform();
	}
	
	public static void scrollToElement(WebElement element)
	{
		action.moveToElement(element).build().perform();
	}
	
	@DataProvider
	public Object[][] readExcel() throws Exception
	{		
		Object[][] data = new Object[totalRows][cellCount];
		
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j] = ExcelBase.getCellData(filename, sheet, i, j);
			}
		}
		return data;
	}
	
	public static void SwitchToFrame(String frame)
	{
		driver.switchTo().frame(frame);
	}
	
	public static void SwitchToParentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public static void Login()
	{	
		hover(landingObject.profileIcon);
		click(landingObject.loginOption);
		enterData(loginObject.userEmail,config.getProperty("email"));
		enterData(loginObject.password,config.getProperty("password"));
		click(loginObject.loginButton);
	}
	
	public static void Logout()
	{	
		scrollToElement(homeObject.picon);
		hover(homeObject.picon);
		click(homeObject.logout);
	}
	
	public static String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public static boolean isVisible(WebElement element)
	{
		return element.isDisplayed();
	}
	
	@AfterSuite
	public void endTest() throws Exception
	{
//		driver.quit();
		extent.flush();
	}
	
	public static void readDropdown(WebElement element,String title)
	{
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		
		for(WebElement e:options)
		{
			if(e.getText().equals(title))
			{
				System.out.println("Job title found in dropdown");
			}
		}	
	}
	
	@AfterMethod
    public void getResult(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
        }
    }
	
	public static void screenshot() throws Exception
	{
		Thread.sleep(3000);
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\"+timestamp()+"image.png");
		
		src.renameTo(dest);
	}
	
	public static String timestamp() 
	{
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	} 
	
	public static void checkDropdown(WebElement navElement,WebElement subnavElement) throws Exception
	{
		hover(navElement);
		test.log(Status.INFO,"hovered over "+navElement.getText());
		Thread.sleep(2000);
		Assert.assertTrue(subnavElement.isDisplayed());
		test.log(Status.PASS,navElement.getText()+" dropdown displayed");
	}
	
	public static List<String> WindowHandles()
	{
		String parent = driver.getWindowHandle();
		
		Set<String> childs = driver.getWindowHandles();
		
		Iterator<String> it = childs.iterator();
		
		String child = "";
		
		while(it.hasNext())
		{
			child = it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
			}
		}
		
		List<String> windows = new ArrayList<>();
		windows.add(parent);
		windows.add(child);
		
		return windows;
	}
	
	public static void scrollToView(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public static void SelectByText(List<WebElement> options,String option)
	{
		for(WebElement e:options) {
			if(e.getText().equalsIgnoreCase(option)) {
				click(e);
				break;
			}
		}
	}
	
	public static void SelectByValue(List<WebElement> options,String option)
	{
		for(WebElement e:options) {
			if(e.getAttribute("value").equalsIgnoreCase(option)) {
				click(e);
				break;
			}
		}
	}
}
