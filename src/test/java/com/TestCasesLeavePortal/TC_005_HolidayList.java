package com.TestCasesLeavePortal;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageObjectsLeavePortal.HolidayListPOM;

public class TC_005_HolidayList extends BaseClass
{
	@Test(testName="holidayList")
	public void holidayList() throws InterruptedException
	{
		HolidayListPOM hl=new HolidayListPOM(driver);		
		hl.clickHolidayList();
			Thread.sleep(3000);
		//takeScreenshot("test");
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(true, hl.PopupHolidayList.isDisplayed());
		hl.closeHolidayList();
			Thread.sleep(3000);		
	}
}
