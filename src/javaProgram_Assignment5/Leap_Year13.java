/* Program-13
  
 * leap year or not using API?
 */

package javaProgram_Assignment5;

import java.util.GregorianCalendar;

public class Leap_Year13 {

	public static void main(String[] args) {
		String s="2012";
		System.out.println(leapYear(s));
	}
	public static boolean leapYear(String s) {
		int n=Integer.parseInt(s);
		GregorianCalendar c=new GregorianCalendar();
		boolean b=c.isLeapYear(n);
		return b;
	}
  }
