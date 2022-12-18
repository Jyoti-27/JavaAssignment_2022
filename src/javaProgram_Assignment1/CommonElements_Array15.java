/* Program-15
 
 * Get two integer arrays as input. Find if there are common elements in the arrays. find the number of common elements.
 * input1: {1,2,3,4}
 * input2: {3,4,5,6}
 * output: 4(3,4,3,4)

 */



package javaProgram_Assignment1;

public class CommonElements_Array15 {

	public static int commonElements(int[] a,int[] b){
		int c=0;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
					c++;
		return (2*c);
	}
	public static void main(String[] args){
		int a[]={1,2,3,4};
		int b[]={3,4,5,6};
		System.out.println(commonElements(a,b));
	}
}