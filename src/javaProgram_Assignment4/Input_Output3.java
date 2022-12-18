/* Program-3
  
 * Input1=”Hello World”;  output-------à  “dello WorlH”.
 */

package javaProgram_Assignment4;

public class Input_Output3 {

	public static void main(String[] args) {
		String s="Hello World";	
		System.out.println(reArrangingWord(s));
	}
	public static String reArrangingWord(String s) {
		StringBuffer sb=new StringBuffer();
		sb.append(s.substring(s.length()-1));
		sb.append(s.substring(1, s.length()-1));
		sb.append(s.substring(0, 1));
		return sb.toString();
	}
 }