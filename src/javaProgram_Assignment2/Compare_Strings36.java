
/* Program-36
  
 * Compare two strings, if the characters in string 1 are present in
 * string 2, then it should be put as such in output, else '+' should be
 * put in output...ignore case difference.

 *	input 1:"New York"
 *	input 2:"NWYR"

 *	output:N+w+Y+r+
 */

package javaProgram_Assignment2;

public class Compare_Strings36 {

	public static void main(String[] args) {
		String s1="New York";
		String s2="NWYR";
		System.out.println(StringFormatting(s1,s2));
	}
public static String StringFormatting(String s1, String s2) {
	StringBuffer s4=new StringBuffer();
	String s3=s1.toUpperCase();
	for(int i=0;i<s2.length();i++)
		for(int j=0;j<s3.length();j++)
			if(s2.charAt(i)==s3.charAt(j))
				s4.append(s1.charAt(j)).append('+');
	return s4.toString();
  }
}