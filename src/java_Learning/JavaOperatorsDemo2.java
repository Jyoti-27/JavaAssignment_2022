
package java_Learning;

public class JavaOperatorsDemo2 {
	//- Single Line Comment
	/*
	 * - Multiline Comment (eg:abc def)
	 * 
	 * - Short Cut Key for Multiline Comment--Ctrl+shift+/
	 */
    // Class starts with capital letter followed with camel case
	// Method starts with lower case
	//Variable names starts with lower case
	// Package starts with lower case
	//Constant== Capital letter complete variable
	// Interface- Starts with capital/upper case
	
	// Arithmetic + - * / %(Modular)
	// % - Reminder 10/3  ans-1
	
	// Unary - a++, a--;  ++a, --a;  -a, +a, !;
	
	// Relational- ==, <=, >=, <, >;
	
	// Logical - && (AND) , || (OR);
	
	// Assignment - =, +=, -=;
	
	// Ternary - ?:  Condition?: x:y
	
	
	public static int total;
	public static final int NUMBERS=10;
	
	
	public static void main(String[] args) {
		
		// Addition
		
		/*int a=20;
		*int b=30;
		*int sum=a+b;
		*System.out.println("Sum is :" +sum);*/
		
		//addition(20,30);
		//subtraction(40,35);
		//modularOperation(50,15);
		//multiplication(5,9);
		//division(25,5);
		
		// Ternary
		int q=26;
		int r=30;
		int s=(q>r)?q:r;
		System.out.println(s);
		
		int w=31;
		int g=30;
		int u=(w>g)?w:g;
		System.out.println(u);
		
		
		// Assignment
		int o=20;
		int p=5;
		p+=o;  // p=p+o ; Sum of two numbers
		System.out.println(p);
		
		int e=10;
		int b=5;
		b-=e;  // b=b-e ; Subtraction of two numbers
		System.out.println(b);
		
		// Logical
		int h=25;
		int i=10;
		int j=35;
		
		if(j>h && j==h+i) {
			System.out.println("Logical AND outcome is true");
		}else {
			System.out.println("Logical  AND outcome is false");
		}
		
		
		if(j>h || j==h+i) {
			System.out.println("Logical OR outcome is true");
		}else {
			System.out.println("Logical  OR outcome is false");
		}
		
		int t=28;
		int y=10;
		int f=35;
		
		if(f>t && j==t+y) {
			System.out.println("Logical AND outcome is true");
		}else {
			System.out.println("Logical  AND outcome is false");
		}
		
		
		// Relational
		int m=10;
		int n=5;
		
		if(m==n) {
			System.out.println("both numbers are equal");
		}else {
			System.out.println("both numbers are not equal");
		}
		
		
		if(m<=n) {
			System.out.println("n is bigger");
		}else {
			System.out.println("m is bigger");
		}
		
		if(m>=n) {
			System.out.println("m is bigger");
		}else {
			System.out.println("n is bigger");
		}
		
		
		
		if(m>n) {
			System.out.println("m is bigger");
		}else {
			System.out.println("n is bigger");
		}
		
		
		if(m<n) {
			System.out.println("m is lesser");
		}else {
			System.out.println("n is lesser");
		}
		
		
		int c=14;
		int d=14;
		
		if(c==d) {
			System.out.println("both numbers are equal");
		}else {
			System.out.println("both numbers are not equal");
		}
		
		
		
		if(c<=d) {
			System.out.println("both are equal or c is bigger");
		}else {
			System.out.println("d is bigger");
		}
		
		
		
		
		if(c>=d) {
			System.out.println("both are equal or c is bigger");
		}else {
			System.out.println("d is bigger");
		}
		
		
		// Unary
		int z=5;
		//int z1=-z;
		int z1 = +z;
		//int z1 = + 2;
		int z2 = z1 + 2;  //-5+2
		System.out.println(z2);  //-5
		
		if(z != 5) {
			System.out.println("z is not assigned with 5");
		}
		else {
			System.out.println("z is assigned with 5");
	}
		int k=20;
		System.out.println("Value of k is :" +k);
		System.out.println("Value of k  during postfix is  :" +k++);
		System.out.println("Value of k  after postfix is :" +k);
		
		
		int l=15;
		System.out.println(l); //15
		System.out.println(l--);  //15
		System.out.println(l);  //14
		
		
		
		
	}
	
	
}

