package com.TestCasesLeavePortal;

import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.MgApprovalRequestPOM;

public class TC_010_ViewEmpLeaveDetails  extends TC_001_ManagerLoginTest{

	@Test(testName="ViewLeaveDetail")
	
	public void ViewLeaveDetail() throws InterruptedException
	{
		MgApprovalRequestPOM vd=new MgApprovalRequestPOM(driver);
		vd.ClickApprovalRequest();  
			Thread.sleep(3000);
		vd.ViewApprovalRequest();
			Thread.sleep(3000);
		vd.ViewEmpName();
		vd.ViewLeaveType();
		vd.ViewLeaveStatus();
		vd.ClickCloseButton();
	}
}
