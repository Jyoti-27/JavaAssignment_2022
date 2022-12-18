
/* Program-23
  
 * Write a Program that accepts a string and removes the duplicate characters.
 */

package javaProgram_Assignment2;

public class RemoveDuplicates_String23 {

	public static String removalOfDuplicateCharacters(String s1){
		StringBuffer sb=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
			for(int j=i+1;j<s1.length();j++)
				if(s1.charAt(i)==s1.charAt(j))
					sb.deleteCharAt(j);
		return sb.toString();
	}
	public static void main(String[] args) {
		String s1="Prasad";
		System.out.println(removalOfDuplicateCharacters(s1));
	}
}