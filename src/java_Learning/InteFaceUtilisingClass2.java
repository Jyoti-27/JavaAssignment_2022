package java_Learning;

public class InteFaceUtilisingClass2 implements InterfaceDemo1, InterfaceDemo2 {

	@Override
	public void test() {
		System.out.println("In test method");
		
	}

	@Override
	public void test1() {
		System.out.println("In test1 method");
		
	}

	@Override
	public void test2() {
		System.out.println("In test2 method");
		
	}
	
	

	@Override
	public void test5() {  // not executed at output
		
	}


	@Override
	public void test4() {  
		
	}
	

	@Override
	public void test6() {  // not executed at output
		
	}
	
	public static void main(String[] args) {
		InteFaceUtilisingClass2 obj=new InteFaceUtilisingClass2(); // objects are not created by abstract class
		obj.test();
		obj.test1();
		obj.test2();
		obj.test4();
		
		
		

	}

}


