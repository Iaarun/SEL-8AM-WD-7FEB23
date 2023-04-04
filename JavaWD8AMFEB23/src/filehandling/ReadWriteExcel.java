package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
                 ReadWriteExcel rw = new ReadWriteExcel();
                 rw.writeexcel();
                 
	}

	public void writeexcel() throws IOException {
		File file = new File("./src/filehandling/DummyData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.createSheet("dummyData");
		XSSFRow row = sh.createRow(1);
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("TestData");
		sh.createRow(2).createCell(2).setCellValue("TestData2");
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		
		fout.close();
		wb.close();
		System.out.println("Data writing successful");
	}

}
