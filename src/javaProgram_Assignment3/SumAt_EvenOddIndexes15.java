/* Program-15
  
 * Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
 * if both the sum is equal return 1 or return -1.

 */

package javaProgram_Assignment3;

public class SumAt_EvenOddIndexes15 {

	public static void main(String[] args) {
		int a[]={9,8,5,3,2,6,4,7,5,1};	
		System.out.println(oddEvenIndicesCount(a));
	}
	public static int oddEvenIndicesCount(int[] a) {
		int n1=0,n2=0,n3=0;
		for(int i=0;i<a.length;i++)
			if(i%2==0)
				n1+=a[i];
			else
				n2+=a[i];
		if(n1==n2)
			n3=1;
		else
			n3=-1;
		return n3;
	}
 }