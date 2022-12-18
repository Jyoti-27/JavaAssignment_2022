package java_Learning;

public class ArrayDemo3 {

		
		
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
			
			
			// Two Dimensional Array as 2D Array is arrays of array
			
			int [] [] matrix=new int[2][3];
			matrix[0][0]=100;
			matrix[0][1]=200;
			matrix[0][2]=600;
			matrix[1][0]=300;
			matrix[1][1]=400;
			matrix[1][2]=1000;
			
			System.out.println(matrix[0][1]);
			
			for(int row=0;row<matrix.length;row++) {
				for(int col=0;col<matrix[row].length;col++) {
					System.out.println(matrix[row][col]);
					
				}
				
			}
			
			
			
			int [][] numbers2= {{10,20},
					            {30,40},
					            {50,60},
			                   };     // 3*2  // 3-rows and 2-columns
			System.out.println(numbers2.length);
			System.out.println(numbers2[0].length);
			
			
			// For String into character array
			String name="Sachin";  
			char[] ch=name.toCharArray();
			
			
			for(char c:ch) {
				System.out.println(c);
			}
		
			
	}

}


