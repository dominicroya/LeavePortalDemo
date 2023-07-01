package com.TestCasesLeavePortal;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageObjectsLeavePortal.HomePagePOM;
import com.PageObjectsLeavePortal.LeaveHistoryPOM;
import com.PageObjectsLeavePortal.MgApprovalRequestPOM;

public class ManagerFunctions extends BaseClass
{
	//SoftAssert Assert=new SoftAssert();
	
	@Test(priority=12)
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

