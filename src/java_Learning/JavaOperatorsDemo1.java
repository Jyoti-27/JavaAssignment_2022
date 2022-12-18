package java_Learning;

public class JavaOperatorsDemo1 {
	//- Single Line Comment
	/*
	 * - Multiline Comment (eg:abc def)
	 * 
	 * - Short Cut Key for Multiline Comment--Ctrl+shift+/
	 */
    // Class starts with capital letter followed with camel case
	// Method starts with lower case
	//Variable names starts with lower case
	// Package starts with lower case
	//Constant== Capital letter complete variable
	// Interface- Starts with capital/upper case
	
	// Arithmetic + - * / %(Modular)
	// % - Reminder 10/3  ans-1
	
	public static int total;
	public static final int NUMBERS=10;
	
	
	public static void main(String[] args) {
		
		// Addition
		
		/*int a=20;
		*int b=30;
		*int sum=a+b;
		*System.out.println("Sum is :" +sum); */
		
		addition(20,30);
		subtraction(40,35);
		modularOperation(50,15);
		multiplication(5,9);
		division(25,5);
		
		
		
		
	}
	
	public static void addition(int a, int b) {
		
		// Addition
		
				int sum=a+b;
				System.out.println("Sum is :" +sum);
						
	}
	
	public static void subtraction(int FirstNumber, int SecondNumber) {
		
		total=FirstNumber-SecondNumber;
		System.out.println("Subtraction is :" +total);
	}
	
	public static void modularOperation(int FirstNumber, int SecondNumber) {
	
	int modresult=FirstNumber%SecondNumber;
	System.out.println("Modular is :" +modresult);
	}
	
	public static void multiplication(int a, int b) {
		int multiresult=a*b;
		System.out.println("Multiplication is :" +multiresult);
		
	}
	
	public static void division(int a, int b) {
		int divresult=a/b;
		System.out.println("Division is :" +divresult);
	
	}

}

