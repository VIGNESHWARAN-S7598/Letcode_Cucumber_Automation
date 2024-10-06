package PageObjects;

import Utilities.DriverUtilities;
import Utilities.ExcelUtilities;
import Utilities.ExtentReportUtilties;
import Utilities.SeleniumUtilities;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utilities.ButtonUtilities.*;
import static Utilities.ActionUtilities.*;

import java.io.FileInputStream;
import java.io.IOException;

import static Utilities.ColorUtilities.getColor;
import static Utilities.SeleniumUtilities.*;
import static Utilities.WaitUtilities.waitPageFor;
import static Utilities.ExtentReportUtilties.*;


public class Buttons extends DriverUtilities {
    @FindBy(linkText = "Click")
    public static WebElement buttonsPageLink;
    @FindBy(id ="home")
    public static WebElement homeButton;
    @FindBy(id="position")
    public static WebElement XandYCoordinatesButton;
    @FindBy(xpath = "//button[@id='color']")
    public static WebElement colorButton;
    @FindBy(xpath = "//button[@id='property']")
    public static WebElement sizeButton;
    @FindBy(xpath = "//button[@id='isDisabled']")
    public static WebElement disabledButton;
    @FindBy(xpath = "//h2[text()='Button Hold!']")
    public static WebElement buttonHold;

    public void openingbuttonsPageLink() throws IOException, InterruptedException {
        PageFactory.initElements(driver(),this);
        report_pageName="buttons";
        createTest("Verifying the buttons page");

        }
    public void clickingHomeButton() throws InterruptedException, IOException {
        openWebPage("ButtonsPage");
        waitPageFor(4000);
        SeleniumUtilities.click(homeButton);
    }
    public void gettingXandYCoordinatesButton() throws InterruptedException, IOException {
        PageFactory.initElements(driver(),this);
        openWebPage("buttonspage");
        getLocationofElement(XandYCoordinatesButton);
    }
    public void gettingColorOfButton() throws InterruptedException, IOException, ExceptionInInitializerError {
        PageFactory.initElements(driver(),this);
        /*
        Workbook book= book = new XSSFWorkbook(fi);
        Sheet sheet=book.getSheetAt(0);*/
        openWebPage("buttonspage");
        getColor(colorButton);


    }
    public void gettingsizeOfButton() throws InterruptedException, IOException {
        PageFactory.initElements(driver(),this);
        getSizeOfElement(sizeButton);
    }
    public void checkingAvailabilityofButton() throws InterruptedException, IOException {
        PageFactory.initElements(driver(),this);
        checkAvailabilityOf(disabledButton);
    }
    public void clickingAndHoldingButton() throws InterruptedException, IOException {
        PageFactory.initElements(driver(),this);
        clickAndHoldElement(buttonHold);

    }
}
