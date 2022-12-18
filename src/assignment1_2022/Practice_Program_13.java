
// Assignment 7.1

/* Write a program to print the count of an object created for class using Constructor */



package assignment1_2022;

public class Practice_Program_13 {

		    // static varibale to store number of objects
		    static int count = 0;
		    
		    // various types of constructor
		    public Practice_Program_13(){
		        count+=1;
		    }
		    public Practice_Program_13(int i){
		        count+=1;
		    }
		    
		    public static void main(String[] args) {
		    	Practice_Program_13 obj1 = new Practice_Program_13();
		    	Practice_Program_13 obj2 = new Practice_Program_13();
		    	Practice_Program_13 obj3 = new Practice_Program_13();
		        
		    	// display count
		        System.out.println("Number of objects created : " + Practice_Program_13.count);
		    }
	
	}


