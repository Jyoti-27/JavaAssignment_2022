
  /* Program_9
   * Take input of two  numbers from user and take one operator(+,-,*,/) as a input from user and do manipulations 
   * according to operator and display result on console.(Switch Case)
   * Ex: Enter first no:20
   * Enter second no:30
   * Enter operator:'*'
   * O/p: The multiplication of two no.s is: 600  */



package assignment1_2022;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {
		int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scan.nextInt();
        System.out.print("Enter second number:");
        num2 = scan.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        
        char operator = scan.next().charAt(0);   // char ch=scan.next().charAt(0); // switch(ch){}
        scan.close();
        int output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

                default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }



}



