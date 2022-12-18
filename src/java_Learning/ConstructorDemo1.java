package java_Learning;

public class ConstructorDemo1 {
	// // constructor is a special type of same name/MethodName  as that of class
	
	
	// default constructor....created by JVM
	
	
	// argument constructor----created by user as per need
	
	
	static int num;
	int k;
	
	ConstructorDemo1(int i){
		num=i;
	}

	public static void main(String[] args) {
		
		ConstructorDemo1 obj=new ConstructorDemo1(20);
		System.out.println(num);

	}


}

