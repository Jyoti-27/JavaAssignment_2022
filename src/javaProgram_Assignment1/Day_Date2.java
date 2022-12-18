
/* Program-2  // Other way
 
 * Find the day(Thursday) of a date input given as MM-dd-yyyy (format)
 * input:12-27-2012
 * output:Thursday

 */


package javaProgram_Assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Day_Date2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter day-");
		String month=in.next();
		String day=in.next();
		String year=in.next();
		
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(day));
		
		String dayOfWeek = getDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(dayOfWeek.toUpperCase());
	}

private static String getDayOfWeek(int value) {
	String day = "";
	switch(value) {
	case 1:
		day="Sunday";
		break;
	case 2:
		day="Monday";
		break;
	case 3:
		day="Tuesday";
		break;
	case 4:
		day="Wednesday";
		break;
	case 5:
		day="Thursday";
		break;
	case 6:
		day="Friday";
		break;
	case 7:
		day="Saturday";
		break;
}
	
	return day;	
	}
}

	
		/*public static String getDay(Date d1) throws ParseException{
			String s1;
			//Date d1=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("EEEEE");
			s1=sdf.format(d1);
			return s1;
		}
		public static void main(String[] args) throws ParseException {
			Date d1=new Date(05-19-2022);
			System.out.println("Day is:"+getDay(d1));
		}
	}*/

/*public static void main(String[] args) {
 
		Date d=new Date(07/03/2022);
		System.out.println(sameDayOnUpcomingYear(d));
	}
	public static String sameDayOnUpcomingYear(Date d) {
		//Date d1=new Date();
		d.setYear(d.getYear());// as it is default format
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		String s=sdf.format(d);
		return s;
	}
}*/



