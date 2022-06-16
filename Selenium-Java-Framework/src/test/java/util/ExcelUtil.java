package util;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelUtil {
	
	private static XSSFWorkbook wb=null;
	private static XSSFSheet sheet=null;
	
	public ExcelUtil(String excelpath,String sheetname)
	{
		
		try {
			
			wb=new XSSFWorkbook(excelpath);
			sheet=wb.getSheet(sheetname);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		getRowCount();
		getcellDataString(0,0);	
		getcellDataNumber(1,1);
		
	}
	
	public static int getRowCount()
	{
		int rowcount=0;
		try {
			rowcount= sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+rowcount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;
	}
	
	public static int getColCount()
	{int colcount=0;
	
		try {
			colcount= sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of col: "+colcount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;
	}
	
	public static String getcellDataString(int rownum,int col)
	{String celldata=null;
		try {
		
			celldata=sheet.getRow(rownum).getCell(col).getStringCellValue();
			//System.out.println(celldata);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return celldata;
	}
	public static void getcellDataNumber(int rownum,int col)
	{
		try {
			
			double celldata=sheet.getRow(rownum).getCell(col).getNumericCellValue();
		//	System.out.println(celldata);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
