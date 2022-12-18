package java_Learning;

// Polymorphism:- Certain task we can achieve by many forms    1) MethodOverloading    2}MethodOverrriding

// 1) MethodOverloading =>  1. by changing no. of arguments  2. by changing no. of data types

//  MethodOverloading can not be achieved by changing return type(ex-void-doesn't return anything)

public class MethodOverloadingDemo1 {
	
	// Addition of Numbers
	public static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition is:-"+c);
				
	}
	
	// Method Overloading...> same method but passing arguments are different
	public static void addition(int a, int b, int d)
	{
		int c=a+b+d;
		System.out.println("Sum is:-"+c);
				
	}
	
	public static void addition(int a, int b, int d, int e)
	{
		int c=a+b+d+e;
		System.out.println("Sum is:-"+c);
				
	}
	
	public static void addition(float a, float b)
	{
		float c=a+b;
		System.out.println("Float type Addition is:-"+c);
	}
	
	public static void addition(double a, double b)
	{
	    double c=a+b;
		System.out.println("Double type Addition is:-"+c);
	}
	
	public static void addition(int a, float b, double c)
	{
	double d=a+b+c;
		System.out.println("Mix parent data type addition is:-"+d);
				
	}

	public static void addition(int a, byte b, long c)
	{
	long d=a+b+c;
		System.out.println("Mix data type addition is:-"+d);
				
	}
	public static void main(String[] args) {
		
		// addition(5,2,6);
	    // addition(5.0f,2.0f);  // float type
	    // addition(5.0,2.0);   //  double type
	       addition(5,4.0f,7.0);
		//  addition(3,9,123456789554L);

	}

}

