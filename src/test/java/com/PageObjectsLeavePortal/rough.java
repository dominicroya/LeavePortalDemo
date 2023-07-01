package com.PageObjectsLeavePortal;

public class rough {

	public static void main(String[] args) {
		String data[][] = { {"Id", "Vehicle", "Disance" },
                {"1", "ByCycle", "2 km"}, 
                {"2", "Car", "10 km"}, 
                {"3", "Van", "6.5 km"} 
              };

    int col = data[0].length;
    System.out.println("columns :" +col);
    int row = data.length;
    System.out.println("rows :" +row);
    int maxWidth[] = new int[col];  // length of the column characters
    System.out.println("");
   
    for(String[] rowD : data)          //for each loop
     	
//    System.out.println(rowD);	
    
     for(int i=0; i< col; i++)
     {
    	 System.out.println("..>>>>.."+maxWidth[i]);
    	 System.out.println("...."+rowD[i]);
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
