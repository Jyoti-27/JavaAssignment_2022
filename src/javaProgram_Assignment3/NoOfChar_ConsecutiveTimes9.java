/* Program-9
  
 * Find the no.of charcters,that has repeated 3 consecutive times
 * input1:"aaabbccc"
 * ouput1=2;

 */

package javaProgram_Assignment3;

public class NoOfChar_ConsecutiveTimes9 {

	public static void main(String[] args) {
		String input1="aaabbccc";
		System.out.println(consecutiveRepeatitionOfChar(input1));
	}

	public static int consecutiveRepeatitionOfChar(String input1) {
		int c=0;
		int n=0;
		for(int i=0;i<input1.length()-1;i++){
			if(input1.charAt(i)==input1.charAt(i+1))
				n++;
			else 
				n=0;
			
			if(n==2)
				c++; }
		return c;
	}
 }
