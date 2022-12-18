/* Program-6
  
 *   int[] input={2,1,4,1,2,3,6};
 *   check whether the input has the sequence of "1,2,3". if so-
 *   output=true;
 *   int[] input={1,2,1,3,4,5,8};
 *   output=false
 */

package javaProgram_Assignment4;

public class Input_Sequence6 {

	public static void main(String[] args) {
		int[] a={2,1,4,1,2,3,6};
		//int[] a={1,2,1,3,4,5,8};
		System.out.println(sequenceInArray(a));
	}
	public static boolean sequenceInArray(int[] a) {
		boolean b=false;
		int n=0;
		for(int i=0;i<a.length-1;i++)
			if((a[i+1]-a[i])==1)
				n++;
		if(n==2)
			b=true;				
		return b;
	}
 }