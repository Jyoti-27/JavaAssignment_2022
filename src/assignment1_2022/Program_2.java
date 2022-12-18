
    /* Program_2
    *To find sum of first 10 natural no.s  using Do while Loop
	*Ex: Sum of 1+2+3+4+5+6+7+8+9+10 should be printed.
	*Sum=55 */


// Using DoWhile Loop Statement






package assignment1_2022;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the starting number:-");
		//int i=scan.nextInt();
		
		int i=1;
		int sum=0;
	
		
		do {
			 sum=sum+i;
			System.out.println("The sum of first ten natural numbers-"+sum);
			i++;
		}while(i<=10);
		
		

	}

}

