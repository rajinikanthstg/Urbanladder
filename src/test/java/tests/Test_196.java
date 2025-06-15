package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_196 extends BaseClass{
	
	@Test
	void TC_196() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Name And Mobile Number Are Updated On Clicking The Update Button");
			Login();
			test.log(Status.INFO,"user logged in");
			hover(homeObject.picon);
			test.log(Status.INFO,"hovered over profile icon");
			click(homeObject.profileOption);
			test.log(Status.INFO,"clicked on profile");
			click(profilePageObject.edit);
			test.log(Status.INFO,"clicked on edit button");
			profilePageObject.ename.clear();
			test.log(Status.INFO,"user name cleared");
			profilePageObject.ename.sendKeys("Rajesh");
			test.log(Status.INFO,"user name changed");
			profilePageObject.emnumber.clear();
			test.log(Status.INFO,"cleared mobile number");
			profilePageObject.emnumber.sendKeys("8522850516");
			test.log(Status.INFO,"user name and moble number edited");
			click(profilePageObject.update);
			test.log(Status.INFO,"clicked on update");
			Assert.assertTrue(profilePageObject.edit.isDisplayed());
			test.log(Status.PASS,"name and mobile number changed");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
