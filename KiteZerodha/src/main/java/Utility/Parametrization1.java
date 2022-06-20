package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization1 {
public static String getData(int row,int cell) throws IOException {
	FileInputStream file =new FileInputStream ("F:\\selenium123\\KiteZerodha\\src\\test\\resources\\Book21.xlsx");
	String value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	return value;
		
}
}
