package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		ReadWriteExcel rw = new ReadWriteExcel();
		rw.readExcelFile();

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

	public void readExcelFile() throws IOException {
		File file = new File("./src/filehandling/DummyData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");

		// XSSFRow row= sh.getRow(1);
		String data = sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);

		int cellnum = sh.getRow(0).getPhysicalNumberOfCells();
		int cell2 = sh.getRow(0).getLastCellNum();

		System.out.println(cellnum + "\n" + cell2);

		// reading data from column
		for (int i = 0; i <= cell2; i++) {
			try {
				String data1 = sh.getRow(1).getCell(i).getStringCellValue();
				System.out.print(data1 + " ");
			} catch (Exception e) {

			}
		}

		System.out.println();
		System.out.println("===============");
		// reading coulmn data
		int rownum = sh.getLastRowNum();

		for (int i = 1; i <= rownum; i++) {
			String data1 = sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println(data1);
		}

		// reading complete table
		System.out.println("================");
		Object data2 = null;
		for (int i = 0; i <= rownum; i++) {
			for (int j = 0; j <= cell2-1; j++) {
				CellType type = sh.getRow(i).getCell(j).getCellType();
				if (type == CellType.STRING) {
					data2 = sh.getRow(i).getCell(j).getStringCellValue();
				} else if (type == CellType.NUMERIC) {
					data2 =(int) sh.getRow(i).getCell(j).getNumericCellValue();
				}

				System.out.print(data2.toString() + " ");
			}

			System.out.println();

		}

	}

}
