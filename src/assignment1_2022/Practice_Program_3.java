


// Assignment 2.1

// while statement using Scanner method


// 1. To reverse the number. 



package assignment1_2022;

import java.util.Scanner;

public class Practice_Program_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num=sc.nextInt();  // num=1234 ;reverse=4321
		
		int reverse=0;
		
		while(num != 0) {
			reverse =reverse * 10 +  num % 10;  // reverse=0 so 0 * 10 + 1234 % 10;  the remainder=4 ; so 4 is stored in reverse value...continue as this step
			num = num / 10;  // 1234 / 10 =123....4 is removed again number is 123....continue as this
		}
		System.out.println("Reverse number is:-"+reverse);
		
		

	}

}
