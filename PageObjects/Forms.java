package PageObjects;
import Utilities.ExcelUtilities;
import Utilities.ScreenshotUtilities;
import com.aventstack.extentreports.MediaEntityBuilder;
import freemarker.template.utility.DateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.SeleniumUtilities.*;

import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static Utilities.ScreenshotUtilities.*;
import static Utilities.WaitUtilities.*;
import static Utilities.ExtentReportUtilties.*;


public class Forms {

    @FindBy(xpath = "//input[@id='firstname']")
    static WebElement firstNameField;
    @FindBy(xpath = "//input[@id='lasttname']")
    static WebElement lastNameField;
    @FindBy(xpath = "//input[@id='email']")
    static WebElement emailField;
    //select/option[@data-countrycode]
    @FindBy(xpath = "//select/option[@data-countrycode]")
    static List<WebElement> countryCodeDropDown;
    @FindBy(xpath = "//select/option[@value]")
    static List<WebElement> countryDropDown;
    @FindBy(xpath = "//input[@id='Phno']")
    static WebElement phoneNoField;

    @FindBy(xpath = "//input[@id='Addl1']")
    static WebElement addressLine1Field;
    @FindBy(xpath = "//input[@id='Addl2']")
    static WebElement addressLine2Field;
    @FindBy(xpath = "//input[@id='state']")
    static WebElement stateField;
    @FindBy(xpath = "//input[@id='postalcode']")
    static WebElement postalCodeField;
    @FindBy(xpath = "//input[@type='date']")
    static WebElement DOBField;
    @FindBy(xpath = "//input[@type='radio'][@name='gender']")
    static List<WebElement> genders;
    @FindBy(xpath = "//input[@type='checkbox']")
    static WebElement termsAndConditions;
    //input[@type='submit']
    @FindBy(xpath = "//input[@type='submit']")
    static WebElement submit;


    public static void openingFramesWebpage() throws IOException {
        openWebPage("Formpage");
        maximizePage();
        report_pageName = "forms";
        createTest("Verifying the form page");
    }

