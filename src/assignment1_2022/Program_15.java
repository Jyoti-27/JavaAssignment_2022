
/* Program_15
 * 
 *  Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.
 * Input:9
 * Output:1+3-5+7-9=-3    */




package assignment1_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_15 {
	 
public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in);
	
    int n;


    System.out.println("Enter no :");
    n = myObj.nextInt();


    int sum = 1,i,count=0,sub;
    for (i = 3; i <= n; i = i + 2)
     {
       count++;
       if (count == 2)
         {
            sub = sum - i;
            sum = sub;
            count = 0;
            continue;
         }
        sum = sum + i;
     }
   System.out.println("Output is: " + sum);
    }
}


