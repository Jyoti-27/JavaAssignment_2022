package java_Learning;

public abstract class AbstractClassDemo1 {  
	// some methods are implemented and some methods are not and partially implemented
	// implemented partially and must use abstract word before method
	// you can't create object of abstract class
	
	//concrete method
	public void addition(int a, int b) {
		int c=a+b;
		System.out.println("Sum is:-"+c);
	}
	
	//concrete method
	public final static void substraction(int a, int b) {
		int c=a-b;
		System.out.println("Substraction is:-"+c);
	}
	
    //abstract method
	public abstract void  multiplication();  // abstract class, doesn't create object , it doesn't have body
	
	//abstract method
	public abstract void  division(); 
		
	}




