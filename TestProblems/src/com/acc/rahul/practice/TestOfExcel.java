package com.acc.rahul.practice;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class TestOfExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	try {
	
		File f = new File("C:\\Users\\RAHUL\\Desktop\\New Microsoft Office Excel Worksheet.xls");
		FileInputStream is = new FileInputStream(f);
		byte[] b = new byte[(int) f.length()];
		is.read(b);
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		//From here onwards.
			Workbook workBook = Workbook.getWorkbook(bis);
			WritableWorkbook myWorkBook = Workbook.createWorkbook(new File("C:\\Users\\RAHUL\\Desktop\\New Microsoft Office Excel Workst.xls"), workBook);	
		WritableSheet sheet = myWorkBook.getSheet(0);
		sheet.insertColumn(4);
		sheet.insertColumn(5);
		Cell[] row = sheet.getRow(0);
		
		myWorkBook.write();
		myWorkBook.close();
		
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//WritableWorkbook myWorkBook = Workbook.createWorkbook(new File("C:\\Users\\RAHUL\\Desktop\\New Microsoft Office Excel Worksheet.xls"));
		
	
	
	  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (WriteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	

} 
