package com.TestCasesLeavePortal;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.LoginPagePOM;
import com.UtilitiesLeavePortal.XLUtils;
import com.aventstack.extentreports.ExtentTest;

public class TC_LoginTestDDT extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void LoginDDT(String user,String pwd) throws InterruptedException
	{
		ExtentTest test=extent.createTest("Verify Login with data driven").assignCategory("LeavePortalDemo").assignDevice("chrome");
		
		test.info("Home page will display");
		test.pass("login successful.");
		driver.get(baseURL);
		System.out.println("12345");
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.EnterUserName(user);
			Thread.sleep(3000);
		lp.EnterPassword(pwd);
			Thread.sleep(3000);
		lp.clickSubmit();
			Thread.sleep(3000);
		
		if(driver.getTitle().equals("LeavePortal"))
		{
			Assert.assertTrue(true);
			lp.clickProfileButton();
				Thread.sleep(3000);
			lp.clickLogoutButton();
				Thread.sleep(3000);
		}
		else
		{
			Assert.assertTrue(false);			
		}
	}
	
		
	@Test
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/TestDataLeavePortal/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sh1");
		
		int colcount=XLUtils.getCellCount(path, "sh1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum;i++)
		{
			for(int j=0; j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "sh1", i,j);
			}
		}
	return logindata;	
	
	}

}