    public void enteringFirstName() throws IOException, AWTException, InterruptedException {
        PageFactory.initElements(driver(), this);
        firstNameField.sendKeys(ExcelUtilities.getCellValue("FirstName"));
        takeScreenshots(ScreenshotUtilities.firstNameScreenshotFilePath);
        if (firstNameField.getAttribute("value").equals(ExcelUtilities.getCellValue("FirstName"))) {
            test().pass("FirstName was entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(firstNameScreenshotFilePath.getPath()).build());
        } else {
            test().fail("unable to enter firstname", MediaEntityBuilder.createScreenCaptureFromPath(firstNameScreenshotFilePath.getPath()).build());
        }
    }

    public void enteringlastName() throws IOException, AWTException, InterruptedException {
        PageFactory.initElements(driver(), this);
        lastNameField.sendKeys(ExcelUtilities.getCellValue("LastName"));
        waitPageFor(4000);
        takeScreenshots(ScreenshotUtilities.lastNameScreenshotFilePath);
        if (lastNameField.getAttribute("value").equals(ExcelUtilities.getCellValue("LastName"))) {
            test().pass("Able to enter lastname", MediaEntityBuilder.createScreenCaptureFromPath(lastNameScreenshotFilePath.getPath()).build());
        } else {
            test().fail("Unable to enter lastname", MediaEntityBuilder.createScreenCaptureFromPath(lastNameScreenshotFilePath.getPath()).build());
        }
    }

    public void enteringEmail() throws IOException, AWTException, InterruptedException {
        PageFactory.initElements(driver(), this);
        emailField.clear();
        emailField.sendKeys(ExcelUtilities.getCellValue("Email"));
        waitPageFor(4000);
        takeScreenshots(ScreenshotUtilities.emailScreenshotFilePath);
        if (emailField.getAttribute("value").equals(ExcelUtilities.getCellValue("Email"))) {
            test().pass("Able to enter email", MediaEntityBuilder.createScreenCaptureFromPath(emailScreenshotFilePath.getPath()).build());
        } else {
            test().fail("Unable to enter email", MediaEntityBuilder.createScreenCaptureFromPath(emailScreenshotFilePath.getPath()).build());
        }
    }

    public void enteringPhoneNo() throws IOException, AWTException, InterruptedException {
        PageFactory.initElements(driver(), this);
        phoneNoField.sendKeys(String.valueOf(ExcelUtilities.getCellValue("Phone_No")));
        waitPageFor(4000);
        takeScreenshots(ScreenshotUtilities.phoneNumberScreenshotFilePath);
        if (phoneNoField.getAttribute("value").equals(ExcelUtilities.getCellValue("Phone_No"))) {
            test().pass("Able to enter Phone no.", MediaEntityBuilder.createScreenCaptureFromPath(lastNameScreenshotFilePath.getPath()).build());
        } else {
            test().fail("Unable to enter phone no.", MediaEntityBuilder.createScreenCaptureFromPath(lastNameScreenshotFilePath.getPath()).build());
        }
    }

    public void enteringAddress() throws IOException, AWTException, InterruptedException {
        PageFactory.initElements(driver(), this);
        addressLine1Field.sendKeys(ExcelUtilities.getCellValue("Address Line_1"));
        addressLine2Field.sendKeys(ExcelUtilities.getCellValue("Address Line_2"));
        stateField.sendKeys(ExcelUtilities.getCellValue("State"));
        postalCodeField.sendKeys(ExcelUtilities.getCellValue("Postal_Code"));
        waitPageFor(4000);
        takeScreenshots(addressScreenshotFilePath);
        if (addressLine1Field.getAttribute("value").equals(ExcelUtilities.getCellValue("Address Line_1")) && addressLine2Field.getAttribute("value").equals(ExcelUtilities.getCellValue("Address Line_2"))
                && stateField.getAttribute("value").equals(ExcelUtilities.getCellValue("State")) && postalCodeField.getAttribute("value").equals(ExcelUtilities.getCellValue("Postal_Code"))) {
            test().pass("Able to enter Address", MediaEntityBuilder.createScreenCaptureFromPath(addressScreenshotFilePath.getPath()).build());
        } else {
            test().fail("Unable to enter Address", MediaEntityBuilder.createScreenCaptureFromPath(addressScreenshotFilePath.getPath()).build());
        }
    }

    public void selectingCountry(String country) throws IOException, AWTException, InterruptedException {
        for (WebElement el : countryDropDown) {
            if (el.getText().equals(country)) {
                el.click();
                waitPageFor(4000);
                takeScreenshots(CountryScreenshotFilePath);
                if (el.isSelected()) {
                    test().pass("Able to select the country", MediaEntityBuilder.createScreenCaptureFromPath(CountryScreenshotFilePath.getPath()).build());
                } else {
                    test().fail("Unable to select the country", MediaEntityBuilder.createScreenCaptureFromPath(CountryCodeScreenshotFilePath.getPath()).build());
                }
            }
        }
    }

    public void selectingCountryCode(String country_Code) throws IOException, AWTException, InterruptedException {
        for (WebElement el : countryCodeDropDown) {
            if (el.getText().equals(country_Code)) {
                el.click();
                waitPageFor(4000);
                takeScreenshots(CountryCodeScreenshotFilePath);
                if (el.isSelected()) {
                    test().pass("Able to select the Country Code", MediaEntityBuilder.createScreenCaptureFromPath(CountryCodeScreenshotFilePath.getPath()).build());
                } else {
                    test().fail("Unable to select the Country Code", MediaEntityBuilder.createScreenCaptureFromPath(CountryCodeScreenshotFilePath.getPath()).build());
                }
            }
        }
    }

    public void enteringDOB() throws IOException, AWTException, InterruptedException, DateUtil.DateParseException {
        DOBField.sendKeys(ExcelUtilities.getCellValue("DOB"));
        waitPageFor(4000);
        takeScreenshots(dobScreenshotFilePath);
        System.out.println(DOBField.getAttribute("value"));
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d = LocalDate.parse(DOBField.getAttribute("value"), dateFormat);
        DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = d.format(newDateFormat).replace("-", "");
        boolean dob = date.equals(ExcelUtilities.getCellValue("DOB"));
        System.out.println(dob);
        if (date.equals(ExcelUtilities.getCellValue("DOB"))) {
            test().pass("Able to enter DOB", MediaEntityBuilder.createScreenCaptureFromPath(dobScreenshotFilePath.getPath()).build());
        } else {
            test().fail("Unable to enter DOB", MediaEntityBuilder.createScreenCaptureFromPath(dobScreenshotFilePath.getPath()).build());
        }
    }

    public void selectingGender() throws AWTException, IOException, InterruptedException {
        for (WebElement el : genders) {
            if (el.getAttribute("id").equalsIgnoreCase(ExcelUtilities.getCellValue("Gender"))) {
                el.click();
                waitPageFor(4000);
                takeScreenshots(genderScreenshotFilePath);
                if (el.isSelected()) {
                    test().pass("Able to select Gender", MediaEntityBuilder.createScreenCaptureFromPath(genderScreenshotFilePath.getPath()).build());
                } else {
                    test().fail("Unable to select gender", MediaEntityBuilder.createScreenCaptureFromPath(genderScreenshotFilePath.getPath()).build());
                }
            }


        }
    }

    public void checkingTermsAndConditions() throws IOException, AWTException, InterruptedException {
        termsAndConditions.click();
        waitPageFor(4000);
        takeScreenshots(termsandConditionsScreenshotFilePath);

        if (termsAndConditions.isSelected()) {
            test().pass("Able to accept terms and Conditions", MediaEntityBuilder.createScreenCaptureFromPath(termsandConditionsScreenshotFilePath.getPath()).build());
        } else {
            test().fail("Unable to accept terms and Conditions", MediaEntityBuilder.createScreenCaptureFromPath(termsandConditionsScreenshotFilePath.getPath()).build());
        }
    }

    public void clickingSubmit() throws IOException, AWTException, InterruptedException, InvalidFormatException {
        try {
            scrollPage();
            waitPageFor(4000);
            takeScreenshots(submitScreenshotFilePath);
            submit.click();
            explicitWait(submit);
            test().pass("Able to click the submit button", MediaEntityBuilder.createScreenCaptureFromPath(submitScreenshotFilePath.getPath()).build());
        } catch (Exception e) {
            test().fail("Unable to click the submit button" + " " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(submitScreenshotFilePath.getPath()).build());
        }
        report().flush();
        word();
        closePage();
    }

    public static void openingFramepage() throws IOException {
        openWebPage("Formpage");
        maximizePage();
    }

    public void enteringTheFirstName(String firstName) throws IOException {
        PageFactory.initElements(driver(), this);
        firstNameField.sendKeys(firstName);

    }

    public void enteringTheLAstName(String lastName) throws IOException {
        PageFactory.initElements(driver(), this);
        lastNameField.sendKeys(lastName);

    }

    public void enteringEmail(String email) throws IOException {
        PageFactory.initElements(driver(), this);
        emailField.clear();
        emailField.sendKeys(email);

    }

    public void selectCountryCode(String countryCode) throws IOException {
        PageFactory.initElements(driver(), this);
        for (WebElement we : countryCodeDropDown) {
//            System.out.println(we.getText());
            if (we.getText().equals(countryCode)) {
                we.click();
            }
        }

    }

    public void enterPhoneNo(String phoneNO) throws IOException {
        phoneNoField.sendKeys(phoneNO);

    }

    public void enterAddress(String add1, String add2, String state, String pcode, String country) throws IOException {
        addressLine1Field.sendKeys(add1);
        addressLine2Field.sendKeys(add2);
        stateField.sendKeys(state);
        postalCodeField.sendKeys(pcode);
        for (WebElement we : countryDropDown) {
            if (we.getText().equals(country)) {
                we.click();
            }
        }


    }

    public void enterDOB(String dob) throws IOException {
        DOBField.sendKeys(dob);
    }

    public void enterGender(String gender) throws IOException, InterruptedException {
        for (WebElement we : genders) {
            if (we.getAttribute("id").equalsIgnoreCase(gender)) {
                we.click();
                Thread.sleep(2000);
//            }
            }
        }

    }
    public void checkTermsAndConditions() throws IOException {
       termsAndConditions.click();
    }
    public void submitForm() throws IOException {
        submit.click();
    }
}
