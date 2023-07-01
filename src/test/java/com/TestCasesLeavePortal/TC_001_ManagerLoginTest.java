package com.TestCasesLeavePortal;
import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.PageObjectsLeavePortal.LoginPagePOM;
import com.UtilitiesLeavePortal.ReadConfig;

public class TC_001_ManagerLoginTest
{
LoginPagePOM lp=new LoginPagePOM(driver);
ReadConfig readconfig=new ReadConfig();
public String username=readconfig.getUsernameMg();
public String password=readconfig.getPasswordMg(); 
public static WebDriver driver;
public String baseURL=readconfig.getApplicationURL();

@BeforeClass
public void setup() throws InterruptedException
{		
System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
driver=new ChromeDriver();	
driver.get(baseURL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
LoginPagePOM lp=new LoginPagePOM(driver);
lp.EnterUserName(username);
lp.EnterPassword(password);
lp.clickSubmit();
System.out.println("Logged in ");
Thread.sleep(3000);	
}

@BeforeMethod
public void Time()
{
	Date date = new Date();
	System.out.println("Executed at Time : "+date.toString());	
}

@AfterMethod 
public void screenShot(ITestResult result){
	if(ITestResult.FAILURE==result.getStatus()){
try{

TakesScreenshot screenshot=(TakesScreenshot)driver;

File src=screenshot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("./Screenshots\\"+result.getName()+".png"));
System.out.println("Successfully captured a screenshot");
}catch (Exception e){
System.out.println("Exception while taking screenshot "+e.getMessage());
}
}
}

@AfterClass
public void tearDown() throws InterruptedException
{ 
Thread.sleep(2000);
LoginPagePOM lp=new LoginPagePOM(driver);
lp.clickProfileButton();
Thread.sleep(5000);
lp.clickLogoutButton();
Thread.sleep(3000);
System.out.println("Logged out successfully");
driver.quit();


} 	
						
}




	

