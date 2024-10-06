package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * This class holds all the EXCEL utilities methods
 */
public class ExcelUtilities {
    private static Sheet sheet;
    private static String sheetKey;
    private static String rowKey;
    static List<Row> row;


    /**
     * This method retrieves sheet and row of a excel
     *
     * @param s    - Excel Sheet key
     * @param sKey - Excel Sheet name or key
     * @param rKey - Excel Row name or key
     */
    public static void setSheetAndRow(Sheet s, String sKey, String rKey) {
        try {
            sheet = s;
            sheetKey = sKey;
            rowKey = rKey;
        } catch (Exception e) {
            Assert.fail("TestFailed: Unable to set sheet and row" + e.getMessage());
        }
    }

    /**
     * This method retrieves the cell value of Excel with COLUMN KEY
     *
     * @param columnKey - Excel column name or key
     * @return
     */
    public static String getCellValue(String columnKey) {
        try {
            int columnIndex = findColumnIndex(sheet, columnKey);
            int rowCount = sheet.getLastRowNum();


            if (columnIndex != -1) {
                int rowIndex = findRowIndex(sheet, rowKey);
                if (rowIndex != -1) {
                    Row row = sheet.getRow(rowIndex);
                    Cell cell = row.getCell(columnIndex);
                    if (cell != null) {
                        return cell.getStringCellValue();
                    }
                    if (cell.getCellType() == CellType.NUMERIC) {
                        return String.valueOf(cell.getStringCellValue());
                    }
                }
            }
        } catch (Exception e) {
            Assert.fail("TestFailed: Unable to retrieve the cell value using column key" + e.getMessage());
        }
        Assert.fail("Given row or column key is not even mentioned in the test data");
        return "";
    }

    /**
     * This method retrieves the row using ROW KEY
     *
     * @param sheet  - Excel Sheet name or key
     * @param rowKey - Excel Row name or Key
     * @return
     */
    private static int findRowIndex(Sheet sheet, String rowKey) {
        try {
            for (Row row : sheet) {
                Cell cell = row.getCell(0); // Assuming row key is in the first column
                if (cell != null && cell.getCellType() == CellType.STRING && cell.getStringCellValue().equals(rowKey)) {
                    return row.getRowNum();
                } else if (cell.getStringCellValue().equals(null)) {
                    Assert.fail("Given row key is not even mentioned in the test data");
                }
            }
            return -1; // Return -1 if row key not found
        } catch (Exception e) {
            Assert.fail("TestFailed: Unable to find the row index" + e.getMessage());
        }
        return 0;
    }

    /**
     * This method retrieves the row using COLUMN KEY
     *
     * @param sheet     - Excel Sheet name or key
     * @param columnKey - Excel Column name or Key
     * @return
     */
    private static int findColumnIndex(Sheet sheet, String columnKey) {
        try {
            Row headerRow = sheet.getRow(0);
            int columnCount = headerRow.getLastCellNum();
            for (int i = 0; i < columnCount; i++) {
                Cell cell = headerRow.getCell(i);
                if (cell != null && cell.getCellType() == CellType.STRING && cell.getStringCellValue().equals(columnKey)) {
                    return i;
                }
            }
            return -1; // Return -1 if column key not found
        } catch (Exception e) {
            Assert.fail("TestFailed: Unable to find the sheet name. " + e.getMessage());
        }
        return 0;
    }

/**-------------------------------------------------------------------------------------------------------------------------------------------------------------------**/
    /**
     * The Following methods are for continously iterating to get data from each rows and enter the data into the website
     */
    public static List<List<String>> readExcelData() throws IOException {
        FileInputStream fi=new FileInputStream("C:/Users/svign/IdeaProjects/Cucumber_Automation/src/main/resources/TestDataForIteration.xlsx");
        Workbook workbook= WorkbookFactory.create(fi);
        sheet=workbook.getSheetAt(0);
        List<List<String>> excelData=new ArrayList<>();
        for(Row row:sheet){
            int rowNum=row.getRowNum();
            List<String> rowData= new ArrayList<>();
            for(Cell cell:row){
                if(cell.getCellType()==CellType.STRING){
                    rowData.add(cell.getStringCellValue());
                }
            }
            excelData.add(rowData);
        }
        return excelData;
    }


}