package com.PageObjectsLeavePortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.UtilitiesLeavePortal.ReadConfig;

public class ChangePasswordPOM {
	ReadConfig readconfig=new ReadConfig();
	public String password=readconfig.getPassword();
	public String invNewPwd=readconfig.getPassword();  //invConfirmPwd
	public String invConfirmPwd=readconfig.getPassword();
	WebDriver driver;
	public ChangePasswordPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//div[@class='modal-dialog leaveapproval-popup']
	
	@FindBy(xpath = "//div[@class='modal-dialog leaveapproval-popup']")
	public WebElement PopupPwdSuccessful;
	
	@FindBy(xpath = "//button[@class='dropdown-toggle set_drop_dwn']")
	WebElement profileButton;
	
	@FindBy (xpath = "//a[@title='Change Password']")
	WebElement changePwdButton;
	
	@FindBy (xpath = "//input[@name='EmployeePassword']")
	WebElement NewPwd;
	
	@FindBy (xpath = "//input[@placeholder='Confirm Password']")
	 WebElement confirmPwd;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitNewPwd;
	
	@FindBy (xpath = "//button[@class='btn btn-primary pull-right btn-custom savebtn']")
	private WebElement Cancel;
	
	@FindBy(xpath = "//label[@class='text-danger lblPassword']")
	public WebElement errorm;
	
	public void clickProfileButton1()
	{
		profileButton.click();
	}
	
	public void clickChangePwd()
	{
		changePwdButton.click();
	}
	public void EnterNewPwd()
	{
		NewPwd.sendKeys(password);
	}
	
	public void EnterConfirmPwd()
	{
		confirmPwd.sendKeys(password);
	}
	
	public void submit()
	{
		submitNewPwd.click();
	}
	
	public void EnterNewInvPwd()
	{
		NewPwd.sendKeys("1234567");     //1234567
	}
	
	public void EnterConfirmInvPwd()
	{
		confirmPwd.sendKeys("Dt@1");   //Dt@1
	}

}
