package java_Learning;

public class StaticKeywordDemo1 {
	
	static String name1="Sachin";
	String name="Ramesh";

	public static void main(String[] args) {
		
		// static is constant or fixed.
		// static can be used as variable,method ,block
		// memory management, directly bound to class
		
		System.out.println(name1);   // static variable  // doesn't need to create object
		
		StaticKeywordDemo1 obj=new StaticKeywordDemo1();  // need to create object
		System.out.println(obj.name);   // non-static variable i.e. instance variable
		
		
	}
		

	

}

