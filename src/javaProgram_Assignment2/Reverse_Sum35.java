
/* Program-35  // Half Program and have to find reverse of sum
  
 * Retrieve the elements in a array, which is an input, which are greater than a specific input number. Add them and find the reverse of the sum.
 */

package javaProgram_Assignment2;

import java.util.Scanner;

public class Reverse_Sum35 {

	public static void main(String[] args) {
		int[] a={23,35,11,66,14,32,65,56,55,99};
		int b=37;
		
		System.out.println("AdditionOfRetrievedElements(a,b) is-"+additionOfRetrievedElements(a,b));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int num=sc.nextInt();  // num=1234 ;reverse=4321

		int reverse = 0;

		int num1 = 0;
		while(num1 != 0) {
			reverse =reverse * 10 +  num1 % 10;  // reverse=0 so 0 * 10 + 1234 % 10;  the remainder=4 ; so 4 is stored in reverse value...continue as this step
			num1 = num1 / 10;  // 1234 / 10 =123....4 is removed again number is 123....continue as this
		}
		
		System.out.println("Reverse number is:-"+reverse);
		
		
		//System.out.println(additionOfRetrievedElements(a,b));
		}
	public static int additionOfRetrievedElements(int[] a, int b) {
		int n=0;
		for(int i=0;i<a.length;i++)
			if(a[i]>b)
				n+=a[i];
		return n;
	}
 }

