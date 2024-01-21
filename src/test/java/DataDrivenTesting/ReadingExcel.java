package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File--->Workbook-->Sheets--->Rows--->Cells

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Eclipse Artifacts\\selenium.com\\testdata\\Book (1).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); //workbook.sheetAt(0);
	
		//To find number of rows
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(0).getLastCellNum();
	
		System.out.println("Number of rows :" + totalrows);
		System.out.println("Number of cells :" + totalcells);
		System.out.println();
		
		for(int r=0;r<=totalrows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++) {
				String value = currentRow.getCell(c).toString();
				System.out.println(value +"   ");
					
			}
			System.out.println();
			
		}
		
		workbook.close();
		file.close();

	}

}
