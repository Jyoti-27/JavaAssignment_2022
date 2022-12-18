/* Program-5
  
 * count the number of words in the string
 * Input string="i work in cognizant.";
 * output=4;
 */

package javaProgram_Assignment4;

import java.util.StringTokenizer;

public class CountWords_InString5 {

	public static void main(String[] args) {
		String s="I work for cognizant";
		System.out.println(noOfWordsInString(s));
	}
	public static int noOfWordsInString(String s) {
		StringTokenizer t=new StringTokenizer(s," "); 
		return t.countTokens();
	}
 }