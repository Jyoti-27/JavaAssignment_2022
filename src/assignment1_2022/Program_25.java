

/* Program_25
 
 * Given integer array
 *	input :int[] arr={2,3,5,4,1,6,7,7,9};

 * Remove the duplicate elements and print sum of even numbers in the array..
 * print -1 if arr contains only odd numbers    */




package assignment1_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_25 {

	// simple java program to remove
	// duplicates

	/*class Main
	{
		 // Function to remove duplicate elements
		// This function returns new size of modified
		// array
		
		
		static int removeDuplicates(int arr[], int n)
		{
			// Return, if array is empty
			// or contains a single element
			if (n==0 || n==1)
				return n;
		
			int[] temp = new int[n];
			
			
			
			// Start traversing elements
			int j = 0;
			for (int i=0; i<n-1; i++)
				// If current element is not equal
				// to next element then store that
				// current element
				if (arr[i] != arr[i+1])
					temp[j++] = arr[i];
			
		
			
			
			// Store the last element as whether
			// it is unique or repeated, it hasn't
			// stored previously
			
			temp[j++] = arr[n-1];
			
			// Modify original array
			for (int i=0; i<j; i++)
				arr[i] = temp[i];
		
			return j;
		}
	}
}
		
		
		public static void main (String[] args)
		  
		
		{
			int arr[] = {2,3,5,4,1,6,7,7,9};
			int n = arr.length;
			
			n = removeDuplicates(arr, n);

			// Print updated array
			for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		}
	}
}*/
		
		
		/* public static void main(String[] args) 
		{ 
			 int p=0; 
			Scanner s = new Scanner(System.in); 
			System.out.println("Enter the size Of Array"); 
			int n = s.nextInt(); 
			int a[] = new int[n]; 
			System.out.println("Enter the Elements Of Array"); 
			for(int i=0;i<n;i++) 
			{ 
				a[i]=s.nextInt(); 
			} 
			for(int i=0;i<n;i++) 
			{ 
				for(int j=0;j<n;j++) 
				{ 
					if(j!=i) 
					{ 
						if(a[i]==a[j]) 
						a[j]=p; 
					} 
				} 
			} 
			System.out.println("Array after removing duplication"); 
			for(int i=0;i<n;i++) 
			{ 
				if(a[i]!=p) 
				System.out.println(a[i]); 
			} 
		} 
	}
}
*/
			
		
		
		
	public static void main(String[] args) 
			{ 
			int a[]={2,3,5,4,1,6,7,7,9};
			 System.out.println(sumOfEvenNos(a));
			}
			public static int sumOfEvenNos(int[] a) {
			 List<Integer> l1=new ArrayList<Integer>();
			 for(int i=0;i<a.length;i++)
			  l1.add(a[i]);
			 List<Integer> l2=new ArrayList<Integer>();
			 for(int i=0;i<a.length;i++)
			     for(int j=i+1;j<a.length;j++)
			      if(a[i]==a[j])
			       l2.add(a[j]);
			 l1.removeAll(l2);
			 l1.addAll(l2);
			 int n=0,n1;
			 for(int i=0;i<l1.size();i++)
			  if(l1.get(i)%2==0)
			   n+=l1.get(i);
			 if(n==0)
			  n1=-1;
			 else
			  n1=n; 
			 return n1;
			}
			
	}

