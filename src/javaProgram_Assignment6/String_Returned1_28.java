/* Program-1.28  // Not getting expected output // checked
  
 * An arraylist of Strings is given as input. The count of the String elements that are not of size input2 string is to be returned.
 * input1: {"aaa","bb","cccc","d"}
 * input2: "bb"
 * output: 3("bb"-length:2)
*/

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_Returned1_28 {

	public static int StringsNotOfGivenLength(List<String> l1,String s1){
		int n1=s1.length();
		int c=0;
		for(int i=0;i<l1.size();i++){
			int n2=l1.get(i).length();
			if(n1!=n2)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=s2.nextInt();
		List<String> l1=new ArrayList<String>();
		for(int i=0;i<n;i++)
			l1.add(s2.next());
		System.out.println("Enter the input string:");
		String s3=s2.next();
		System.out.println(StringsNotOfGivenLength(l1,s3));
	}
}