package file_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {
	static String homepath=System.getProperty("user.dir");
	static File file = new File(homepath+"\\resource\\Data.xlsx");

	public static void main(String[] args)  {
		ArrayList<String>  data1=new  ArrayList<>();
		data1.add("Sachin");
		data1.add("24");
		data1.add("Automation tester");
		
		
		
		try  { 
			FileOutputStream out=new FileOutputStream(file);  // OutputStream 
			XSSFWorkbook workbook = new XSSFWorkbook();  // get hold of excel workbook
			XSSFSheet sheet=workbook.createSheet();     //  create sheet
			XSSFRow rows=sheet.createRow(0) ;          //  create row
			XSSFCell cell1=rows.createCell(0);        //   create cells in selected row
			cell1.setCellValue("Name");           
			XSSFCell cell2=rows.createCell(1); 
			cell2.setCellValue("Age"); 
			XSSFCell cell3=rows.createCell(2);
			cell3.setCellValue("Role"); 
			
		
			
			for (int i=1;i<=1;i++)   {
				XSSFRow row=sheet.createRow(i);
				for (int j=0; j<3;j++)   {
					XSSFCell cells=row.createCell(j);
					//double random=Math.random();
					cells.setCellValue(data1.get(j));
				}
			}
			
			workbook.write(out);
			workbook.close();
			
			System.out.println("Excel file has been created successfully");
			
		
		}   catch (IOException e) {
			e.printStackTrace(); 
		}

	}

}
