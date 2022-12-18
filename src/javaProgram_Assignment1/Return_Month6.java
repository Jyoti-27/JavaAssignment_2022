/* Program-6// check 
  
 * Given date in dd-MM-yyyy format.return the month in full name format(January)
 * input:"23-01-2012"
 * output:January

 */



package javaProgram_Assignment1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Return_Month6 {

	public static void main(String[] args)  {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the given date-");
		int date=scr.nextInt();
		
		// Displaying current date and time
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat simpleformat = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss");
		//System.out.println("Date and time = "+simpleformat.format(cal.getTime()));
		
		// displaying date;
		simpleformat = new SimpleDateFormat("dd/MMMM/yyyy");
		String str = simpleformat.format(new Date());
		//System.out.println("Current Date = "+str);
		
		
		// displaying month in MMMM format;
		simpleformat = new SimpleDateFormat("MMMM");
		String strMonth = simpleformat.format(new Date());
		System.out.println("Month in MMMM format = "+strMonth);
		
		// Current time
		simpleformat = new SimpleDateFormat("HH.mm.ss");
		String strTime = simpleformat.format(new Date());
		System.out.println("Current Time= "+strTime);
	}
}
		
		
		
		
		
		
		
		
		
		