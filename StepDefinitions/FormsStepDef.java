package StepDefinitions;

import PageObjects.Forms;
import Utilities.ExcelUtilities;
import freemarker.template.utility.DateUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.*;
import java.io.IOException;

import static Utilities.DriverUtilities.*;
import static Utilities.ExcelUtilities.*;

public class FormsStepDef extends Forms {

    @Given("User is in the web page")
    public void userIsInTheWebPage() throws IOException {
        openingFramesWebpage();
    }
    @When("User enters the first name firstname")
    public void userEntersTheFirstNameFirstname() throws IOException, AWTException, InterruptedException {
        enteringFirstName();
    }

    @And("enters the last name")
    public void entersTheLastName() throws IOException, AWTException, InterruptedException {
        enteringlastName();
    }

    @And("enters an email")
    public void entersAnEmail() throws IOException, AWTException, InterruptedException {
        enteringEmail();
    }

    @And("Selects the country Code as {string}")
    public void selectsTheCountryCodeAs(String country_Code) throws IOException, AWTException, InterruptedException {
        selectingCountryCode(country_Code);
    }

    @And("Enters phone no")
    public void entersPhoneNo() throws IOException, AWTException, InterruptedException {
        enteringPhoneNo();
    }

    @And("Enters Address")
    public void entersAddress() throws IOException, AWTException,InterruptedException {
        enteringAddress();
    }

    @And("Selects the Country as {string}")
    public void selectsTheCountryAs(String country) throws IOException, AWTException, InterruptedException{
        selectingCountry(country);
    }

    @And("Enters DOB")
    public void entersDOB() throws IOException, AWTException, InterruptedException, DateUtil.DateParseException {
        enteringDOB();
    }

    @And("Selected the gender")
    public void selectedTheGender() throws IOException, AWTException, InterruptedException {
        selectingGender();
    }

    @And("Agreed the terms and Conditions")
    public void agreedTheTermsAndConditions() throws IOException, AWTException, InterruptedException {
        checkingTermsAndConditions();
    }

    @Then("Click on the submit button")
    public void clickOnTheSubmitButton() throws IOException, AWTException, InterruptedException, InvalidFormatException {
        clickingSubmit();
    }



}
