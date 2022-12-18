package java_Learning;

public class ArraysDemo {

	
		// Array is a collection of same data type
		String name= "Aditya";
		String name1= "Swati";
		String name2= "Deepali";
		String name3= "Jyoti";
		String name4= "Divya";
		String name5= "Mayur";
		String name6= "Rajaram";
		
		// DataTypes VariableName[]={" "," "," "};
		String nameArray[]= {"Aditya","Swati","Deepali","Jyoti","Divya","Mayur","Rajaram"};// Declaration + initialization
		
		String [] nameArray1 =new String[5];  // Declaration + memory allocation
		
		int [] numbers= {1,2,3,4,5,6};
		
		char [] alphabates= {'A','B','C','D'};
		
		public static void main(String[] args) {
			
			// first way to declare array
			String [] nameArray1 =new String[7];
			nameArray1[0]="Aditya";
			nameArray1[1]="Swati";
			nameArray1[6]="Rajaram";
			System.out.println(nameArray1[6]);
		
			
			// second way to declare array
		String nameArray[]= {"Aditya","Swati","Deepali","Jyoti","Divya","Mayur","Rajaram"};// Declaration + initialization
			System.out.println(nameArray[9]);	
			
		

	}

}

