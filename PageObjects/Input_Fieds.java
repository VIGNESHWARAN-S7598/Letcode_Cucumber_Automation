package PageObjects;

import Utilities.DriverUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

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

public void enterTextInInputField() throws IOException {
    PageFactory.initElements(driver(),this);
    fullNameField.sendKeys("Vigneshwaran S");
    if(fullNameField.getText().equals("Vigneshwaran S")){
        System.out.println("Entered text in an input field");
    }else{
        System.out.println("Text not entered");
    }
}


}
