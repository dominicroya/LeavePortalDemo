package com.TestCasesLeavePortal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.PageObjectsLeavePortal.ChangePasswordPOM;
import com.PageObjectsLeavePortal.HolidayListPOM;
import com.PageObjectsLeavePortal.HomePagePOM;
import com.PageObjectsLeavePortal.LeaveHistoryPOM;
import com.PageObjectsLeavePortal.LeavePolicyPOM;
import com.PageObjectsLeavePortal.ViewAppliedLeavePOM;
import com.aventstack.extentreports.ExtentTest;

//____Verification of login functionality

public class TC_001_EmployeeLoginTest extends BaseClass
{
	@Test(priority=1)
	public void LoginTest() throws InterruptedException
	{
		ExtentTest test=extent.createTest("Verify Login").assignCategory("LeavePortalDemo").assignDevice("chrome");
		test.info("Home page will display");
		test.pass("login successful.");
		SoftAssert softAssertion= new SoftAssert();
		if(driver.getTitle().equals("LeavePortal"))
		{
			softAssertion.assertTrue(true);
			System.out.println("Title of page :"+driver.getTitle());
		}
		else
		{
			softAssertion.assertTrue(false);
						
		}
//____Verification of username	
		String PName =driver.findElement(By.xpath("//button[@class='dropdown-toggle set_drop_dwn']")).getText();
		System.out.println("The User name is :" +PName);
	
	}
	
	// Homee page
	
	@Test(priority=2)
	public void show_Employee_Details()
	{
		
		HomePagePOM hp=new HomePagePOM(driver);
		System.out.println("Employee detailes are as follow : ");
		hp.show_Employee_Details();
		Assert.assertEquals(hp.Empname.getText(), "Leave portal Employee");
	}
	
	@Test(priority=3)
	public void show_Leave_Details()
	{
		HomePagePOM hp=new HomePagePOM(driver);
		System.out.println("Leave detailes are as follow : ");
		hp.show_Leave_Details();
	}
	
	
	@Test(priority=4)
	public void LeavePolicy() throws InterruptedException
	{
		LeavePolicyPOM lpc=new LeavePolicyPOM(driver);
		lpc.ClickLeavePolicy();
			Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(lpc.cancel));
		//driver.switchTo().activeElement();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		lpc.ClickCancelButtonLeavePolicy();

		System.out.println("succesfully cancelled");
	}
	
	@Test(priority=5)
	public void holidayList() throws InterruptedException
	{
		HolidayListPOM hl=new HolidayListPOM(driver);		
		hl.clickHolidayList();
			Thread.sleep(3000);
		hl.closeHolidayList();
			Thread.sleep(3000);		
	}
	
	
	//   Leave history
	@Test(priority=6)
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
		}
	//leave type and status of leave validation assertions
	
	@Test(priority=7)
	public void CancelAppliedLeave() throws Exception
	{   
		LeaveHistoryPOM lh =new LeaveHistoryPOM(driver);
		lh.clickLeaveHistory(); 
		Thread.sleep(3000);
			Thread.sleep(3000);
		lh.EditAppliedLeave();
			Thread.sleep(3000);
		lh.ClickToCancelAppliedLeave();
		Thread.sleep(3000);
	}
	
	
	
	@Test(priority=8)
	public void changePassword() throws InterruptedException
	{
		
		ChangePasswordPOM chPwd=new ChangePasswordPOM(driver);
		driver.navigate().refresh();
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
	
	
	@Test(priority=9)
	public void ViewLeaveDetail() throws InterruptedException
	{
		ViewAppliedLeavePOM vl=new ViewAppliedLeavePOM(driver);
		vl.clickLeaveHistory();
			Thread.sleep(3000);
		vl.clickOnVieweye();
			Thread.sleep(3000);	
		vl.clickOnClose();
			Thread.sleep(1000);			
	}
	
	@Test(priority=10)
	public void ChangePasswordDigit() throws InterruptedException
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
