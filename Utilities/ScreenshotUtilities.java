package Utilities;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static Utilities.DriverUtilities.*;
import static org.apache.poi.xwpf.usermodel.Document.PICTURE_TYPE_PNG;

public class ScreenshotUtilities {
    public static File firstNameScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_FirstName.png");
    public static File lastNameScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_lastName.png");
    public static File emailScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_Email.png");
    public static File CountryCodeScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Selected_CountryCode.png");
    public static File phoneNumberScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_Phone_no.png");
    public static File addressScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_Address.png");
    public static File CountryScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Selected_Country.png");
    public static File dobScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_DOB.png");
    public static File genderScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Selected_Gender.png");
    public static File termsandConditionsScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Accepted terms_and_conditions.png");
    public static File submitScreenshotFilePath= new File("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Submitted the form.png");
    public static void takeScreenshots(File filepath) throws AWTException, IOException {
        Robot robot=new Robot();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rec=new Rectangle(d);
        BufferedImage bi=robot.createScreenCapture(rec);
        ImageIO.write(bi,"png",filepath);
    }
    public static void word() throws IOException, InvalidFormatException {
        FileInputStream fi=new FileInputStream("D://Cucumber_LetCode_Automation//Execution_Reports//LetCode_Automation_Report.docx");
        XWPFDocument document=new XWPFDocument();
        XWPFParagraph paragraph=document.createParagraph();
        XWPFRun run=paragraph.createRun();
        FileInputStream fis=new FileInputStream("D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_FirstName.png");
        run.setText("Hi ");
        run.addPicture(fis,PICTURE_TYPE_PNG,"D:/Cucumber_LetCode_Automation/ScreenShots/Forms/Entered_FirstName.png",500,300);

        fis.close();
        FileOutputStream fos=new FileOutputStream("D://Cucumber_LetCode_Automation//Execution_Reports//LetCode_Automation_Report.docx");
        document.write(fos);
        fos.close();
        document.close();
    }
}
