package java_Learning;

public interface InterfaceDemo1 {
	
	// interface will have final variable
	// interface is same as class but it is denoted by interface keyword
	// class would have variables and methods however interface would have final variable in the Final variable keyword
	// interface is completely non implemented method or unimplemented so compiler knows it doesn't require abstract keyword
	
	// 1. No one method is implemented/or unimplemented methods so 100% abstraction
	// 2. You can not create object of interface because there is no any method is allowed to implement by Java
	// 3. Interface can only allows to access public so other classes can use these unimplemented methods 
	// 4. We can't use here private because private has not any implementation there as interface is completely unimplemented
	// 5. Static final implement is allowed.
	// 6. All the methods are abstract methods in interface
	
	static final int i=20;
	
	public void test();
	
	public void test1();
	
	public void test2();
	
	public void test4();

	

}


