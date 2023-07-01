package com.TestCasesLeavePortal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.PageObjectsLeavePortal.LeaveHistoryPOM;
import com.PageObjectsLeavePortal.ViewAppliedLeavePOM;

public class TC_008_ViewAppliedLeave extends BaseClass
{
	@Test(testName="ViewLeaveDetail")
	public void ViewLeaveDetail() throws InterruptedException
	{
		ViewAppliedLeavePOM vl=new ViewAppliedLeavePOM(driver);
		vl.clickLeaveHistory();
			Thread.sleep(3000);
		vl.clickOnVieweye();
			Thread.sleep(3000);	
		vl.clickOnClose();
			Thread.sleep(3000);			
			
			LeaveHistoryPOM lh =new LeaveHistoryPOM(driver);
			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,5000)");
//			driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='container table-responsive grid applyleave-grid-div']")));
//			 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebElement s=driver.findElement(By.xpath("//div[@class='container table-responsive grid applyleave-grid-div']")) ;
			Thread.sleep(3000);
			Actions a=new Actions(driver);
			a.moveToElement(s).click().perform();
			
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			lh.ClickOnNextPageButton();
			
			Thread.sleep(10000);
	}

}
