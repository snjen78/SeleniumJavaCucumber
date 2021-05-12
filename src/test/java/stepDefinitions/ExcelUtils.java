package stepDefinitions;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelUtils {

    @Test
    public void getRows(){

        try {
            XSSFWorkbook workbook = new XSSFWorkbook("Test Data/UserCreds.xlsx");
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            System.out.println("Number of Rows:  "+sheet.getPhysicalNumberOfRows());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getData(){

        try {
            XSSFWorkbook workbook = new XSSFWorkbook("Test Data/UserCreds.xlsx");
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            String cellData= sheet.getRow(0).getCell(0).getStringCellValue();

            System.out.println("Data:  "+cellData);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
