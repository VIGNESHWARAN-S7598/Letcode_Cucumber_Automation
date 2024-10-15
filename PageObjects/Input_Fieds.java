package PageObjects;

import Utilities.DriverUtilities;
import Utilities.InputFieldUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utilities.InputFieldUtilities.*;

public class Input_Fieds extends DriverUtilities {
@FindBy(id ="fullName")
    public static WebElement fullNameField;
@FindBy(id="join")
    public static WebElement appendTextField;
@FindBy(id="getMe")
    public static WebElement findTextField;
@FindBy(id="clearMe")
    public static WebElement clearTextField;
@FindBy(id="noEdit")
    public static WebElement disabledTextField;
@FindBy(id="dontwrite")
    public static WebElement readOnlyTextField;



}
