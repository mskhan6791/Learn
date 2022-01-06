package com.abc.core;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;



public class Excel2 {

public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File file= new File("C:\\Users\\gmkha\\Desktop\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("A");
			
		int numOfRow = sheet.getLastRowNum()+1;
		int numOfCol = sheet.getRow(0).getLastCellNum();
		
		
		for (int i=1; i<numOfRow; i++) {
			for (int f=0; f<numOfCol; f++) {
				try {
				String s= sheet.getRow(i).getCell(f).getStringCellValue();
				System.out.print(s+" ");
				}catch (Throwable e){
								}
			}
			System.out.println();
		}
	
	}
	
}
