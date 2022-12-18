package java_Learning;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		/*
		 * do
		 *{
		 *}
		 *while(condition)
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting number:-");
		int i=scan.nextInt();
		
		// while loop
		//while(i>20)//condition goes into infinite loop
		//while(i<=20) {
		    //System.out.println("Value of I-" +i);
		    //i++;
		   // }

		
		
		// do while loop
		
		
		do {
			System.out.println("Value of I-" +i);
			i++;
		}while(i<=20);
			
		}

	}


