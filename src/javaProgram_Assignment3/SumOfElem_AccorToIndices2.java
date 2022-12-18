/* Program-2
  
 * Given array of integers,print the sum of elements squaring/cubing as per the power of their indices.         
 * answer=  sum=sum+a[i]^i;
 * eg:input:{2,3,5}
 * Output:29

 */

package javaProgram_Assignment3;

public class SumOfElem_AccorToIndices2 {

	public static void main(String[] args) {
		int a[]={2,3,5};
		System.out.println(sumOfElementsWrtIndices(a));
		}
	public static int sumOfElementsWrtIndices(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++)
			s+=(Math.pow(a[i], i));
		return s;
	}
  }