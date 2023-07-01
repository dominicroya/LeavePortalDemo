package com.PageObjectsLeavePortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	

	WebDriver driver;
	public HomePagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Employment Details
	@FindBy(xpath = "//button[@class='dropdown-toggle set_drop_dwn']") 
	public WebElement Empname;
	
	@FindBy(xpath = "//span[@class='summary-label']") 
	public WebElement name;
	
	@FindBy(xpath = "(//span[@class='summary-label'])[2]") 
	public WebElement mailID;
	
	@FindBy(xpath = "(//span[@class='summary-label'])[3]") 
	public WebElement Joining_Date;
	
	@FindBy(xpath = "(//span[@class='summary-label'])[4]") 
	public WebElement Training_Period;
	
	@FindBy(xpath = "(//span[@class='summary-label'])[5]") 
	public WebElement Probation_Period;
	
	@FindBy(xpath = "(//span[@class='summary-label'])[6]") 
	public WebElement Date_of_Confirmation;

    @FindBy(xpath = "(//span[@class='summary-label'])[7]") 
    public WebElement Manager_Name;
	
    //Leave Summary
    @FindBy(xpath = "(//span[@class='summary-label'])[8]") 
    public WebElement Sick_Leave_Availed;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[9]") 
    public WebElement Paid_Leave_Availed;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[10]") 
    public WebElement Eligible_Leave;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[11]") 
    public WebElement Waiting_For_Approval;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[12]") 
    public WebElement Leave_Balance;
    
    @FindBy(xpath = "(//span[@class='summary-label'])[13]") 
    public WebElement LOP;
    
    
    public void EmployeeName()
    {
    	System.out.println("Employee Name : "+ name.getText());
    }
    public void mailID()
    {
    	System.out.println("Employee Mail ID : "+ mailID.getText());
    }
    public void Joining_Date()
    {
    	System.out.println("Joining Date of Employee: "+ Joining_Date.getText());
    }
    public void Training_Period()
    {
    	System.out.println("Training period of Employee : "+ Training_Period.getText());
    }  
    public void Probation_Period()
    {
    	System.out.println("Probation Period of Employee : " + Probation_Period.getText());
    }
    public void Date_of_Confirmation()
    {
    	System.out.println("Date of Confirmation of Employee : "+Date_of_Confirmation.getText());
    }
    public void Manager_Name()
    {
    	System.out.println("Manager Name : "+ Manager_Name.getText());
    }
    public void Sick_Leave_Availed()
    {
    	System.out.println("Sick Leave Availed by Employee :"+ Sick_Leave_Availed.getText());
    }
    public void Paid_Leave_Availed()
    {
    	System.out.println("Paid Leave Availed by Employee : "+ Paid_Leave_Availed.getText());
    }
    public void Eligible_Leave()
    {
    	System.out.println("Eligible Leaves : "+ Eligible_Leave.getText());
    }   
    public void Waiting_For_Approval()
    {
    	System.out.println("Leaves waiting for approvals : "+ Waiting_For_Approval.getText());
    }
    public void Leave_Balance()
    {
    	System.out.println("Number of balance leaves : "+ Leave_Balance.getText());
    }
    public void LOP()
    {
    	System.out.println("LOP : "+ LOP.getText());
    }
    
    
    /////////////////////////////////////////////////
    public void show_Employee_Details()
    {
  String name1=name.getText();
  String mailID1=mailID.getText();
  String Joining_Date1=Joining_Date.getText();
  String Training_Period1=Training_Period.getText();
  String Probation_Period1=Probation_Period.getText();
  String Date_of_Confirmation1=Date_of_Confirmation.getText();
  String Manager_Name1=Manager_Name.getText();
  
 String data[][] = { {"name : ",name1},{"mail ID :",mailID1},{"Joining Date : ",Joining_Date1},
		  {"Training Period : ",Training_Period1},{"Probation Period : ",Probation_Period1},
		  {"Date of Confirmation : ",Date_of_Confirmation1},{"Manager Name : ",Manager_Name1}};
  
  int col = data[0].length;
  int row = data.length;
 

  int maxWidth[] = new int[col];

  for(String[] rowD : data)
   for(int i=0; i< col; i++)
   {
       if(maxWidth[i] < rowD[i].length())
           maxWidth[i] = rowD[i].length();
   }

  String format = "";

  for(int x:maxWidth)
      format += "%-"+(x+2)+"s ";

  format +="%n";

  for(String[] rowD : data)
  {
      System.out.printf(format, rowD);
  }
    }
    
   ////////////////////////////////////////////////////////////// 
    
    public void show_Leave_Details()
    {
  String Sick_Leave_Availed1=Sick_Leave_Availed.getText();
  String Paid_Leave_Availed1=Paid_Leave_Availed.getText();
  String Eligible_Leave1=Eligible_Leave.getText();
  String Waiting_For_Approval1=Waiting_For_Approval.getText();
  String Leave_Balance1=Leave_Balance.getText();
  String LOP1=LOP.getText();
  
  
 String data[][] = { {"Sick Leave Availed1 : ",Sick_Leave_Availed1},{"Paid Leave Availed : ",Paid_Leave_Availed1},{"Eligible Leave : ",Eligible_Leave1},
		  {"Waiting For Approval : ",Waiting_For_Approval1},{"Leave Balance1 : ",Leave_Balance1},
		  {"Loss of pay : ",LOP1}};
  
  int col = data[0].length;              //getting no of columns
  int row = data.length;                   //getting no of rows
  int maxWidth[] = new int[col];           //allocates memory to store the array 

  for(String[] rowD : data)
   for(int i=0; i< col; i++)
   {
       if(maxWidth[i] < rowD[i].length())
           maxWidth[i] = rowD[i].length();
   }

  String format = "";
  for(int x:maxWidth)
      format += "%-"+(x+2)+"s ";
  format +="%n";
  for(String[] rowD : data)
  {
      System.out.printf(format, rowD);
  }
    }
	
}
