
// Assignment 7

/* Write a program to print the count of an object created for class */


package assignment1_2022;

public class Practice_Program_12 {
	
	static int count=0;  
	
	public static void main(String args[])  
	{  
	Practice_Program_12 c1=new Practice_Program_12();   
	c1.count();  
	Practice_Program_12 c2=new Practice_Program_12();  
	c2.count();  
	Practice_Program_12 c3=new Practice_Program_12();   
	c3.count();  
	Practice_Program_12 c4=new Practice_Program_12();   
	c4.count();  
	Practice_Program_12 c5=new Practice_Program_12();   
	c5.count();  
	System.out.println("Total Number of Objects: "+count);  
	}  
	
	//function counts the number of objects  
	static void count()  
	{  
	count++;  
	}  

		
}


