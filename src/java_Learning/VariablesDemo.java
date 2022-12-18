package java_Learning;

public class VariablesDemo {
	
	int age=30;  // instance variable  // instance object
	static int score=150;  // static variable

	public static void main(String[] args) {
		// TO DO Auto-generated method stub

		int num=20;   // local variable
		
		System.out.println(num);
		System.out.println(score);
		
		VariablesDemo var=new VariablesDemo();
		var.method();
		var.method1();
		System.out.println("Executed");
		
		
	}
	
	public void method() {
		System.out.println("method:-"+age);
	}
	
	public void method1() {
		System.out.println("method1:-"+age);
	}
     int value= age;
}

