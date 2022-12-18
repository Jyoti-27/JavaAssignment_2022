package java_Learning;

public class MethodOverridingDemo1 extends SuperClass {
	
	// Parent and child relationship
	// No arguments change or method is same as parent
	// Dynamic Polymorphism=> execution is decided by in run time method
	
	public void multiplication(int a, int b) {
		int c=a*b;
		System.out.println("Child multipliacation is:"+c);
	}


	public static void main(String[] args) {
		// MethodOverridingDemo1 obj=new MethodOverridingDemo1();
		// obj.multiplication(12,12);
		
		
		SuperClass superclassObj1=new SuperClass();  // Parent class will be called
		superclassObj1.multiplication(50,40);
		
		SuperClass superclassObj=new MethodOverridingDemo1();  // Upcasting=> we can create object of current class 
		                                                      // and can access or assign to parent class
		superclassObj.multiplication(45,40);
		
	}

}

