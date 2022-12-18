package file_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReadDemo {
	static String homepath=System.getProperty("user.dir");
	static File file = new File(homepath+"\\resource\\Data2.xlsx");


	public static void main(String[] args) {
		try  {
			FileInputStream fis=new FileInputStream (file) ;    // input stream excel file
			XSSFWorkbook workbook=new XSSFWorkbook(fis) ;       // get hold of excel file
			XSSFSheet sheet=workbook.getSheet("sheet1");        // get hold of sheet
			
			
			// getting values by passing index
			XSSFRow rowf=sheet.getRow(0);      // get hold of row
			XSSFCell cellf=rowf.getCell(0);    //  get hold cell from that row
			System.out.println(cellf.getStringCellValue());   // get value
			XSSFCell cell1=rowf.getCell(1);    //  get hold cell from that row
			System.out.println(cellf.getStringCellValue());   // get value
			XSSFCell cell2=rowf.getCell(2);    //  get hold cell from that row
			System.out.println(cellf.getStringCellValue());   // get value
			
			
			
			
			// getting values for all rows and columns
			
			int rowCount = sheet.getPhysicalNumberOfRows();   // get no. of rows
			
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();    // get no. of cells
			
			
			System.out.println("rowcount is-"+rowCount);
			System.out.println("cellcount is-"+cellCount);
			
			
			Iterator<Row>  rows = sheet.rowIterator();   // sheet is collection of rows, get access of all rows
			while(rows.hasNext())   {
				Row row=rows.next();
				Iterator<Cell> cells = row.cellIterator();   // row is collection of cells, get access of all cells 
				
				while(cells.hasNext())   {
				Cell cell=cells.next();
				
				if (cell.getCellType() ==  CellType.NUMERIC)   {
					if (cell.getColumnIndex()==3)  {
						DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date date=cell.getDateCellValue();
						System.out.println(df.format(date));
						break;
					}
					int k=(int) cell.getNumericCellValue();
					System.out.println(k);
					
				}  else if ( cell.getCellType() == CellType.STRING )   {
				System.out.println(cell.getStringCellValue());
			     } else if (cell.getCellType() == CellType.BOOLEAN ) {
				System.out.println(cell.getBooleanCellValue());  
				
			 }
			
		  }
			
			workbook.close();
		}
		
			
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
   }  catch (IOException e) {
		e.printStackTrace();
  }

 }
}
