
/* Program-11
  
 * Get all the numbers alone from the string and return the sum.
 * Input"123gif"
 * Output:6
 */

package javaProgram_Assignment3;

public class NumFromString_ReturnSum11 {

	public static void main(String[] args) {
		String s="123gif";
		System.out.println(summationOfNosInaString(s));
	}
	public static int summationOfNosInaString(String s) {
		int n=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isDigit(c)){
				String s1=String.valueOf(c);
				n+=Integer.parseInt(s1);} }
		return n;
	}
 }
