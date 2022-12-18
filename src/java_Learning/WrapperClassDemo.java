package java_Learning;

public class WrapperClassDemo {
	
	// Primitive Data types===> boolean, int, short, byte, float, double, char, short
	// Wrapper Class===> int -Integer, boolean-Boolean, byte-Byte, char-Character, short-Short
	// Wrapper Class is used primitive data type into an object
	
	// Autoboxing ===> Primitive data type into the wrapper class(or object)
	// Unboxing   ===> wrapper class(or object) into the Primitive data type 
	
	
	

	public static void main(String[] args) {
		
		// Autoboxing==> Primitive into object
		int i=20;  // Primitive data type
		Integer j=i;  // Wrapper class type
		System.out.println("Integer is-:"+j);
		
		
		char c='l';
		Character k=c;
		System.out.println("Character is-:"+k);
		
		
		// Unboxing==> object into primitive
		Integer x=5;
		int a=x;
		System.out.println("Int value is-:"+a);
		

	}

}

