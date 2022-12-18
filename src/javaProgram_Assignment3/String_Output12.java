/* Program-12
  
 * String a="a very fine day"
 * output:A Very Fine Day
 */

package javaProgram_Assignment3;

import java.util.StringTokenizer;

public class String_Output12 {

	public static void main(String[] args){
		String a="its a very fine day";	
		System.out.println(capsStart(a));
	}
	public static String capsStart(String a){
		StringBuffer s5=new StringBuffer();
		StringTokenizer t=new StringTokenizer(a," ");
		while(t.hasMoreTokens()){
			String s2=t.nextToken();
			String s3=s2.substring(0,1);
			String s4=s2.substring(1, s2.length());
			s5.append(s3.toUpperCase()).append(s4).append(" ");	}
		return s5.toString();
	}
	
 }