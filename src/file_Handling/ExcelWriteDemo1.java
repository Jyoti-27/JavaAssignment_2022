package file_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo1 {
	static String homepath = System.getProperty("user.dir");
	static File file = new File(homepath + "\\resource\\Data.xlsx");
	static File file1 = new File(homepath + "\\resource\\Data_multiple.xlsx");

	public static void main(String[] args) {

				
		ArrayList<String> data1=new ArrayList<>();
		data1.add("Sachin");
		data1.add("24");
		data1.add("Autoamtion tester");

		
		try {
			FileOutputStream out=new FileOutputStream(file); //outputstream to create excelfile
			XSSFWorkbook workbook=new XSSFWorkbook();    //get hold of excel/workbook
			XSSFSheet sheet=workbook.createSheet();   // create sheet 
			
			//for row 0
			XSSFRow rows=sheet.createRow(0); 		//create row
			XSSFCell cell1=rows.createCell(0);      //create cells in selected row			
			cell1.setCellValue("Name");   
			XSSFCell cell2=rows.createCell(1); 
			cell2.setCellValue("Age");
			XSSFCell cell3=rows.createCell(2); 
			cell3.setCellValue("Role");	
		
			//for row 1
			
			XSSFRow rows1=sheet.createRow(1); 		   //create row
			XSSFCell cell1_1=rows1.createCell(0);      //create cells in selected row			
			cell1_1.setCellValue("Sachin");   
			XSSFCell cell1_2=rows1.createCell(1); 
			cell1_2.setCellValue("21");
			XSSFCell cell1_3=rows1.createCell(2); 
			cell1_3.setCellValue("Autoamtion Tester");	
		
		
			
			workbook.write(out);
			workbook.close();			
			System.out.println("Excel file has been created sucessfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		  Map<Integer, String[]> students = new HashMap<Integer, String[]>();
		  String [] arr1= {"Name","Age","Role"};
		  try {
			FileOutputStream out=new FileOutputStream(file1);
			XSSFWorkbook workbook=new XSSFWorkbook();    //get hold of  excel/workbook
			XSSFSheet sheet=workbook.createSheet(); 
			students.put(1, arr1);
			students.put(2, new String[] {"Sachin","24","Automation Tester"});
			students.put(3, new String[] {"Rahul","28","Sr. Automation Tester"});
			students.put(4, new String[] {"Rohit","30","Test Lead"});
			students.put(5, new String[] {"Harshal","35","Test Manager"});
			
			Set<Integer> keyID=students.keySet();
			
			for (int key:keyID) {
				XSSFRow row=sheet.createRow(key-1); 
				String arr[]=students.get(key);
				for(int j=0;j<arr.length;j++) {
					XSSFCell cells=row.createCell(j);				
					cells.setCellValue(arr[j]);
					
				}
				
			}
			workbook.write(out);
			workbook.close();		
			
		System.out.println("Multiple data excel file has been created sucessfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
