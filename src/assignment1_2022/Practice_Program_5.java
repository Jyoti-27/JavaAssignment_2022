
// Assignment 2.3

// Using StringBuilder Class method


// 1. To reverse the number. 



package assignment1_2022;

import java.util.Scanner;

public class Practice_Program_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num=sc.nextInt();  // num=1234 ;reverse=4321
		
		//StringBuffer reverse;
		StringBuilder sbl= new StringBuilder();   // To convert int num type into String type
		sbl.append(num);
		StringBuilder reverse = sbl.reverse();
		
		System.out.println("Reverse number is:-"+reverse);

	}

}


