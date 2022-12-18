
/* Program-33  // check - corrected
  
 * Retrieve the odd-position digits from input integer array. Multiply them with their index and return their sum.

 */


package javaProgram_Assignment2;

public class RetrieveOddposi_DigitsSum33 {

	public static void main(String[] args) {
		int[] a={5,1,6,2,9,4,3,7,8};
		System.out.println("Sum Of Odd Position Elements Multiplied With Their Index Is:");
		System.out.println(retrievalOfOddPositionElements(a));
	}
	public static int retrievalOfOddPositionElements(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++)
			if(i%2!=0)
				s+=a[i]*i;
		return s;
	}
}