/* Program-11
  
 *   input1="aBrd";
 *   input2="aqrbA";
 *   input3=2;
 *   output1=boolean true;
 *   2nd char of ip1 and last 2nd char of ip2 show be equal
 */

package javaProgram_Assignment5;

public class Char_Equal11 {

	public static void main(String[] args) {
		String ip1="aBrd";
		String ip2="aqrbA";
		int ip3=2;
		System.out.println(charCheck(ip1,ip2,ip3));
	}
	public static boolean charCheck(String ip1, String ip2, int ip3){
		boolean b=false;
		String s1=String.valueOf(ip1.charAt(ip3-1));
		String s2=String.valueOf(ip2.charAt(ip2.length()-ip3));
		if(s1.equalsIgnoreCase(s2))
			b=true;
		return b;
	}
  }