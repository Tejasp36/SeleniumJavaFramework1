package util;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		ExcelUtil excel=new ExcelUtil(projectpath+"/excel/Demo.xlsx","sheet1");
		
		ExcelUtil.getRowCount();
		ExcelUtil.getColCount();
		ExcelUtil.getcellDataString(0,0);
		ExcelUtil.getcellDataNumber(1,1);
		
	}
}
