package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xls");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		
		// creating rows,cells and update without loop
		/* XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("123");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Pavan");
		row2.createCell(1).setCellValue("1981"); */
		
		Scanner sc = new Scanner(System.in);
		
		// creating rows,cells and update using for loop
		for(int r=0;r<=3;r++) {
			XSSFRow currentrow = sheet.createRow(r);
			
			for(int c=0;c<2;c++) {
				
				System.out.println("Enter a value");
				String value = sc.next();
				currentrow.createCell(c).setCellValue(value);
				
			}
			
			
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Successfully Done");
	}

}
