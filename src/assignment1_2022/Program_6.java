  

  /* Program_6 
   * Write a program to find whether given no. is Prime or not.
   * Ex: 30
   * o/p:30 is not prime  */



package assignment1_2022;

public class Program_6 {

	public static void main(String[] args) {
		int num = 30;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for non-prime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
	
		

	}

}

