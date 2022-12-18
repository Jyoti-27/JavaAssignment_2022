/* Program-10
  
 *   Getting the first and last n letters from a word where wordlength > 2n.
 *   Ex: Input: california,3.
 *       output: calnia.
 */

package javaProgram_Assignment5;

public class First_LastnLetter10 {

	public static void main(String[] args) {
		String s1="california";
		int n1=3;
		System.out.println(subStringOfgivenString(s1,n1));
	}
	public static String subStringOfgivenString(String s1, int n1) {
		StringBuffer sb=new StringBuffer();
		sb.append(s1.substring(0, n1)).append(s1.substring(s1.length()-n1,s1.length()));
		return sb.toString();
	}
 }