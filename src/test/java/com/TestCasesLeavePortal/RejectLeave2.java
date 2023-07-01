package com.TestCasesLeavePortal;

import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.MgApprovalRequestPOM;

public class RejectLeave2 extends TC_001_ManagerLoginTest
{

	@Test(priority=13)
	public void RejectLeave() throws Exception
	{
		MgApprovalRequestPOM ar=new MgApprovalRequestPOM(driver);
		ar.ClickApprovalRequest();
			Thread.sleep(2000);
		ar.ViewPendingRq();
			Thread.sleep(2000);
		ar.EnterComments();
			Thread.sleep(5000);
		ar.RejectLeaveRequest();
			Thread.sleep(5000);	
	}	 
	
	
@Test(priority=14)
	
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
