package com.TestCasesLeavePortal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.LeaveHistoryPOM;

public class ApplyLeaveInvalidDate extends BaseClass {
	@Test
	public void ApplyLeaveInvalidDate() throws InterruptedException
	{
		LeaveHistoryPOM lh =new LeaveHistoryPOM(driver);
		lh.clickLeaveHistory(); 						   
		lh.clickApplyLeave();  
				Thread.sleep(5000);
		lh.ClickFromDate();
		lh.InvalidFromDate();
				Thread.sleep(5000);
		lh.ClickToDate();
		lh.InvalidToDate();
				Thread.sleep(5000);
		lh.SelectWorkFromHomeLeave();
				Thread.sleep(5000);
		lh.EnterComments();
				Thread.sleep(5000);
		lh.SubmitAppliedLeave();	
				Thread.sleep(5000);
//______Validation for status of leave after applying				
			String ExpError="With these dates leave already applied";    //"With these dates leave already exist"
			String ActError=lh.InvalidDateErr.getText();
			Assert.assertEquals(ActError, ExpError);
			
		}

}
