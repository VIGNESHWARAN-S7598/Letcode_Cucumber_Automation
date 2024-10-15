package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverUtilities {
   static WebDriver driver;
   /*static String driverName="chrome";*/

   public static WebDriver driver() throws IOException {
        FileInputStream fi=new FileInputStream("C:\\Users\\svign\\IdeaProjects\\Cucumber_Automation\\src\\main\\resources\\Properties\\Config.properties");
        Properties p=new Properties();
        p.load(fi);
        if (driver == null){
            System.setProperty("webdriver.chrome.driver",p.getProperty("chromeDriver_Path"));
            driver=new ChromeDriver();
            }


       return driver;

    }
    public static String getPageName() throws IOException{
       String pageName=driver().getTitle();
       return pageName;
    }
    public static void openWebPage(String page) throws IOException {
       if(page.equalsIgnoreCase("HomePage")){
           driver().get("https://letcode.in/test");
       }
        if(page.equalsIgnoreCase("ButtonsPage")){
            driver().get("https://letcode.in/buttons");
        }
        if(page.equalsIgnoreCase("FormPage")){
            driver().get("https://letcode.in/forms");
        }
        if(page.equalsIgnoreCase("Inputpage")){
            driver().get("https://letcode.in/edit");
        }
    }


}
