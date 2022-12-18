/* Program-17
  
 * Find the sum of the numbers in the given input string array
 * Input{“2AA”,”12”,”ABC”,”c1a”)
 * Output:6 (2+1+2+1)
 * Note in the above array 12 must not considered as such
 * i.e,it must be considered as 1,2

 */

package javaProgram_Assignment3;

public class SumOfNum_InputStringArray17 {
	public static void main(String[] args) {
		String[] s1={"2AA","12","AbC","C1a"};
		getSum(s1);	}
	public static void getSum(String[] s1) {
		int sum=0;
		for(int i=0;i<s1.length;i++)
			for(int j=0;j<s1[i].length();j++){
				char c=s1[i].charAt(j);
				if(Character.isDigit(c)){
					String t=String.valueOf(c);
					int n=Integer.parseInt(t);
					sum=sum+n; } }
		System.out.println(sum);	
		}
	}
	