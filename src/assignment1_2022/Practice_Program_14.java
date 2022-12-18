// Assignment 8

// MethodOverloading




package assignment1_2022;

public class Practice_Program_14 {
	
	// Subtraction of Numbers
	public static void addition(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction is:-"+c);
				
	}
	
	// Method Overloading...> same method but passing arguments are different
	public static void subtraction(int a, int b, int d)
	{
		int c=a-b-d;
		System.out.println("Sub is:-"+c);
				
	}
	
	public static void subtraction(int a, int b, int d, int e)
	{
		int c=a-b-d-e;
		System.out.println("Sub is:-"+c);
				
	}
	
	public static void subtraction(float a, float b)
	{
		float c=a-b;
		System.out.println("Float type Subtraction is:-"+c);
	}
	
	public static void subtraction(double a, double b)
	{
	    double c=a-b;
		System.out.println("Double type subtraction is:-"+c);
	}
	
	public static void subtraction(int a, float b, double c)
	{
	double d=a-b-c;
		System.out.println("Mix parent data type addition is:-"+d);
				
	}

	public static void subtraction(int a, byte b, long c)
	{
	long d=a-b-c;
		System.out.println("Mix data type subtraction is:-"+d);
				
	}
	public static void main(String[] args) {
		
		// subtraction(5,2,6);
	    // subtraction(5.0f,2.0f);  // float type
	    // subtraction(5.0,2.0);   //  double type
		   subtraction(5,4.0f,1.0);
		// subtraction(3,9,123456789554L);

	}

}


	