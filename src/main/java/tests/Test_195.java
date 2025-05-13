package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import libraries.BaseClass;

public class Test_195 extends BaseClass{
	
	@Test
	void TC_195() throws Exception
	{
		try {
			test = extent.createTest("Verify That The Edit Button In My Account Page Allows To Edit The Name And Mobile Number");
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
			test.log(Status.PASS,"user name and moble number edited");
		}
		catch(Exception e) {
			screenshot();
			test.log(Status.FAIL,"test failed");
		}
	}

}
