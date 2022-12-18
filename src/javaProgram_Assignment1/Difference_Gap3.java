/* Program-3
 
 * A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap.
 * input: {2,3,4,2,3}
 * logic: 2-3=1,3-4=1,4-2=2,2-3=1
 * 2 is the max difference between 4 and 2,return the index of 4 i.e 2
 * output:2
 */



package javaProgram_Assignment1;

public class Difference_Gap3 {
	
	static int maxAbsDiff(int arr[], int n)
	{
     

		// Function to return the maximum absolute difference between any two elements of the array
		// To store the minimum and the maximum elements from the array
		
		int minEle = arr[0];
		int maxEle = arr[0];
		for (int i = 1; i < n; i++) {
			minEle = Math.min(minEle, arr[i]);
			maxEle = Math.max(maxEle, arr[i]);
		}

		return (maxEle - minEle);
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 4, 2, 3 };
		int n = arr.length;
		System.out.print(maxAbsDiff(arr, n));
	}
}

	



/*public static int getDiffArray(int[] n1){
		int n2,n3=0,n4=0,i;
		for(i=0;i<n1.length-1;i++){
			n2=Math.abs(n1[i]-n1[i+1]);
			if(n2>n3){
				n3=n2;
				n4=i+1; }}
		return n4;
	}
	public static void main(String[] args) {
		int[] n1={2,3,4,2,3};
		System.out.println(getDiffArray(n1));
		System.out.println(("4[n1]"));
		
	}
}*/



	


	

