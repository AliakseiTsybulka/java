package com.syntax.practice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriteDemo {
	
	@Test
	public void writeExcel() throws Exception {
		String xlPath = "src/test/resources/testdata/OrangeHrmData.xlsx";
		FileInputStream fis = new FileInputStream(xlPath);
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		
	}

}
