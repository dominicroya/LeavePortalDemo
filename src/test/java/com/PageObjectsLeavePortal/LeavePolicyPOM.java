package com.PageObjectsLeavePortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePolicyPOM {
	

	WebDriver driver;
	public LeavePolicyPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//div[@class='modal-dialog leaveapproval-popup']
	
	@FindBy (xpath = "//div[@class='modal-dialog leaveapproval-popup']")
	public WebElement Popupleavepolicy;
	
	@FindBy (xpath = "//a[@title='LeavePolicy']")
	WebElement leavepolicy;

	@FindBy (xpath = "//a[@type='button']")
	
	public WebElement cancel;
	
	
	public void ClickLeavePolicy()
	{
		leavepolicy.click();
	}
	
	public void ClickCancelButtonLeavePolicy()
	{
		cancel.click();
	}

}
