/* Program-16
  
 * No of days in a month in specific year

 */

package javaProgram_Assignment3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysInMonth_SpecificYear16 {
	public static void main(String[] args){
		Calendar ca=new GregorianCalendar(2013,Calendar.FEBRUARY,03);
		System.out.println(noOfDaysInaMonth(ca));
	}
	public static int noOfDaysInaMonth(Calendar ca){
		int n=ca.getActualMaximum(Calendar.DAY_OF_MONTH);
	   	return n;
	}
 }