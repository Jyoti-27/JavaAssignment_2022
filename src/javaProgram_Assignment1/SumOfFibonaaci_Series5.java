
/* Program-5  
 
 * Sum of fibonaaci series upto given input.
 * sum of first 3 
 * logic:1+1+2
 * output:4
 */


package javaProgram_Assignment1;

import java.util.Scanner;


public class SumOfFibonaaci_Series5 {
 

	public static int sumOfFibonacci(int n){
		int a=-1,b=1,c=2,d=0;
		for(int i=0;i<=n;i++){
			c=a+b;
			a=b; b=c;
			d=d+c;
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements : ");
		int n=s.nextInt();
		System.out.println(sumOfFibonacci(n));
	}
} 

	
	

	/*private static int findSum(int n) {
        
        int currentValue = 1, prevValue = 0, sum = 0, temp;

        
        if (n <= 0)
            return 0;

        if (n == 1)
            return 1;

        
        sum = 1;
        for (int i = 2; i < n; i++) {
        	temp = currentValue;
            currentValue = prevValue + currentValue;
            prevValue = temp;

            sum += currentValue;
        }
        return sum;
    }

    public static void main(String[] args) {
        //1
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
      //2
        System.out.println("Sum = " + findSum(n));
    }
}*/
        



/*
 * // Java Program to find sum of Fibonacci numbers

   import java.io.*;

   class GFG {
	
	// Computes value of first fibonacci numbers
	
	static int calculateSum(int n)
	{
		if (n <= 0)
		return 0;
	
		int fibo[]=new int[n+1];
		fibo[0] = 0; fibo[1] = 1;
	
		// Initialize result
		int sum = fibo[0] + fibo[1];
	
		// Add remaining terms
		for (int i=2; i<=n; i++)
		{
			fibo[i] = fibo[i-1]+fibo[i-2];
			sum += fibo[i];
		}
	
		return sum;
	
	
	// Driver program to test above function
	public static void main(String args[])
	{
		int n = 4;
		System.out.println("Sum of Fibonacci" +
		" numbers is : "+ calculateSum(n));
	}
}
*/
	


	