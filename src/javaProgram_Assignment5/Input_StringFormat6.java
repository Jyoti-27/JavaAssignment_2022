/* Program-6
  
 *   String format : CTS-LLL-XXXX
 *   ip1: CTS-hyd-1234
 *   ip2: hyderabad
 *   -> LLL must be first 3 letters of ip2.
 *   -> XXXX must be a 4-digit number

 */


package javaProgram_Assignment5;

import java.util.StringTokenizer;

public class Input_StringFormat6 {

	public static void main(String[] args) {
		String s1="CTS-hyd-1234";
		String s2="hyderabad";
		boolean b=formattingString(s1,s2);
		if(b==true)
			System.out.println("String format:CTS-LLL-XXXX");
		else
			System.out.println("Not in required format");
	}
	public static boolean formattingString(String s1, String s2) {
		String s3=s2.substring(0, 3);
		boolean b=false;
		StringTokenizer t=new StringTokenizer(s1,"-");
		String s4=t.nextToken();
		String s5=t.nextToken();
		String s6=t.nextToken();
		if(s4.equals("CTS") && s5.equals(s3) && s6.length()==4)
			for(int i=0;i<s6.length();i++){
				if(Character.isDigit(s6.charAt(i)))
					b=true;
				else{
					b=false;}}
		return b;
	}
 }