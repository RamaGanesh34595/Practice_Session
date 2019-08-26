package xlsReader;

import Xls_Reader.Xls_Reader;

public class readFromExcel {

	public static void main(String[] args) {
		Xls_Reader xlr = new Xls_Reader("E:\\Selenium Automation\\WorkSpace\\Sample_Test1\\testData\\Testdata.xlsx");
		String str = xlr.getCellData("sheet1", 0, 0);
		System.out.println("Value is - " + str);

	}

}
