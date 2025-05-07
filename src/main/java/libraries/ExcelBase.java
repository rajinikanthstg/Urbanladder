package libraries;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBase{
	
	public static File f;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int totalRowCount(String FileName,String SheetName) throws Exception
	{
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;		
	}
	
	public static int totalCellsCount(String FileName,String SheetName,int rowNo) throws Exception
	{
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		XSSFRow row = sheet.getRow(rowNo);
		int cellCount = row.getLastCellNum();
		return cellCount;
	}
	
	public static String getCellData(String FileName,String SheetName,int rowNo,int cellNo) throws Exception
	{
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		XSSFRow row = sheet.getRow(rowNo);
		
		return row.getCell(cellNo).getStringCellValue();
	}
}
