/* Program-3
  
 *   i/p1: new york
 *   i/p2: new jersey
 *   o/p: new y+r+

 */

package javaProgram_Assignment5;

public class Inpu1_Input2Output3 {

	public static void main(String[] args) {
		String s1="new york";
		String s2="new jersey";
		System.out.println(commonCharsinAstring(s1,s2));
	}
	private static String commonCharsinAstring(String s1, String s2) {
		int f;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++){
			f=0;
			char c1=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
				if(c1==s2.charAt(j))
					f=1;
			if(f!=0)
				sb.append(c1);
			else
				sb.append('+');}
		return sb.toString();
	}
 }