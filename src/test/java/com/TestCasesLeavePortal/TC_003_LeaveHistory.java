package com.TestCasesLeavePortal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageObjectsLeavePortal.LeaveHistoryPOM;
// 
public class TC_003_LeaveHistory extends BaseClass
{
	SoftAssert Assert=new SoftAssert();
	@Test(priority=1)
	public void ApplyLeave() throws InterruptedException
	{
		LeaveHistoryPOM lh =new LeaveHistoryPOM(driver);
		lh.clickLeaveHistory(); 						   
		lh.clickApplyLeave();  
				Thread.sleep(5000);
		lh.ClickFromDate();
		lh.EnterFromDate();
				Thread.sleep(5000);
		lh.ClickToDate();
		lh.EnterToDate();	
				Thread.sleep(5000);
		lh.SelectSickLeave();
				Thread.sleep(5000);
		lh.EnterComments();
				Thread.sleep(5000);
		lh.SubmitAppliedLeave();	
				Thread.sleep(5000);
				
		System.out.println("....."+lh.LeaveStatusAfterApply.getText());
				
		Assert.assertEquals(lh.LeaveStatusAfterApply.getText(), "PendingApproval");
		}
	
	
	//leave type and status of leave validation assertions
	
	@Test(priority=2)
	public void CancelAppliedLeave() throws Exception
	{   
		LeaveHistoryPOM lh =new LeaveHistoryPOM(driver);
		lh.clickLeaveHistory(); 
			Thread.sleep(3000);
		lh.EditAppliedLeave();
			Thread.sleep(3000);
		lh.ClickToCancelAppliedLeave();
	//	WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.visibilityOf());
		Thread.sleep(3000);
		System.out.println("....."+lh.LeaveStatusAfterCancel.getText());
		Assert.assertEquals(lh.LeaveStatusAfterCancel.getText(), "Cancelled");
		
	}

}
