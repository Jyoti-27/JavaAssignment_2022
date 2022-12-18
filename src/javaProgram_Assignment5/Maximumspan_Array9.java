/* Program-9
  
 *   Find the Maximum span of the given array.
 *   span is the number of elements between the duplicate element
 *   including those 2 repeated numbers.
 *   if the array as only one element,then the span is 1.
 *	 input[]={1,2,1,1,3}
 *	 output1=4
 *	 input[]={1,2,3,4,1,1,5}
 *	 output1=6
 */

package javaProgram_Assignment5;

public class Maximumspan_Array9 {

	public static void main(String[] args) {
		int[]a={1,2,1,1,3};
	  //input[]={1,2,3,4,1,1,5}
		System.out.println(maxSpan(a));
	}
	public static int maxSpan(int[] a) {
		String s2 = null;
		int n=0;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length;i++)
			sb.append(String.valueOf(a[i]));
		String s1=sb.toString();
		for(int i=0;i<s1.length();i++)
			for(int j=i+1;j<s1.length();j++)
				if(s1.charAt(i)==s1.charAt(j))
					s2=String.valueOf(s1.charAt(j));
		int n1=s1.indexOf(s2);
		int n2=s1.lastIndexOf(s2); 
		for(int i=n1+1;i<n2;i++)
			n++;
		return (n+2);
	}
 }