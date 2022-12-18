/* Program-12
  
 * input string="hello", n=2
 * output: lolo
 */

package javaProgram_Assignment4;

public class Input_String12 {

	public static void main(String[] args) {
		String s1="hello";
		int n1=2;
		System.out.println(formattingOfString(s1,n1));
	}
	public static String formattingOfString(String s1, int n1) {
		String s2=s1.substring(s1.length()-n1, s1.length());
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n1;i++)
			sb.append(s2);
		return sb.toString();
	}
 }