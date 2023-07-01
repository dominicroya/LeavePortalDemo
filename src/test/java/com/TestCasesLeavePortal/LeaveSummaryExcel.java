package com.TestCasesLeavePortal;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import com.PageObjectsLeavePortal.LeaveSummaryDDPOM;

public class LeaveSummaryExcel extends BaseClass {
	
	@Test(priority=15)
	public void LeaveSummaryData() throws IOException {
		LeaveSummaryDDPOM ls = new LeaveSummaryDDPOM(driver);
		
		String sl = ls.getSickLeaves();
		System.out.println("Sickleaves = "+sl);
		
		String pl = ls.getPaidLeaves();
		System.out.println("Paidleaves = "+pl);
		
		String el = ls.getEligibleLeaves();
		System.out.println("Eligibleleaves = "+el);
		
		String wa = ls.getWaitingApproval();
		System.out.println("WaitingforApproval = "+wa);
		
		String lb = ls.Leave_Balance();
		System.out.println("LeaveBalance = "+lb);
		
		String lp = ls.LOP();
		System.out.println("Lop = "+lp);
		
		
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sheet1");
        
        ArrayList<Object[]> leavedata= new ArrayList<Object[]>();
        
        leavedata.add(new Object[]{"leave Type","Leaves"});
        leavedata.add(new Object[]{"Sickleaves",sl});
        leavedata.add(new Object[]{"Paidleaves",pl});
        leavedata.add(new Object[]{"Eligibleleaves",el});
        leavedata.add(new Object[]{"WaitingforApproval",wa});
        leavedata.add(new Object[]{"LeaveBalance",lb});
        leavedata.add(new Object[]{"Lop",sl});
        
        int rowcount=0;
        for(Object[] leave:leavedata)
        {
        XSSFRow row= sheet.createRow(rowcount++);
        int cellnum=0;
        for(Object value:leave)
        {
        XSSFCell cell = row.createCell(cellnum++);
        if(value instanceof String)
        cell.setCellValue((String)value);
        if(value instanceof Integer)
            cell.setCellValue((Integer)value);
        }
        }
        
        String filepath=".\\dataFiles\\leavesummary.xlsx";
        FileOutputStream fos = new FileOutputStream(filepath);
        workbook.write(fos);
        fos.close();
        
        System.out.println("Leave summary written Successfully...");
      
	}
		

}
        
        
  