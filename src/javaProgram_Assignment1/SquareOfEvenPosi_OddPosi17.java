/* Program-17
 
 * Input a int array. Square the elements in even position and cube the elements in odd position and add them as result.
 * input: {1,2,3,4}
 * output: 1^3+2^2+3^3+4^2

 */


package javaProgram_Assignment1;

public class SquareOfEvenPosi_OddPosi17 {

	public static int squaringAndCubingOfElements(int[] a){
		int n1=0,n2=0;
		for(int i=0;i<a.length;i++)
			if(i%2==0)
				n1+=(a[i]*a[i]*a[i]);
			else
				n2+=(a[i]*a[i]);
		return (n1+n2);
	}
	public static void main(String[] args) {
			int a[]={1,2,3,4};
			System.out.println(squaringAndCubingOfElements(a));
		}
	}