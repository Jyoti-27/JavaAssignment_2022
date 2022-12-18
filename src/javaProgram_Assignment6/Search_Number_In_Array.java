/* Program_13
 * Search given number in an array.If number is present in an array then print number and array index of that no.
 * If not,print "Element not found" message.
 * e.g Array={12,56,67,98}
 * given no:67
 * Print 67 and 2(Array index at which element is present)   */





package javaProgram_Assignment6;


import java.util.Scanner;

public class Search_Number_In_Array {

	public static void main(String[] args) {
		
		int arr[]= {12,56,67,98};
		boolean flag;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to be searched:-");
		int num=scan.nextInt();
		
		for(int i=0; i < arr.length; i++){
			if(arr[i]== num) {
				flag=true;
				System.out.println("Number is present");
				break;
			} else {
				flag=false;
			}
		}
		
		if(flag=false) {
			System.out.println("The number is not present in an Array");
		}

	}

}

