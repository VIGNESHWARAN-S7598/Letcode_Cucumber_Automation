package Hooks;

import Utilities.ExcelUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;


public class Hook {
     List<Row> row;
    @Before("@FormEdit")

    public void userReadTheExcelData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\svign\\IdeaProjects\\Cucumber_Automation\\src\\main\\resources\\LetCode_Form_TestData.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sheet1"); // Get the desired sheet
        int count=1;
        ExcelUtilities.setSheetAndRow(sheet, "Sheet1", "Key");

    }

    @After
    public void print() {
        System.out.println("Execution is completed");
    }
}
