/* Program-10
  
 * Get a input string. reverse it and parse it with '-'.
 * input:computer
 * output:r-e-t-u-p-m-o-c
 */


package javaProgram_Assignment1;

import java.util.Scanner;

public class ReverseString_Parse10 {

	public static String reversedAndParsedString(String s1){
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<(2*s1.length())-1;i++)
			if(i%2!=0)
				sb1=sb.insert(i, '-');
		return sb1.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=s.next();
		System.out.println("The formatted string is:"+reversedAndParsedString(s1));
	}
}