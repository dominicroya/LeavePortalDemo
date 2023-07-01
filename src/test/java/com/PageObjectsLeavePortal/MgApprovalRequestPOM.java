package com.PageObjectsLeavePortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MgApprovalRequestPOM {
	
	WebDriver driver;
	public MgApprovalRequestPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@id='pendingApproval']")
	private WebElement MGapprovalreq;
	
	@FindBy (xpath = "(//span[@class='fa fa-eye'])[1]")  //(//span[@class='fa fa-eye'])[1]
	private WebElement view;
	
	@FindBy (xpath = "(//div[@class='col-md-3'])[3]")
	private WebElement EmpName;
	
	@FindBy (xpath = "(//div[@class='col-md-3'])[11]")
	private WebElement leavetype;
	
	@FindBy (xpath = "//div[@class='col-md-3 mobile-applylevaestatus']")
	private WebElement leavestatus;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement close;
	
	@FindBy(xpath="//span[@class='fa fa-pencil']")
	WebElement ViewRq;

	@FindBy(xpath="//textarea[@id='txtManagerComment']")
	WebElement comment;
	
	@FindBy(xpath="//button[@id='btnReject']")
	WebElement RejectLeave;
	
	//button[@class='close']
	@FindBy(xpath="//button[@class='close']")
	WebElement close1;
	
	public void ClickApprovalRequest()
	{
		MGapprovalreq.click();
	}
	
	public void ViewApprovalRequest()
	{
		view.click();
	}
	
	public void ViewEmpName()
	{
		System.out.println("Employee name : "+ EmpName.getText());//EmpName.getText()
	}
	public void ViewLeaveType()
	{
		System.out.println("Leave Type : "+ leavetype.getText());//EmpName.getText()
	}
	public void ViewLeaveStatus()
	{
		System.out.println("Leave Status : "+ leavestatus.getText());//EmpName.getText()
	}
	
	public void ClickCloseButton()
	{
		close.click();
	}
	public void ViewPendingRq()
	{
		ViewRq.click();
	}
	public void RejectLeaveRequest()
	{
		RejectLeave.click();
	}
	
	public void EnterComments()
	{
		comment.sendKeys("Enter your comments to Approve, Reject or Reassign leave");
	}
	
	public void closeRqWindow()
	{
		close1.click();
	}

}
