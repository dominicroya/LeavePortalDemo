package com.TestCasesLeavePortal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.HomePagePOM;

public class TC_002_HomePage extends BaseClass
{
	@Test(priority=3)
	public void show_Employee_Details()
	{
		
		HomePagePOM hp=new HomePagePOM(driver);
		System.out.println("Employee detailes are as follow : ");
		hp.show_Employee_Details();
		Assert.assertEquals(hp.Empname.getText(), "Leave portal Employee");
		Assert.assertEquals(hp.mailID.getText(), "leaveportalemployee@datatemplate.com");
		Assert.assertEquals(hp.Joining_Date.getText(), "01/01/2019");
		Assert.assertEquals(hp.Date_of_Confirmation.getText(), "01/07/2019");
		
		//System.out.println("name: "+hp.Empname.getText());
	}
	
	@Test(priority=4)
	public void show_Leave_Details()
	{
		HomePagePOM hp=new HomePagePOM(driver);
		System.out.println("Leave detailes are as follow : ");
		hp.show_Leave_Details();
		String l=hp.Leave_Balance.getText();
		System.out.println(l);
		float Num_leave_Balance=Float.parseFloat(l);
		System.out.println("..... "+Num_leave_Balance);
		Float Num_Eligible_Leaves=Float.parseFloat(hp.Eligible_Leave.getText());
		Float Num_Sick_Leave_applied=Float.parseFloat(hp.Sick_Leave_Availed.getText());
		Float Num_Paid_Leave_applied=Float.parseFloat(hp.Paid_Leave_Availed.getText());
		Num_leave_Balance=Num_Eligible_Leaves-Num_Sick_Leave_applied-Num_Paid_Leave_applied;
		Assert.assertEquals(Float.parseFloat(hp.Leave_Balance.getText()), Num_leave_Balance);
	}
}
