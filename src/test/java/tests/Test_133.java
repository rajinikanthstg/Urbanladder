package tests;

import com.aventstack.extentreports.Status;
import libraries.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_133 extends BaseClass {

    @Test
    void TC_133() throws Exception {
        try{
            test = extent.createTest("Verify That The Product Can Be Removed From Product Comparing");
            Login();
            test.log(Status.INFO,"user logged in");
            enterData(homeObject.searchBar,"study lamp");
            test.log(Status.INFO,"entered lamp in search box");
            click(homeObject.searchBtn);
            test.log(Status.INFO,"clicked on search button");
            hover(searchResultObject.firstProductImg);
            test.log(Status.INFO,"hovered over first search result");
            click(searchResultObject.firstProductCompare);
            Thread.sleep(2000);
            hover(searchResultObject.secondProductImg);
            test.log(Status.INFO,"hovered over second search result");
            click(searchResultObject.secondProductCompare);
            Thread.sleep(2000);
            click(addToComparePopup.compareBtn);
            test.log(Status.INFO,"navigated to product compare page");
            click(addToComparePopup.removeBtn);
            test.log(Status.INFO,"clicked on remove button of product");
            Assert.assertEquals(addToComparePopup.productsInCompare.size(),1);
            test.log(Status.PASS,"product removed from compare");
        }
        catch(Exception e){
            screenshot();
            test.log(Status.FAIL,"test failed");
        }
    }
}
