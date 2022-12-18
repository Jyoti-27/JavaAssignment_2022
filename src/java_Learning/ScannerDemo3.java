package java_Learning;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
		
        //int firstNumber=10;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:-");
		int firstNumber=scan.nextInt();
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter second number:-");
		int secondNumber=scan1.nextInt();
		
		//int secondNumber=20;
		
		
		int Sum=firstNumber+secondNumber;
		System.out.println("Sum of two numbers is:-" +Sum);

	}

}

