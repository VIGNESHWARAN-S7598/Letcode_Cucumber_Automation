package Utilities;

import org.openqa.selenium.WebElement;

import java.io.IOException;


public class InputFieldUtilities extends DriverUtilities {
    public static void enterText(WebElement we,String word) throws IOException {
        we.sendKeys(word);
    }
    public static void clearText(WebElement we) throws IOException {
        we.clear();
    }
    public static void getText(WebElement we) throws IOException {
        we.getText();

    }
}
