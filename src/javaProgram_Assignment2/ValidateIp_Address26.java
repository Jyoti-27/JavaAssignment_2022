
/* Program-26
  
 *  validate the ip address in the form a.b.c.d
 *  where a,b,c,d must be between 0and 255
 *  if validated return 1 else return 2
 */


package javaProgram_Assignment2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ValidateIp_Address26 {

	public static void main(String[] args) {
		String ipAddress="010.230.110.260";
		boolean b=validateIpAddress(ipAddress);
	    if(b==true)
	    	System.out.println("Valid ipAddress and return 1");
	    else
	    	System.out.println("Not a valid ipAddress and return 2");
	}
	private static boolean validatingPassword(String st) {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean validateIpAddress(String ipAddress) {
		boolean b1=false;
		StringTokenizer t=new StringTokenizer(ipAddress,".");
		int a=Integer.parseInt(t.nextToken());
		int b=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		int d=Integer.parseInt(t.nextToken());
		if((a>=0 && a<=255)&&(b>=0 && b<=255)&&(c>=0 && c<=255)&&(d>=0 && d<=255))
			b1=true;
		return b1;
	}
}