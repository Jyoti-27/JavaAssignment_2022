/* Program-14
  
 *   Validate Password
 *   validation based on following criteria:
 * -> minimum length is 8
 * -> should contain any of these @/_/#
 * -> should not start with number/special chars(@/#/_)
 * -> should not end with special chars
 * -> can contain numbers,letters,special chars
 */

package javaProgram_Assignment4;

import java.util.Scanner;

public class Validate_Password14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Password:-");
		String s1=s.next();
		boolean b=passwordValidation(s1);
		if(b==true)
			System.out.println("Valid password");
		else
			System.out.println("Not a valid password");
	}
	public static boolean passwordValidation(String s1) {
		boolean b=false,b1=false,b2=false;
		if(s1.length()>=8)
			if(!Character.isDigit(s1.charAt(0)))
				if(s1.charAt(0)!='@' && s1.charAt(0)!='_' && s1.charAt(0)!='#')
					if(s1.charAt(s1.length()-1)!='@' && s1.charAt(s1.length()-1)!='_' && s1.charAt(s1.length()-1)!='#')
						b1=true;
		if(b1==true)
			for(int i=0;i<s1.length();i++)
				if(Character.isAlphabetic(s1.charAt(i)) || Character.isDigit(s1.charAt(i)) || s1.charAt(i)=='#' || s1.charAt(i)=='@' || s1.charAt(i)=='_')
					b2=true;
		if(b2==true)
			if(s1.contains("#") || s1.contains("@") || s1.contains("_"))
				b=true;
		return b;
	}
 }


