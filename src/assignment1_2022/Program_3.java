   /* Program_3
    * Write a program to find fibonacci series using For Loop
	*Ex: First 10 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 +   */


// Using For_Loop Statement


package assignment1_2022;

public class Program_3 {

	public static void main(String[] args) {
		
			    int n = 10, firstTerm = 0, secondTerm = 1;
			    System.out.println("Fibonacci Series till " + n + " terms:");

			    for (int i = 1; i <= n; ++i) {
			      System.out.print(firstTerm + ", ");

			      // compute the next term
			      int nextTerm = firstTerm + secondTerm;      // firstTerm =  0 and secondTerm = 1
			    		  
			      firstTerm = secondTerm;    // nextTerm = firstTerm + secondTerm; (0 + 1)
			                                 // firstTerm = secondTerm; (1)
			                                 // secondTerm = nextTerm; (1)
			                                 // nextTerm = firstTerm + secondTerm; (1 + 1)
			                                 // ....
			      secondTerm = nextTerm;
			    }

	}

}

