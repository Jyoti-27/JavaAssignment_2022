package java_Learning;

public  abstract class InterFaceUtilisingClass implements InterfaceDemo1 {
	
	// interface is not a class so class can be 'extends' keyword but interface is 'implements' keyword
	// InterFaceUtilisingClass class is not able to fully implemented of  all the unimplemented methods in interface
	// For implementing remaining fourth method class needs to become abstract class then error gone
	


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
	
	public static void main(String[] args) {
		//InterFaceUtilisingClass obj=new InterFaceUtilisingClass(); // objects are not created by abstract class
		//obj.test();
		

	}

}
