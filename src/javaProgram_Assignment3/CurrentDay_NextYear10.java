/* Program-10
  
 * What will be the DAY of current date in next year

 */

package javaProgram_Assignment3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDay_NextYear10 {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(sameDayOnUpcomingYear(d));
	}
	public static String sameDayOnUpcomingYear(Date d) {
		Date d1=new Date();
		d1.setYear(d.getYear()+1);// as it is default format
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		String s=sdf.format(d1);
		return s;
	}
 }