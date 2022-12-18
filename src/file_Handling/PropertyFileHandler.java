package file_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyFileHandler  {
	
	static String homepath=System.getProperty("user.dir");
	static File file = new File(homepath+"\\resource\\myfile.properties");
	//static File file = new File("C:/Users/Chandana/eclipse-workspace/Selenium_2022/src/resource/myfile.properties");
	static Properties prop=new Properties();
	public static void main(String[] args) throws IOException  {
		System.out.println(homepath);
		writeInToPropertiesFile();
		readPropertiesFile();
	}
	
	public static void readPropertiesFile() throws IOException {
		
	
		//	File file=new File("C:/Users/Chandana/eclipse-workspace/Selenium_2022/src/resource/myfile.properties");
			File file=new File(homepath+"\\resource\\myfile.properties");
			FileInputStream inputStream=new FileInputStream(file) ;
		    // Properties prop=new Properties();
		    prop.load(inputStream);
		    System.out.println(prop.getProperty("Role"));
		    System.out.println(prop.getProperty("Environment"));
		    
		    
		    // to read all data
		    Set<String> keys=prop.stringPropertyNames();
		    for (String s: keys)   {
		    	 System.out.println("Key is-" + s + "Value is-" + prop.getProperty(s));
		   
                }
		    inputStream.close();
                 
             }



public static void writeInToPropertiesFile() {
	
		// Write data into properties file
		FileOutputStream outStream=null;
		try {
			//File file=new File("C:/Users/Chandana/eclipse-workspace/Selenium_2022/src/resource/myfile.properties");
			File file=new File(homepath+"\\resource\\myfile.properties");
			outStream=new FileOutputStream(file);
		    Properties prop=new Properties();
		    prop.setProperty("Environment", "Test");
		    prop.setProperty("Name", "Sachin");
		    prop.setProperty("Role", "AutomationTesting");
		    prop.setProperty("Experience", "4 Years");
		    prop.store(outStream, "demo");
		} catch(FileNotFoundException e)  {
			e.printStackTrace();
		} catch(IOException e)  {
			e.printStackTrace();
			
		}
		finally {
			try {
			outStream.close();
			System.out.println("Outstream is closed");
			}  catch(IOException e)  {
				e.printStackTrace();
			}
		
		}

	}

}