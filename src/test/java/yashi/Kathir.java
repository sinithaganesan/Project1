package yashi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Kathir {
	
	public static void main(String[] args) throws IOException {
		File ref= new File("C:\\Users\\acer\\eclipse-workspace\\yashi\\dATA\\datadriven - Copy.xlsx");
		FileInputStream file=new FileInputStream(ref);
		Workbook book=new XSSFWorkbook(file);
		
		System.out.println("Book : " + book);

		Sheet datadriven = book.getSheet("datadriven");
		System.out.println("Sheet : " + datadriven);

		Row row = datadriven.getRow(0);
		System.out.println("Row : " + row);

		Cell cell = row.getCell(3);
		System.out.println("Cell : " + cell);
		
		
		
		
	}
}
