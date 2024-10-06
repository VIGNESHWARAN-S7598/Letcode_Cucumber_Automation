package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static Utilities.WaitUtilities.*;

import java.io.IOException;

public class ActionUtilities extends DriverUtilities {
    public static void clickAndHoldElement(WebElement el) throws IOException, InterruptedException {
        waitPageFor(2000);
        Actions a=new Actions(driver());
        a.clickAndHold(el).build().perform();
    }
}
