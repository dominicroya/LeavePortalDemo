package com.TestCasesLeavePortal;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

public class TC_007_Logout extends BaseClass
{
	@Test
	public void Logout()
	{
		ExtentTest test=extent.createTest("Verify Logout").assignCategory("LeavePortalDemo").assignDevice("chrome");
		test.info("After Logout Home page will display");
		test.pass("Logout successful.");
		
	if(driver.getTitle().equals("LeavePortal"))
	{
		Assert.assertTrue(true);
		System.out.println("Title of page :"+driver.getTitle());
	}
	else
	{
		Assert.assertTrue(false);
		
		
	}
	
	}
}
