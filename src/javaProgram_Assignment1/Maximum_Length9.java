/* Program-9
  
 * find the max length-word in a given string and return the max-length word. if two words are of same length return the first occuring word of max-length
 * input:"hello how are you aaaaa"
 * output:hello(length-5)

 */


package javaProgram_Assignment1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Maximum_Length9 {

	public static String lengthiestString(String s1){
		int max=0;
	    String s2=null;
        StringTokenizer t=new StringTokenizer(s1," ");
        while(t.hasMoreTokens()){
        	s1=t.nextToken();
        	int n=s1.length();
        	if(n>max){
        		max=n;
        		s2=s1; 	}
        	}
        return s2;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=s.nextLine();
		System.out.println("The lengthiest string is:"+lengthiestString(s1));
		}
}
	
	
	/* public static void main(String[] args) {
        String s = "hello how are you aaaaa";
        System.out.println(noOfWordsInString(s));
  }
  public static int noOfWordsInString(String s) {
	    Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s11=s1.nextLine();
		System.out.println("The lengthiest string is:"+lengthiestString(s11));
        //StringTokenizer t = new StringTokenizer(s," ");
        //return t.countTokens();
		return 0;
  }
private static int lengthiestString(String s1) {
	// TODO Auto-generated method stub
	StringTokenizer t = new StringTokenizer(s1," ");
    return t.countTokens();
}
}*/