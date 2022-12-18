
/* Program-8
 
 * A time input is received as string. Find if the hour format is in 12 hour format. the suffix am/pm is case insensitive.
 * input:"09:36 am"
 * output:true

 */



package javaProgram_Assignment1;

import java.text.ParseException;
import java.util.StringTokenizer;

public class Hour_Format8 {

	public static boolean hourFormat(String s) throws ParseException{
		boolean b=false;
		StringTokenizer st=new StringTokenizer(s," ");
		String s1=st.nextToken();
		String s2=st.nextToken(); 	
		StringTokenizer st1=new StringTokenizer(s1,":");
		int n1=Integer.parseInt(st1.nextToken()); 
		int n2=Integer.parseInt(st1.nextToken()); 
		if((s2.equalsIgnoreCase("am"))|| (s2.equalsIgnoreCase("pm")))
			if((n1<=12)&&(n2<=59))
				b=true; 
		return b;
	}
	public static void main(String[] args) throws ParseException {
		String s="13:36 am";
		boolean b=hourFormat(s);
		if(b==true)
			System.out.println("The time is in 12 hr format");
		else
			System.out.println("The time is in 24 hr format");
	}
}