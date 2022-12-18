package java_Learning;

public class StaticKeywordDemo3 {
	
	//  with  using StaticKeyword
	String firstname;
	String surname;
	static String instituteName="EducationSoln";
	
	//static String instituteName="EducationSoln";  //with using StaticKeyword
	
	
	//public static void main(String[] args) {
		
		// static is constant or fixed.
		// static can be used as variable,method ,block
		// memory management, directly bound to class
		
		
		
		StaticKeywordDemo3(String fname, String lname)
		{
			firstname=fname;
			surname=lname;
			
		}
		
		
		public void display() {
			System.out.println(firstname+ " " +surname+" " +instituteName);
			
		}
		
		static {
			System.out.println("Static block is executed");
			instituteName="educationsoln";
			
		}
		
		public static void main(String args[] ) {
			StaticKeywordDemo3 obj=new StaticKeywordDemo3("Mayur", "Boche") ;
			StaticKeywordDemo3 obj1=new StaticKeywordDemo3("Vijay", "Salunkhe") ;
			StaticKeywordDemo3 obj2=new StaticKeywordDemo3("Jyoti", "Sabarad") ;
			StaticKeywordDemo3 obj3=new StaticKeywordDemo3("Dipali", "Adhav") ;
			
			obj.display();
			obj1.display();
			obj2.display();
			obj3.display();
		
		
		
		
		//System.out.println(name1);   // static variable  // doesn't need to create object
		
		//StaticKeywordDemo1 obj=new StaticKeywordDemo1();  // need to create object
		//System.out.println(obj.name);   // non-static variable i.e. instance variable
		
	}

}


		



   

