package java_Learning;

import java.util.Scanner;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		
		// while(condition) {  }
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting number:-");
		int i=scan.nextInt();
		    while(i<=20) {
		    System.out.println("Value of I-" +i);
		    i++;
		    }

	}

}

