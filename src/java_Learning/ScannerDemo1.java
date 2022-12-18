package java_Learning;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:-");
		int firstNumber=scan.nextInt();
		//int firstNumber=10;
		int secondNumber=20;
		int Sum=firstNumber+secondNumber;
		System.out.println("Sum of two numbers is:-" +Sum);
		
		

	}

}

