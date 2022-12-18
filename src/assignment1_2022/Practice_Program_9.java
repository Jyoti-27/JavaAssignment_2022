// Assignment 6

// To  reverse a string

//  Using +(string concatenation) operator

package assignment1_2022;

public class Practice_Program_9 {

	public static void main(String[] args) {
		
				
		String str="Prasad";
		String rev="";
		
		int len=str.length();  //6
		
		for(int i=len-1; i>=0; i--) {   //5 4 3 2 1 0 if i== -1 then condition fails go to outside loop and print
			rev = rev+str.charAt(i);   // d a s a r P
			
		}
		
		System.out.println("Reverse of String is :" +rev);

	}

}


