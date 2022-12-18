package file_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLFileHandle {
	static String homepath=System.getProperty("user.dir");
	static File file = new File(homepath+"\\resource\\Test.html");

	public static void main(String[] args) {
		writeHTMLFile();
		ReadHTMLFile();

	}
	
	public static void writeHTMLFile()   {
		try  {
			FileWriter fwriter=new FileWriter(file);
			BufferedWriter writer=new BufferedWriter(fwriter);
			writer.write("<!DOCTYPE html> <html> <body><h1>My First Heading</h1> <h2>This is heading 2</h2><p>My first paragraph.</p></body></html>");
			writer.close();
			System.out.println("HTML has been created");
		}  catch  (IOException e)  {
			System.out.println("Exception has been caught"+ e.getMessage());
		}
	  }
	  
	
	public static void ReadHTMLFile()   {
		String line=null;
		
		try  {
			
			FileReader fReader=new FileReader(file);
			BufferedReader reader=new BufferedReader(fReader);
			
			// System.out.println(reader.readLine());
			
			while ((line = reader.readLine()) != null)  {
				System.out.println(line);
			}
			reader.close();
		}  catch (FileNotFoundException e)  {
			e.printStackTrace();
			
		}  catch (IOException e) {
			e.printStackTrace();
	}
		
		
  }

}