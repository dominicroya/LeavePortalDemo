package com.TestCasesLeavePortal;

import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.LeaveHistoryPOM;
import com.PageObjectsLeavePortal.MgApprovalRequestPOM;

public class TC_011_EmployeeRejectLeave extends BaseClass
{
	@Test(priority=11)
	public void apply() throws InterruptedException
	{
		LeaveHistoryPOM al= new LeaveHistoryPOM(driver);
		al.clickLeaveHistory(); 						   
		al.clickApplyLeave();  
				Thread.sleep(5000);
		al.ClickFromDate(); 
		al.EnterFromDate();
				Thread.sleep(5000);
		al.ClickToDate();
		al.EnterToDate();	
				Thread.sleep(5000);
		al.SelectSickLeave();
				Thread.sleep(5000);
		al.EnterComments();
				Thread.sleep(5000);
		al.SubmitAppliedLeave();
				Thread.sleep(5000);		
	}	
}

 class RejectLeave extends TC_001_ManagerLoginTest
{
	@Test(priority=12)
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
		
@Test(priority=13)
	
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
 
 
 