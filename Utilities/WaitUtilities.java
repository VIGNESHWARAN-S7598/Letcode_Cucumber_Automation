package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static Utilities.DriverUtilities.driver;

public class WaitUtilities  {
    public static  void waitPageFor(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }
    public static  void explicitWait(WebElement el) throws InterruptedException, IOException {
        WebDriverWait wait=new WebDriverWait(driver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

}
