package java_Learning;

public class StaticKeywordDemo2 {
	
	//  without using statickeyword
	String firstname;
	String surname;
	String instituteName;
	
	//static String instituteName="EducationSoln";  //with using StaticKeyword
	
	
	//public static void main(String[] args) {
		
		// static is constant or fixed.
		// static can be used as variable,method ,block
		// memory management, directly bound to class
		
		
		
		StaticKeywordDemo2(String fname, String lname, String inName)
		{
			firstname=fname;
			surname=lname;
			instituteName=inName;
		}
		
		
		public void display() {
			System.out.println(firstname+ " " +surname+" " +instituteName);
			
		}
		
		public static void main(String[] args) {
			StaticKeywordDemo2 obj=new StaticKeywordDemo2("Mayur", "Boche","EducationSoln") ;
			StaticKeywordDemo2 obj1=new StaticKeywordDemo2("Vijay", "Salunkhe","EducationSoln") ;
			StaticKeywordDemo2 obj2=new StaticKeywordDemo2("Jyoti", "Sabarad","EducationSoln") ;
			StaticKeywordDemo2 obj3=new StaticKeywordDemo2("Dipali", "Adhav","EducationSoln") ;
			
			obj.display();
			obj1.display();
			obj2.display();
			obj3.display();
		
		
		
		
		//System.out.println(name1);   // static variable  // doesn't need to create object
		
		//StaticKeywordDemo1 obj=new StaticKeywordDemo1();  // need to create object
		//System.out.println(obj.name);   // non-static variable i.e. instance variable
		
	}

}




   

