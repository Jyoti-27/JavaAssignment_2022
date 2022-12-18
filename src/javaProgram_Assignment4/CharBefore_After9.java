/* Program-9// use if---else // checked
  
 * input1-- Hello*world
 *   output-- boolean(true or false)
 *   operation-- if the character before and after * are same return true else false
 *               if there in no star in the string return false(Ignore case)
 */

package javaProgram_Assignment4;

import java.util.StringTokenizer;

public class CharBefore_After9 {

	public static void main(String[] args) {
		//String input="Hello*world";	
		String input="Hel*loworld";	
		
		System.out.println(characterCheck(input));
	}
	public static boolean characterCheck(String input) {
		boolean b=false;
		StringTokenizer t=new StringTokenizer(input,"*");
		String s1=t.nextToken();
		String s2=t.nextToken();
		String s3=s1.substring(s1.length()-1);
		String s4=s2.substring(0,1);
		if(s3.equalsIgnoreCase(s4))
			b=true;
		else
			b=false;
		return b;
	}
 }