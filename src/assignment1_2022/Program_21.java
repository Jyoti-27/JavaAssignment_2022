
/* Program_21
 
 *  An arraylist of Strings is given as input. The count of the String elements that are not of size input2 string is to be returned.
 * input1: {"aaa","bb","cccc","d"}
 * input2: "bb"
 * output: 3("bb"-length:2) */

package assignment1_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_21 {
	/*
	 * public static int StringsNotOfGivenLength(List<String> l1, String s1) { int
	 * n1 = s1.length(); int c = 0; for (int i = 0; i < l1.size(); i++) { int n2 =
	 * l1.get(i).length(); if (n1 != n2) c++; } return c; }
	 */

	public static void main(String[] args) {
		List<String> unMatchedStrings = new ArrayList<>();
		int count = 0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements : ");
		int n = sc.nextInt();
	    //List<String> l1 = new ArrayList<String>();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the input string : ");
			arr[i] = sc.next();	
		}
		System.out.println("Enter another string which for lenght comparison:");
		String s1 = sc.next();


		for (String temp : arr) {
			if (temp.length() != s1.length()) {
				count++;
				unMatchedStrings.add(temp);

			}

		}

		System.out.println("Count of unmatched Strings is -" + count);
		System.out.println("list of  unmatched Strings are -" + unMatchedStrings);

	}

}
