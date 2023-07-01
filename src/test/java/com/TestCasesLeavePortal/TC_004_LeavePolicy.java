package com.TestCasesLeavePortal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageObjectsLeavePortal.LeavePolicyPOM;

public class TC_004_LeavePolicy extends BaseClass
{
	
	@Test
	public void LeavePolicy() throws InterruptedException
	{
		LeavePolicyPOM lpc=new LeavePolicyPOM(driver);
		lpc.ClickLeavePolicy();
			Thread.sleep(3000);
			
//__________Assertion
			//SoftAssert Assert=new SoftAssert();
			//Assert.assertEquals(true, lpc.Popupleavepolicy.isDisplayed());
			Assert.assertEquals(false, lpc.Popupleavepolicy.isDisplayed());
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(lpc.cancel));
	//	Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//h3[@class='modal-title']"))).click().build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("//div[@class='modal-dialog leaveapproval-popup']")), 100);
		//js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		lpc.ClickCancelButtonLeavePolicy();
		
	}	
}
