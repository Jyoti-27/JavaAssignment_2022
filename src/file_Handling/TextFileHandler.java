package file_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandler {
	static String homepath=System.getProperty("user.dir");
	static File file = new File(homepath+"\\resource\\textFile.txt");
	//static File file = new File("C:/Users/Chandana/eclipse-workspace/Selenium_2022/src/resource/textFile.txt");


	public static void main(String[] args) {
		writerintoTextfile();
		readTextFile();
		
	}
	
	public static void writerintoTextfile() {
		
		try {
			FileWriter fwriter=new FileWriter(file);
			BufferedWriter writer=new BufferedWriter(fwriter);
			writer.write("This is the first line");
			writer.newLine();
			writer.write("This is the second line");
			writer.newLine();
			writer.write("This is the third line");
						
			writer.close();
			fwriter.close();
		}   catch (IOException e)   {
			e.printStackTrace();
			
		}

	}
	
	public static void readTextFile()  {
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

