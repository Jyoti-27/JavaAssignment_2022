/* Program-14
  
 * perfect no or not?
 */

package javaProgram_Assignment5;

public class Perfect_OrNot14 {

	public static void main(String[] args) {
		int n=28;
		System.out.println(perfectNumber(n));
	}
	public static boolean perfectNumber(int n) {
		int n1=0;
		boolean b=false;
		for(int i=1;i<n;i++)
			if(n%i==0)
				n1+=i;
		System.out.println(n1);
		if(n1==n)
			b=true;
		return b;
	}
  }