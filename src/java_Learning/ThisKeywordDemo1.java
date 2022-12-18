package java_Learning;

public class ThisKeywordDemo1 {
	// This keyword represents current class reference i.e. instance variable
	// 1.Current class instance variable
	// 2.This keyword represents current constructor
	// 3.Calling current class method
	
	
	// 1.Current class instance variable
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	// 2.current class constructor
	ThisKeywordDemo1(){
		System.out.println("Constructor");
	}
	
	ThisKeywordDemo1(int age){
		this();
		System.out.println("Parametorized Constructor");
	}
	
	
	//3. current class method
	public void sampleTest() {
		System.out.println("sample test");
		
	}
	
	public void test() {
		this.sampleTest();
		System.out.println("Test Method");
		
	}

	public static void main(String[] args) {
		ThisKeywordDemo1 obj=new ThisKeywordDemo1(25);
		obj.test();
		
		

	}

}

