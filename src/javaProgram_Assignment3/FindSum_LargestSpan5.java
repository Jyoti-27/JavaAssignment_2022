/* Program-5
 * 
 *  Given an array find the largest 'span'(span is the number of elements between two same digits)
 *  find their sum.
 *	a[]={1,4,2,1,4,1,5}
 *	Largest span=5
 */

package javaProgram_Assignment3;

public class FindSum_LargestSpan5 {

	public static void main(String[] args) {
		int a[]={1,4,2,1,4,1,5};
		System.out.println("Sum of largest span elements:"+largestSpan(a));
	}
	public static int largestSpan(int[] a) {
		int max=0;
		int p1=0;
		int p2=0;
		int n=0;
		int sum=0;
		for(int i=0;i<a.length-1;i++){			
			for(int j=i+1;j<a.length;j++)					
				if(a[i]==a[j])					
					n=j;
			if(n-i>max){
				max=n-i;
				p1=i;
				p2=n; }
		}
		System.out.println("Largest span:"+(p2-p1));
		for(int i=p1;i<=p2;i++)
			sum=sum+a[i];
		return (sum);
	}
 }