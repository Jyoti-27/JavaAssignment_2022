
// Assignment 1

// if_else_if statement


// 1. To find whether given number is even or odd? 




package java_Learning;

import java.util.Scanner;

public class Assignment1_EvenOdd {

	public static void main(String[] args) {
		
		//To take input from the user 
		
	    //Create an object of scanner class
		
	    Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a number:");
			
			int num=scan.nextInt();
			
			

			//If number is divisible by 2 then it's an even number
			//else odd number
			
			if ( num % 2 == 0 ) {
			    System.out.println("The entered number is even");
			}
			 else {
			    System.out.println("The entered number is odd");
			 }
		}
	    
	}

