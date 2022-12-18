
/* Program-2.5
  
 * Given integer array
 * input :int[] arr={2,3,5,4,1,6,7,7,9};

 * Remove the duplicate elements and print sum of even numbers in the array..
 * print -1 if arr contains only odd numbers

 */

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_SumEven2_5 {

	public static void main(String[] args) {
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
