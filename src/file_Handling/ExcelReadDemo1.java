package file_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo1 {

	static String homepath = System.getProperty("user.dir");
	static File file = new File(homepath + "\\resource\\Data1.xlsx");

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(file); // inputstream excel file
			XSSFWorkbook workbook = new XSSFWorkbook(fis); // get hold of excelfile
			XSSFSheet sheet = workbook.getSheet("sheet1"); // get hold of Sheet

			// getting values by passing index
			XSSFRow rowf = sheet.getRow(0); // get hold of row
			XSSFCell cellf = rowf.getCell(0); // get hold cell from that row
			System.out.println(cellf.getStringCellValue()); // get value
			XSSFCell cell1 = rowf.getCell(1);
			System.out.println(cell1.getStringCellValue());
			XSSFCell cell2 = rowf.getCell(2);
			System.out.println(cell2.getStringCellValue());

			// getting values for all rows and columns

			int rowcount = sheet.getPhysicalNumberOfRows(); // get no. of rows
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells(); //// get no. of columns

			System.out.println("rowcount is -" + rowcount);
			System.out.println("Col is -" + cellCount);

			Iterator<Row> rows = sheet.rowIterator(); // sheet is collection of rows . get access of all rows
			while (rows.hasNext()) {
				Row row = rows.next(); // access to row

				//conditional data read
				Cell cel = row.getCell(0);
				String firstCellValue = cel.getStringCellValue();
				if (firstCellValue.equals("2")) {

					Iterator<Cell> cells = row.cellIterator(); // Row is collection of cells , get access of all columns

					while (cells.hasNext()) {
						Cell cell = cells.next();

						if (cell.getCellType() == CellType.NUMERIC) {
							int k = (int) cell.getNumericCellValue();
							System.out.println(k);

						} else if (cell.getCellType() == CellType.STRING) {
							System.out.println(cell.getStringCellValue());
						} else if (cell.getCellType() == CellType.BOOLEAN) {
							System.out.println(cell.getBooleanCellValue());

						}

					}
				}

				workbook.close();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
