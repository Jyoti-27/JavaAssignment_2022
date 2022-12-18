// Assignment 3
 
// Check whether number is palindrome or not?

// Using while and if- else and while statement




package assignment1_2022;

public class Practice_Program_6 {

	public static void main(String[] args) {
		int num = 434;
		int temp = num;
		int reverse=0, remainder;
		
		while(temp != 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
			
		}
		if(num==reverse) {
			System.out.println(" The given number is a Palindrome number");
		}
		else {
			System.out.println(" The given number is not a Palindrome number");
		}

	}
}




