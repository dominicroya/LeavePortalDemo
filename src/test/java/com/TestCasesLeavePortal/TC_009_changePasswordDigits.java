package com.TestCasesLeavePortal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageObjectsLeavePortal.ChangePasswordPOM;
import junit.framework.Assert;

// Validation of Error message for mismatching changed password 
// Login - Change Password - New Password= 12345 - Confirm new Password= 123 - Error msg-
// - Refresh -Logout

public class TC_009_changePasswordDigits extends BaseClass
{
	@Test(testName="ChangePassword")
	public void ChangePassword() throws InterruptedException
	{
		ChangePasswordPOM cpd=new ChangePasswordPOM(driver);
		cpd.clickProfileButton1();
		cpd.clickChangePwd();
			Thread.sleep(2000);
		cpd.EnterNewInvPwd();
			Thread.sleep(2000);
		cpd.EnterConfirmInvPwd();
			Thread.sleep(2000);
		cpd.submit();
				
				//Validation
		String ExpError="Password must be atleast 8 characters ";
		String ActError=cpd.errorm.getText();
		Assert.assertEquals(ExpError, ActError);
		driver.navigate().refresh();
	
	}
}
