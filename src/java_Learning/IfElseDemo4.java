package java_Learning;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args) {
		
		
		try (//nested if else using Scanner
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter your score");
			
			int score=scan.nextInt();
			//int score=36;
			if(score>=35) {
				
				
				if(score>=35  && score<60) {
					System.out.println("Student is passed");
				}

				else if(score>60  && score<75) {
					System.out.println("Student is passed with first class");
				}
				
				else if(score>75) {
					System.out.println("Student is passed with Distinction");
				}
				
				else {
					System.out.println("Student is failed");

                }

             }
		}
	}
}

