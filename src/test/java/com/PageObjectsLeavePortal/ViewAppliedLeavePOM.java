package com.PageObjectsLeavePortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAppliedLeavePOM {
	
	WebDriver driver;
	public ViewAppliedLeavePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@id='applyLeave']")
	WebElement LeaveHistory;
	
	@FindBy (xpath = "//span[@class='fa fa-eye']")  ////span[@class='fa fa-eye']
	private WebElement viewLeave;
	
	@FindBy (xpath = "//a[text()='Close']")
	private WebElement close;
	
	
	public void clickLeaveHistory()
	{
		LeaveHistory.click();
	}
	
	public void clickOnVieweye() {
		viewLeave.click(); }
	
	public void clickOnClose() {
		close.click(); }


}
