
// Assignment 9

// MethodOverriding



package assignment1_2022;

//import java_Learning.MethodOverridingDemo1;
//import java_Learning.SuperClass;
// Practice_Program_15 means MethodOverriding

public class Practice_Program_15 extends SuperClass1 {
	
	public void division(int a, int b) {
		int c=a/b;
		System.out.println("Child division is:"+c);
	}


	public static void main(String[] args) {
		// Practice_Program_15 obj=new Practice_Program_15();
		// obj.division(50,10);
		
		
		SuperClass1 superclassObj1=new SuperClass1();  // Parent class will be called
		superclassObj1.division(50,10);
		
		SuperClass1 superclassObj=new Practice_Program_15();  // Upcasting=> we can create object of current class 
		                                                      // and can access or assign to parent class
		superclassObj.division(50,10);
		
	}

}


	