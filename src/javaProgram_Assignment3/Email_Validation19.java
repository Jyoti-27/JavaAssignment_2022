/* Program-19
  
 * Email Validation
 * String input1="test@gmail.com"
 *              1)@ & . should be present;
 *              2)@ & . should not be repeated;
 *              3)there should be five charcters between @ and .;
 *              4)there should be atleast 3 characters before @ ;
 *              5)the end of mail id should be .com;

 */


package javaProgram_Assignment3;

import java.util.StringTokenizer;

public class Email_Validation19 {

	public static void main(String[] args) {
		String ip="test@gmail.com";
		boolean b=emailIdValidation(ip);
		if(b==true)
			System.out.println("valid mail Id");
		else
			System.out.println("not a valid Id");
	}
	public static boolean emailIdValidation(String ip) {
		int i=0;
		boolean b=false;
		StringTokenizer t=new StringTokenizer(ip,"@");
			String s1=t.nextToken();
			String s2=t.nextToken();
		StringTokenizer t1=new StringTokenizer(s2,".");
			String s3=t1.nextToken();
			String s4=t1.nextToken();
		if(ip.contains("@") && ip.contains("."))
			i++;
		
		if(i==1)
			if(s3.length()==5)
				if(s1.length()>=3)
					if(s4.equals("com"))
						b=true;
		return b;
	}
 }