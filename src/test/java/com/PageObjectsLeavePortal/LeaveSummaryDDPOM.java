package com.PageObjectsLeavePortal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveSummaryDDPOM {
	
	WebDriver driver;
	public LeaveSummaryDDPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
    //Leave Summary
    @FindBy(xpath = "(//span[@class='summary-label'])[8]") 
    public WebElement Sick_Leave_Availed;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[9]") 
    public WebElement Paid_Leave_Availed;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[10]") 
    public WebElement Eligible_Leave;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[11]") 
    public WebElement Waiting_For_Approval;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[12]") 
    public WebElement Leave_Balance;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[13]") 
    public WebElement LOP;
    
	
	public String getSickLeaves()
	{
		return Sick_Leave_Availed.getText();
	}
	
	public String getPaidLeaves()
	{
		return Paid_Leave_Availed.getText();
	}
	
	public String getEligibleLeaves()
	{
		return Eligible_Leave.getText();
	}
	
	public String getWaitingApproval()
	{
		return Waiting_For_Approval.getText();
	}
	
	public String Leave_Balance()
	{
		return Leave_Balance.getText();
	}
	
	public String LOP()
	{
    return LOP.getText();
	}

}