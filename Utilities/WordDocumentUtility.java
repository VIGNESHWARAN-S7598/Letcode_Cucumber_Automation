package Utilities;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static Utilities.ScreenshotUtilities.*;
import static org.apache.poi.xwpf.usermodel.Document.PICTURE_TYPE_PNG;

public class WordDocumentUtility {
    public static void attachScreenshotInWord() throws IOException, InvalidFormatException {
        FileInputStream fi=new FileInputStream("D://Cucumber_LetCode_Automation//Execution_Reports//LetCode_Automation_Report.docx");
        XWPFDocument document=new XWPFDocument();
        XWPFParagraph paragraph=document.createParagraph();
        XWPFRun run=paragraph.createRun();
        FileInputStream fis=new FileInputStream(firstNameScreenshotFilePath.getPath());
        run.addPicture(fis,PICTURE_TYPE_PNG,firstNameScreenshotFilePath.getPath(),500,300);
        fis.close();
        FileOutputStream fos=new FileOutputStream("D://Cucumber_LetCode_Automation//Execution_Reports//LetCode_Automation_Report.docx");
        document.write(fos);
        fos.close();
        document.close();
    }
}
