/* Program-11
  
 * String i/p1=2012;
 * STRING i/p2=5
 * IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;
 */

package javaProgram_Assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringInput_Experience11 {

	public static void main(String[] args) throws ParseException {
		String ip1="2012";	
		String ip2="5";
		System.out.println(experienceCalc(ip1,ip2));
	}
	public static boolean experienceCalc(String ip1, String ip2) throws ParseException {
		boolean b=false;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
			Date d1=sdf.parse(ip1);
			Date d2=new Date();
		int n1=d1.getYear();
		int n2=d2.getYear();
		int n3=Integer.parseInt(ip2);
		if((n2-n1)>n3)
			b=true;
		return b;
	}
 }