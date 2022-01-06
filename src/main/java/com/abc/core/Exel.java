package com.abc.core;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exel {
	XSSFWorkbook workbook = null;
	
	public Exel (String fileName) throws InvalidFormatException, IOException {
	
	File file= new File(System.getProperty("user.dir")+"/src/test/resources/data/"+fileName+".xlsx");
	
	
		workbook = new XSSFWorkbook(file);
	}
	
	public String [][] getDataFordataProvider (String sheetName) throws InvalidFormatException, IOException{
		Sheet sheet=workbook.getSheet(sheetName);
	
	
	
		int numOfRow = sheet.getLastRowNum()+1;
		int numOfCol = sheet.getRow(0).getLastCellNum();
		
		String data[][] = new String [numOfRow][numOfCol];
		
		for (int i=0; i<numOfRow; i++) {
			for (int f=0; f<numOfCol; f++) {
				try {
					data[i][f] = sheet.getRow(i+1).getCell(f).getStringCellValue();//added 1 with with index 'i' so it collects data from 2nd row.
				}catch (Throwable e){
					data[i][f]="";			
				}
			}
		
		}
		return data;
	
	}
	
}
