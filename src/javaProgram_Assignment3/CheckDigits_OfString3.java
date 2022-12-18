/* Program-3
  
 * Given array of string check whether all the elements contains only digits not any alphabets.
 * if condition satisfied print 1 else -1.
 * Input:{"123","23.14","522"}
 * output:1
 * Input1:{"asd","123","42.20"}
 * output:-1
 */

package javaProgram_Assignment3;

public class CheckDigits_OfString3 {

	public static void main(String[] args) {
		String[] input1={"123","23.14","522"};
		//String[] input1={"asd","123","42.20"};
		System.out.println(stringOfDigits(input1));
	}
	public static int stringOfDigits(String[] input1) {
		int n=0;
		for(int i=0;i<input1.length;i++)
		{
			String s1=input1[i];
			for(int j=0;j<s1.length();j++)
			{
				char c1=s1.charAt(j);
				if(Character.isDigit(c1))
					n=1;
				else 
				{
					n=-1;
				break;
				} 
			  }
			}
		return n;
	}
 }