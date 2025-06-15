package tests;

import com.aventstack.extentreports.Status;
import libraries.BaseClass;
import org.testng.annotations.Test;

public class Test_136 extends BaseClass {
    @Test
    void TC_136() throws Exception {
        try{
            test = extent.createTest("Verify The Logo Navigates To Homepage On Clicking");
            Login();
            test.log(Status.INFO,"user logged in");
            enterData(homeObject.searchBar,"study lamp");
            test.log(Status.INFO,"entered lamp in search box");
            click(homeObject.searchBtn);
            test.log(Status.INFO,"clicked on search button");
            hover(searchResultObject.firstProductImg);
            test.log(Status.INFO,"hovered over first search result");
            click(searchResultObject.firstProductCompare);
            test.log(Status.INFO,"product added to compare");
            Thread.sleep(2000);
            hover(searchResultObject.secondProductImg);
            test.log(Status.INFO,"hovered over second search result");
            click(searchResultObject.secondProductCompare);
            test.log(Status.INFO,"added product to compare");
            click(addToComparePopup.compareBtn);
            test.log(Status.INFO,"navigated to product compare page");
            click(addToComparePopup.logo);
            System.out.println(homeObject.picon.isDisplayed());
            test.log(Status.PASS,"navigated to homepage");

        }
        catch(Exception e){
            screenshot();
            test.log(Status.FAIL,"test failed");
        }
    }
}
