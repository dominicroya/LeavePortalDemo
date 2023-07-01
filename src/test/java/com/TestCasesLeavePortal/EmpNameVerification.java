package com.TestCasesLeavePortal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.PageObjectsLeavePortal.HomePagePOM;
//@Listeners(CustomListener.class)
public class EmpNameVerification extends BaseClass

{
int testCaseID = 1001;
@Test
	public void VerifyName()
	{		
			HomePagePOM hp1=new HomePagePOM(driver);
			System.out.println("Employee name is : "+hp1.Empname.getText());
			SoftAssert Assert=new SoftAssert();
			Assert.assertEquals(hp1.Empname.getText(), " ");
			driver.findElement(By.xpath("//xyx"));
			System.out.println("After assertion");		
	}

}
	
	
	

