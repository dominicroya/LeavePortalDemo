package com.PageObjectsLeavePortal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerLoginPOM {
	
	WebDriver driver2;
	public ManagerLoginPOM(WebDriver driver2)
	{
		this.driver2=driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(id="txtUserName")
	WebElement txtUserName;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//button[@class='dropdown-toggle set_drop_dwn']")
	WebElement profileButton;
	
	@FindBy(xpath = "//*[@id=\"bodyLayout\"]/header/div/div/div[3]/div/ul/li[2]/a")
	WebElement LogoutButton;
	
	
	public void EnterUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void EnterPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	public void clickProfileButton()
	{
		profileButton.click();
	}
	
	public void clickLogoutButton()
	{
		LogoutButton.click();
	}
	
	public void MgLogin()
	{
		
	}
	

}
