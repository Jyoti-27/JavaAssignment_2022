/* Program-14
 
 * Find the extension of a given string file.
 * input: "hello.jpeg"
 * output: "jpeg"

 */



package javaProgram_Assignment1;

import java.util.StringTokenizer;

public class FindExtension_String14 {

	public static String extensionString(String s1){
		StringTokenizer t=new StringTokenizer(s1,".");
		t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
	public static void main(String[] args) {
		String s1="hello.jpeg";
		System.out.println(extensionString(s1));
	}
}