package tests;

import com.aventstack.extentreports.Status;
import libraries.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_134 extends BaseClass {

    @Test
    void TC_134() throws Exception {
        try{
            test = extent.createTest("Verify The Product Can Be Removed From Product Comparing Page From The PopUp");
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
            click(addToComparePopup.removeInPopup.get(0));
            test.log(Status.INFO,"clicked on remove button");
            Assert.assertEquals(addToComparePopup.removeInPopup.size(),1);
            test.log(Status.PASS,"product removed from compare");
        }
        catch(Exception e){
            screenshot();
            test.log(Status.FAIL,"test failed");
        }
    }
}
