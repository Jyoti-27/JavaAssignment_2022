/* Program-38
  
 * Return  months between two dates
 */

package javaProgram_Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReturnMonths_BetwDates38 {

	public static void main(String[] args) throws ParseException {
		String s1="30/05/2013";
		String s2="01/06/2013";
		System.out.println(monthsBetweenDates(s1,s2));
	}
	public static int monthsBetweenDates(String s1, String s2) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date d1=sdf.parse(s1);
			Date d2=sdf.parse(s2);
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(d1);
			int months1=cal.get(Calendar.MONTH);
			int year1=cal.get(Calendar.YEAR);
		cal.setTime(d2);
			int months2=cal.get(Calendar.MONTH);
			int year2=cal.get(Calendar.YEAR);
		int n=((year2-year1)*12)+(months2-months1);
		return n;
	}
 }