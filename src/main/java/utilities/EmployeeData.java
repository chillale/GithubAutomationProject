package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeData {
	public String insertData(String sheetName,int rowNum,int cellNum) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./EmployeeData.xlsx");
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value=cell.getStringCellValue();
		return value;
		
	}
	public static Workbook getWorkbook(String path) throws Exception{
		FileInputStream file = new FileInputStream(path);
		return new XSSFWorkbook(file);
		
	}

}
