/* Program-17
  
 *   concat two string if length of two string is equal.
 *   if length of one string is greater, then remove the character from 
 *   largest string and then add. The number of characters removed from 
 *   largest string is equal to smallest string's length
 *   for example: input 1="hello";
 *                input 2="helloworld";
 *                output="worldhello";
 */

package javaProgram_Assignment4;

public class Concat_String17 {

	public static void main(String[] args) {
		String ip1="hello";
		String ip2="helloworld";
		System.out.println(removalOfCharFromLargestString(ip1,ip2));
	}
	public static String removalOfCharFromLargestString(String ip1,String ip2){
		StringBuffer sb=new StringBuffer();
		int n1=ip1.length();
		int n2=ip2.length();
		if(n1<n2)
			sb.append(ip2.substring(n1, n2)).append(ip1);
		return sb.toString();
	}
 }