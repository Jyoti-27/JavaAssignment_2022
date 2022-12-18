
// Assignment 2

// while statement


// 1. To reverse the number. 


package assignment1_2022;

public class Practice_Program_2 {

	public static void main(String[] args) {
		// reverse= reverse * 10 + remainder
		
		int num=5432,remainder,reverse=0;

		
		while(num != 0) {
		remainder=num % 10;
		reverse= reverse * 10 + remainder;
		num= num / 10;
	  }
		System.out.println("Print the reverse value-:"+reverse);

   }

}

