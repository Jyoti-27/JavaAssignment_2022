/* Program-8
  
 *  Color Code Validation:
 *	String should starts with the Character '#'.
 *	Length of String is 7. 
 *	It should contain 6 Characters after '#' Symbol.
 *	It should contain Characters Between 'A-F' and Digits '0-9'.
 *	if String is acceptable then Output1=1
 *	else  Output1=-1; 

 */

package javaProgram_Assignment5;

import java.util.Scanner;

public class ColorCode_Validation8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Color Code-");
		String s1=s.next();
		boolean b=colorCodeValidation(s1);
		if(b==true)
			System.out.println("valid color code and return 1");
		else
			System.out.println("invalid color code and return -1");
	}
	public static boolean colorCodeValidation(String s1) {
		boolean b=false,b1=false;
		String s2=s1.substring(1,s1.length());
		if(s1.length()==7)
			if(s1.charAt(0)=='#')
				b1=true;
		
		if(b1==true)
			for(int i=0;i<s2.length();i++){
				char c=s2.charAt(i);
				if(c!='#'){
				if((Character.isAlphabetic(c)&& Character.isUpperCase(c)) || Character.isDigit(c))
					b=true;
				else{
					b=false;
					break;}}}
		return b;
	}
 }