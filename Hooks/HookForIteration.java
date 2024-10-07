
package Hooks;

import Utilities.ExcelUtilities;
import io.cucumber.java.Before;
import org.apache.poi.ss.usermodel.*;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*public class HookForIteration
{
    @Before("@FormIterate")
    public static void writeFormFeature() throws IOException {
        List<List<String>> data= ExcelUtilities.readExcelData();
        FileWriter fw=new FileWriter("C:\\Users\\svign\\IdeaProjects\\Cucumber_Automation\\src\\main\\java\\Features\\Form.feature",true);
        BufferedWriter bw=new BufferedWriter(fw);
        for(List<String> row:data) {
            bw.write("|"+row.get(0)+"|"+row.get(1)+"|"+row.get(2)+"|"+row.get(3)+"|"+row.get(4)+"|"+row.get(5)+"|"+row.get(6)+"|"+row.get(7)+"|"+row.get(8)+"|"+row.get(9)+"|");
        }

        bw.close();
    }

}*/

