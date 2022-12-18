package java_Learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
	//static String s; // no any value that is null considered by default there
	
	// Exception-Abnormal and unexpected/ unwanted flow and event scenario which will disrupt the execution of the program
	
	// Exception Handling - Handling the exception to achieve normal flow of program
	     // How to handle exception as following way:
	    //  1. Using "Try catch block"- to handle the exception
	   //   2. "throws"- keyword is used to declare the exception, it can handle many exception 
	   //   3. "throw"- to throw the exception , it can handle only one exception at a time
	  //    4. "Finally" block - will get executed irrespective of exception is occurred or not 
	  //    5. "Finalize"- to clean up the garbage collection and it is used object-class method, just before the object in garbage 
	
	
	

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException{
		exceptionworking();
	}
			
	public static void exceptionworking() throws FileNotFoundException, ClassNotFoundException {
		
	
		
		// Getting error when we run the program  i.e. Runtime exception i.e. Unchecked Exception
		int i=5;
		int k=0;
		try {
		int a=i/k;
		System.out.println(a);
		}
		catch(ArithmeticException ar) {
			System.out.println("Caught Arithmetic Exception" );
		}
		finally {
			System.out.println("Finally block is executed" );
		}
		
		System.out.println("Checked Exception");
		
		
		int x[]=new int[2];  // generates array exception because size is out of limit
		try {
		x[3]=5;
		System.out.println(x);
		} catch(Exception ex)  {
			System.out.println("ArrayIndexOutofBoundException caught");	
		}
		
		
		String s="sid";     // generates string error exception
		try {
		System.out.println(s.charAt(4));
		} catch(IndexOutOfBoundsException ex1)  {
			System.out.println("StringOutofBoundException caught");
		}
		
		
	
		
		// Compile time exception i.e. Checked Exception
		
		try {
		FileInputStream  file=new FileInputStream(new File("test"));   // io exception generates
		}  catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException caught");
		}
		
		
		
		
		
		// try block need to be followed by either catch block or finally
		try {
			int a=i/5;
			System.out.println(a);
		} finally {
			System.out.println("Finally is executed without catching Exception" );
		}
		
		
		
		
		// try-multiple catch
		try {
			int a=i/0;
			String r="temp";
			int b=Integer.valueOf(r);
			System.out.println(a);
		}  catch (ArithmeticException ar)  {
			System.out.println("Caught Arithmetic Exception" );
		}
		
		
		
		
		
		// nested try block
		
		System.out.println("===============================" );
		
		
		try {
			try  {
				int a=i/0;
				System.out.println(a);
			}
			catch(ArithmeticException ar)  {
				System.out.println("Caught Arithmetic Exception" );
				
			}
			try {
				String r="temp";
				int b= Integer.valueOf(r);
			}  catch (NumberFormatException ne)  {
				System.out.println("Caught Number Format Exception");
			}
		}
		
		catch (Exception ex)  {
			System.out.println("Exception catched");
		}
		
		
		
		
		
		
		// throw-to throw exception
		try {
			throw new ArithmeticException ("User thrown exception");
		}
		catch (ArithmeticException ex)  {
			System.out.println("User thrown exception is caught");
		}
		
		
		
		
		// throws- to declare the exception
		
		// File not found exception
		
		FileInputStream file=new FileInputStream(new File("test"));
		
			
		
		
		
		
		// Class not found exception
		
		String Test="team";
		Class.forName(Test);
			
	}
		
		
		
}








