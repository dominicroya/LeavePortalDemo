package com.TestCasesLeavePortal;

import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.ChangePasswordPOM;

public class TC_006_ChangePassword extends BaseClass 
{
	@Test(testName="changePassword")
	public void changePassword() throws InterruptedException
	{
		ChangePasswordPOM chPwd=new ChangePasswordPOM(driver);
		chPwd.clickProfileButton1();
			Thread.sleep(3000);
		chPwd.clickChangePwd();
			Thread.sleep(3000);
		chPwd.EnterNewPwd();
			Thread.sleep(3000);
		chPwd.EnterConfirmPwd();
			Thread.sleep(3000);
		chPwd.submit();
		
			Thread.sleep(3000);
		driver.navigate().refresh();
		
	}
}