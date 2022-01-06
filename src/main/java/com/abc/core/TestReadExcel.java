package com.abc.core;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReadExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File file = new File("C:\\Users\\gmkha\\Desktop\\Data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("A");
		
		int numOfRow=sheet.getLastRowNum()+1;
		int numOfCol=sheet.getRow(0).getLastCellNum();
		
		String data [][] = new String [numOfRow][numOfCol];
		
		//String s= sheet.getRow(0).getCell(0).getStringCellValue();
		
//		System.out.println(numOfRow);
//		System.out.println(numOfCol);
		
		//String ss= sheet.getRow(0).getCell(0).getStringCellValue();
		
		for (int i=1; i<numOfRow; i++) {
			for (int j=0; j<numOfCol; j++) {
			String sss= sheet.getRow(i).getCell(j).getStringCellValue();	
			System.out.print(sss+" ");			
			}	
			System.out.println();
		}
	}
}
