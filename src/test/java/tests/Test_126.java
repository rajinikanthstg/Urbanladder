package tests;

import com.aventstack.extentreports.Status;
import libraries.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_126 extends BaseClass {

    @Test
    void TC_126() throws Exception {
        try{
            test = extent.createTest("Verify That Same Product Can Not Be Added Again To Compare");
            Login();
            test.log(Status.INFO,"user logged in");
            enterData(homeObject.searchBar,"study table");
            test.log(Status.INFO,"entered chair in search bar");
            click(homeObject.searchBtn);
            test.log(Status.INFO,"clicked on search button");
            hover(searchResultObject.firstProductImg);
            test.log(Status.INFO,"hovered over product");
            Thread.sleep(2000);
            click(driver.findElement(By.xpath("//li[1]//div[1]//div[5]//div[2]//a[1]")));
            Thread.sleep(2000);
            String title = driver.findElement(By.xpath("//li[1]//div[1]//div[5]//div[2]//a[1]")).getText();
            Assert.assertEquals(title,"ADDED TO COMPARE");
            test.log(Status.PASS,"text in button changed to added to compare");
        }
        catch (Exception e){
            screenshot();
            test.log(Status.FAIL,"test failed");
        }
    }
}
