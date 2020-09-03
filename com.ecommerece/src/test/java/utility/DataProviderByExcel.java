package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderByExcel {
	XSSFWorkbook wb;
	public DataProviderByExcel() throws IOException {
		try {
		File src=new File("./TestData/Data.xlsx");
		
		FileInputStream fs=new FileInputStream(src);
		System.out.println("File found");
		 wb=new XSSFWorkbook(fs);
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		
	}
	
	public String getStringdata(String sheetName,int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}

	public double getNumericdata(String sheetName,int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		
	}
}
