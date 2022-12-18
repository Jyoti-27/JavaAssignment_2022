
/* Program_10
 * Find Average of an array values(double type {10.1,11.2,12.3,13.4,14.5})  */




package javaProgram_Assignment6;

public class Average_OF_Array {

	public static void main(String[] args) {
		

		double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };// By defining an Array
        double result = 0; // Result variable to Store the sum of array of values
        
        int i;

        for (i = 0; i < 5; i++) 
        {
           result = result + nums[i]; // addition of Values
        }
        System.out.println("Average is " + result / 5);
	}

}

