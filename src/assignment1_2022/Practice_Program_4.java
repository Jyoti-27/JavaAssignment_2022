
// Assignment 2.2

// Using StringBuffer Class method


// 1. To reverse the number. 




package assignment1_2022;

import java.util.Scanner;

public class Practice_Program_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num=sc.nextInt();  // num=1234 ;reverse=4321
		
		//StringBuffer reverse;
		StringBuffer sb= new StringBuffer(String.valueOf(num));   // To convert int num type into String type
		StringBuffer reverse = sb.reverse();
		
		System.out.println("Reverse number is:-"+reverse);

	}
	

}


