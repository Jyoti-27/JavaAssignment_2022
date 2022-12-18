/* Program-7
  
 *   ip: "this is sample test case"
 *   op: "this amplec"
 *   remove the duplicates in the given string

 */

package javaProgram_Assignment5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate7 {

	public static void main(String[] args) {
		String s1="this is sample test case";
		System.out.println(removeDuplicates(s1));
	}
	public static String removeDuplicates(String s1) {
		StringBuffer sb=new StringBuffer();
		Set<Character> c1=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
			c1.add(s1.charAt(i));
		for(char c2:c1)
			sb.append(c2);
		return sb.toString();
	}
 }