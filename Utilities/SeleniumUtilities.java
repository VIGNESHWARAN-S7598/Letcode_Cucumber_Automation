package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SeleniumUtilities extends DriverUtilities{
    public static void click(WebElement el){
        el.click();
    }
    public static void getPageTitle() throws IOException {
        String title=driver().getTitle();
        System.out.println("Dirver is on the page: "+title);
    }
    public static void maximizePage() throws IOException {
       driver().manage().window().maximize();
    }
    public static void closePage() throws IOException {
        driver().close();
    }
    public static void navigateToLastPage() throws IOException {
        driver().navigate().back();

    }
    public static void getLocationofElement(WebElement el){
        int x=  el.getLocation().getX();
        int y= el.getLocation().getY();
        System.out.println("X coordinate: "+x);
        System.out.println("y coordinate: "+y);
    }
    public static void getSizeOfElement(WebElement el) throws IOException {
        openWebPage("ButtonsPage");
        int height=  el.getSize().getHeight();
        int width= el.getSize().getWidth();
        System.out.println("height of an element: "+height);
        System.out.println("width of an element: "+width);
    }
    public static void enterText(String text,WebElement el){
        el.sendKeys(text);
    }
    public static void checkAvailabilityOf(WebElement el){
        boolean availability=el.isEnabled();
        String output;
        if(availability){

            System.out.println(el.getTagName()+" is Enabled");
        }
        else {
            System.out.println(el.getTagName()+" is disabled");
        }
    }
    public static void scrollPage() throws IOException {
        JavascriptExecutor js=(JavascriptExecutor) driver();
        js.executeScript("window.scrollBy(0,2000)");
    }
    public static String getTextFromElement(WebDriver driver,WebElement el) throws IOException {
        JavascriptExecutor js=(JavascriptExecutor) driver();
       return (String) js.executeScript("return arguments[0].value;",el);
    }
}
