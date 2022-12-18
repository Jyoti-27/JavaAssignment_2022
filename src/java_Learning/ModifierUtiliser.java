package java_Learning;

public class ModifierUtiliser extends AccessModifierDemo2 {

	public static void main(String[] args) {
		
		// System.out.println(AccessModifierDemo1.b);
		// AccessModifierDemo1.a; // private variables not allowed to access
		 System.out.println(AccessModifierDemo2.b);
		 System.out.println(AccessModifierDemo2.j);
		 System.out.println(AccessModifierDemo2.k);
		
		
		AccessModifierDemo2  obj=new AccessModifierDemo2 ();
		// obj.addition(10,20);  // private method not allowed to access
		obj.subtraction(20,10);
		obj.multiplication(15,25);
		obj.division(25,5);
		

	}

}

