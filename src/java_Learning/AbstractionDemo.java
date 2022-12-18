package java_Learning;

public  class AbstractionDemo extends AbstractClassDemo1 {
	
	@Override
	public  void  multiplication() {
		System.out.println("Multiplication method is executed");
	}
	
	
	@Override
	public  void  division() {
		System.out.println("Division method is executed");
	}

	public static void main(String[] args) {
		AbstractionDemo obj=new  AbstractionDemo();
		obj.addition(15,20);
		AbstractionDemo.substraction(20,25);
		obj.multiplication();
		obj.division();
		
// AbstractClassDemo1 obj1=new AbstractClassDemo1(); // Error generated because you can't create object of abstract class
	}

}


