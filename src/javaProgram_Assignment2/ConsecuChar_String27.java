/* Program-27
  
 * Find the three consecutive characters in a string. if the string consists any three 
 * consecutive characters return 1 else return -1
 * like AAAxyzaaa will return true.
 */


package javaProgram_Assignment2;

public class ConsecuChar_String27 {

	public static void main(String[] args) {
		String s1="aaaaxyzAAA";
		//String s1="axyA";
		boolean b=consecutiveCharactersCheck(s1);
		if(b==true)
			System.out.println("Presence of consecutive characters and return 1");
		else
			System.out.println("Absence of consecutive characters and return -1");
		}

	public static boolean consecutiveCharactersCheck(String s1) {
		boolean b=false;
		int c=0;
		for(int i=0;i<s1.length()-1;i++)
			if((s1.charAt(i+1)-s1.charAt(i))==1)
					c++;
		if(c>=2)
			b=true;
		return b;
	}
 }