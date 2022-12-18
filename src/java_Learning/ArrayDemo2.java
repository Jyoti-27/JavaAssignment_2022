package java_Learning;

public class ArrayDemo2 {

		
		
		// DataTypes VariableName[]={" "," "," "};
		String nameArray[]= {"Aditya","Swati","Deepali","Jyoti","Divya","Mayur","Rajaram"};// Declaration + initialization
		
		String [] nameArray1 =new String[5];  // Declaration + memory allocation
		
		int [] numbers= {1,2,3,4,5,6};
		
		char [] alphabates= {'A','B','C','D'};
		
		public static void main(String[] args) {
			
			// first way to declare array
			// Array declaration using name and size
			
			int [] numbers=new int[5];  // Declaration + initialization
			numbers[0]=1;
			numbers[1]=2;
			numbers[2]=3;
			numbers[3]=4;
			numbers[4]=5;
			
			System.out.println(numbers[3]);
		
			
			// second way to declare array
		String nameArray[]= {"Aditya","Swati","Deepali","Jyoti","Divya","Mayur","Rajaram"};  // Declaration + initialization
		
			System.out.println(nameArray.length);	
			
			// Iterating Arrays
			
			// Using Advance for loop
			for(String s : nameArray) {
				System.out.println(s);
				
			}
			
			// Using Simple for loop
			for(int i=0;i<nameArray.length;i++) {
				System.out.println(nameArray[i]);
				
			}
			
		

	}

}


