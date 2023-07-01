package com.PageObjectsLeavePortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeaveHistoryPOM {
	
	WebDriver driver;
	public LeaveHistoryPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = "//td[text()='PendingApproval']")
	public WebElement LeaveStatusAfterApply;
	
	
	@FindBy(xpath = "(//td[text()='Cancelled'])[2]")
	public WebElement LeaveStatusAfterCancel;	
	
	@FindBy(xpath = "//a[@id='applyLeave']")
	WebElement LeaveHistory;
	
	@FindBy (xpath = "//a[@title='Apply Leave']")////*[@id="loadtab"]/a
	WebElement ApplyLeave;
		
	@FindBy(xpath = "//a[@class='btn btn-primary pull-right btn-custom savebtn']")
	WebElement Cancel;
	
	@FindBy (xpath = "//input[@class='form-control fromdatepicker applyleave-box']")
	WebElement Fromdate;
	
	@FindBy (xpath = "//input[@class='form-control todatepicker applyleave-box']")
	 WebElement Todate;
	
	@FindBy (xpath = "//select[@id='LeaveTypeDDL']")
	 WebElement leavetype;
	
	@FindBy (xpath = "//textarea[@name='Comments']")
	 WebElement comments;
	
	@FindBy (xpath = "//button[@type='submit']")
	 WebElement submit;

	
	@FindBy (xpath = "(//span[@class='fa fa-pencil'])[1]")
	WebElement EditAppliedLeave;
	
	
	@FindBy (xpath = "(//button[@class='btn btn-primary pull-right btn-custom savebtn'])[1]")
	WebElement CancelAppliedLeave;      
	
	
	
	@FindBy (xpath = "//*[@id='divEmployeeLeave']/div/div/div/div/ul/li[6]/a")
	WebElement NextPage;
	
	
	
	@FindBy (xpath = "//label[text()='With these dates leave already exist']")
	public WebElement InvalidDateErr;
	
	public void clickLeaveHistory()
	{
		
		LeaveHistory.click();
	}
	
	public void clickApplyLeave()
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(ApplyLeave).perform();
		
	}

	public void ClickCancel()
	{
		Cancel.click();
	}
	
	public void ClickFromDate()
	{
		Fromdate.click();
	}
	
	public void ClickToDate()
	{
		Todate.click();
	}
	
	public void ClickLeaveType()
	{
		leavetype.click();
	}
	
	public void EnterComments()
	{
		comments.sendKeys("Enter your comments for leave");
	}
	
	public void SubmitAppliedLeave()
	{
		submit.click();
	}
	
	public void SelectPaidLeave()
	{
		Select s=new Select(driver.findElement(By.id("LeaveTypeDDL")));
		s.selectByVisibleText("Paid");
	}
	public void SelectSickLeave()
	{
		Select s=new Select(driver.findElement(By.id("LeaveTypeDDL")));
		s.selectByVisibleText("Sick");
	}
	public void SelectWorkFromHomeLeave()
	{
		Select s=new Select(driver.findElement(By.id("LeaveTypeDDL")));
		s.selectByVisibleText("Work From Home");
	}
	
	public void EnterFromDate()
	{
		driver.findElement(By.xpath("(//td[@class='day'])[18]")).click();
	}
	public void EnterToDate()
	{
		driver.findElement(By.xpath("(//td[@class='day'])[18]")).click();
	}
	
	public void InvalidFromDate()
	{
		driver.findElement(By.xpath("(//td[@class='day'])[16]")).click();
	}
	public void InvalidToDate()
	{
		driver.findElement(By.xpath("(//td[@class='day'])[16]")).click();
	}
	
	public void EditAppliedLeave()
	{
		EditAppliedLeave.click();
	}
	
	public void ClickToCancelAppliedLeave()
	{
		CancelAppliedLeave.click();
	}
	
	public void ClickOnNextPageButton()
	{
		NextPage.click();
	}
	public void ShowLeaveStatus()
	{
		System.out.println(LeaveStatusAfterApply.getText());
	}


}
