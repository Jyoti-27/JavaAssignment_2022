// Assignment 6.1

// To  reverse a string

// Using Character Array



package assignment1_2022;

public class Practice_Program_10 {

	public static void main(String[] args) {
		
		String str="Prasad";
		String rev="";
		
		char a[]=str.toCharArray();
		int len=a.length;   // 6
		
		for(int i=len-1; i>=0; i--) //   5 4 3 2 1 0 -1
		{
		
		rev=rev+a[i];   // dasarP
	}
    System.out.println("Reverse string is:-" +rev);
  }

}

