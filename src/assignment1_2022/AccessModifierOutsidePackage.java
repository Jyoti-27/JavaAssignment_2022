package assignment1_2022;

import java_Learning.AccessModifierDemo2;
import java_Learning.ModifierUtiliser;

public class AccessModifierOutsidePackage extends AccessModifierDemo2 {
	

	public static void main(String[] args) {
		
		// AccessModifierDemo2.b;  // default not allowed outside the package
		System.out.println(AccessModifierDemo2.j);
		System.out.println(AccessModifierDemo2.k);
		
		AccessModifierDemo2 obj1=new AccessModifierDemo2();
		
		ModifierUtiliser obj2=new ModifierUtiliser () ;
		
		// obj1.subtraction(20,10);  // default not allowed outside the package
		
		//obj2.multiplication(15,15);
		obj1.division(30, 5);
		

	}

}

