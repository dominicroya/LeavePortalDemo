package com.PageObjectsLeavePortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidayListPOM {
	
	WebDriver driver;
	public HolidayListPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//div[@class='modal-dialog leaveapproval-popup']

	@FindBy(xpath = "//div[@class='modal-dialog leaveapproval-popup']") 
	public WebElement PopupHolidayList;
	
	@FindBy(xpath = "(//a[@title='View Holidays'])") 
	WebElement HolidayList;
	
	@FindBy(xpath = "(//button[@class='close'])") 
	WebElement Close;
	
	public void clickHolidayList()
	{
		HolidayList.click();
	}
	public void closeHolidayList()
	{
		Close.click();
	}
}
