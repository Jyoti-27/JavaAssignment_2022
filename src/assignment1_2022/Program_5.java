 
  /* Program_5 
   * Write a program to find and list Even numbers between 1 and any given number.
   * Example: Limit=50
   * Display Even numbers between 1 and 50  */

 //  Using For_Loop Statement

package assignment1_2022;

public class Program_5 {

	public static void main(String[] args) {
		int num=50;  
		System.out.print("Display the list of even numbers from 1 to "+num+": ");  
		for (int i=1; i<=num; i++)   
		{  
		
		
		//logic to check if the number is even or not  
		//if i%2 is equal to zero, the number is even  
		
		if (i%2 == 0)   
		{  
		System.out.print(i + " ");  
		}  

		}
		

	}

}

