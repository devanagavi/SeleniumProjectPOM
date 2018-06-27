package genericAction;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	
	String path = "./TestData/ReadWriteData.xlsx";
	String testData;
	
	public String readExcelData(int sheetNo, int rowNo, int cellNo) {
		
	try {
	FileInputStream fis = new FileInputStream(path);
	//To Read the File
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = (Sheet) wb.getSheetAt(sheetNo);
	Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowNo);
	//String username = row.getCell(0).getStringCellValue();
	//String password = row.getCell(1).getStringCellValue();
	testData = row.getCell(cellNo).getStringCellValue();
	}
	catch(Exception e) {
		
		System.out.println("Error while reading file"  +e.getMessage());
	}
	return testData;
}

}
