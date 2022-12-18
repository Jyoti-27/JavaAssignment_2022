
/* Program-16
  
 *   Return 1 if the last & first characters of a string are equal else 
 *   return -1. Consider case.
 *   Eg: Input = "this was great"
 *   Output= 1
 */

package javaProgram_Assignment4;

public class LastFirstChar_StringEqual16 {

	public static void main(String[] args) {
		String input="this was great";
		System.out.println(checkForFirstAndLastChar(input));
	}
	public static int checkForFirstAndLastChar(String input) {
		int n=0;
		if(input.charAt(0)==input.charAt(input.length()-1))
			n=1;
		else n=-1;
		return n;
	}
 }