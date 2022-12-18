/* Program-20
  
 *  Get a input string. Find if it is a negative number, if true return the absolute value, in other cases return -1.
 * input: "-123"
 * output: 123
 * input: "@123"
 * output: -1
 */


package javaProgram_Assignment1;

import java.util.Scanner;

public class AbsoluteValue_String20 {

	public static int negativeString(String s1){
		int n1=0;
		if(s1.startsWith("-")){
		int n=Integer.parseInt(s1);
		if(n<0)
			n1=Math.abs(n);}
		else
			n1=-1;
		return n1;
	}
	/*public static int absoluteString(String s2){
		int n2=0;
		if(s2.startsWith("@")){
		int n=Integer.parseInt(s2);
		if(n<0)
			n2=Math.abs(n);}
		else
			n2=-1;
		return n2;
	}*/
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:-");
		String s1=s.next();
		System.out.println(negativeString(s1));
		//System.out.println("Enter the string:-");
		//String s2=s.next();
		//System.out.println(absoluteString(s2));
	}
}