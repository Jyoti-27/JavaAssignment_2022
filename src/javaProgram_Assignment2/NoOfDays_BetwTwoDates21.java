/* Program-21
  
 * Find the number of days between two input dates.
 */


package javaProgram_Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NoOfDays_BetwTwoDates21 {

	public static int dateDifference(String s1,String s2) throws ParseException{
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		Date d=sd.parse(s1);
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		long d1=c.getTimeInMillis();
		d=sd.parse(s2);
		c.setTime(d);
		long d2=c.getTimeInMillis();
		int n=Math.abs((int) ((d1-d2)/(1000*3600*24)));
		return n;
		}
	public static void main(String[] args) throws ParseException {
		String s1="27/12/2019";
		String s2="15/09/2021";
		System.out.println(dateDifference(s1,s2));
		}
	}