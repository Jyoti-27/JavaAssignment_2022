

/* Program_12
 * Find duplicate elements in an array({"abc","def",mno","xyz","pqr","xyz","def"}   */




package javaProgram_Assignment6;

public class Find_Duplicate_In_Array {

	public static void main(String[] args) {
		

    	String[] Array = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};

    		for (int i = 0; i < Array.length-1; i++)
   			 {
        		for (int j = i+1; j < Array.length; j++)
        		{
            		if( (Array[i].equals(Array[j])) && (i != j) )
            			{
                System.out.println("Duplicate Element : "+Array[j]);
	            }
	         }
	      }
		

	}

}

