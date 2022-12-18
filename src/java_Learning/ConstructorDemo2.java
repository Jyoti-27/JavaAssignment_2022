package java_Learning;

public class ConstructorDemo2 {
	// // constructor is a special type of same name/MethodName  as that of class
	
	
	// default constructor....created by JVM
	
	
	// argument constructor----created by user as per need
	
	
	static int num;
	int k;
	
	ConstructorDemo2(int i){
		num=i;
	}
	
	ConstructorDemo2(int i, int j){
		num=i;
		k=j;
	}
	
	

	public static void main(String[] args) {
		
		ConstructorDemo2 obj=new ConstructorDemo2(15, 55);
		System.out.println(num);
		System.out.println(obj.k);
		System.out.println(num + " " + obj.k);
		System.out.println(StaticKeywordDemo1.name1);   // static.....assigined directly because 
		                                                // it is bounded in class and doesn't need to create an object
		StaticKeywordDemo1 statickeyword=new StaticKeywordDemo1();
		System.out.println(statickeyword.name);    // non-static----assigned by creating object
		

	}


}

