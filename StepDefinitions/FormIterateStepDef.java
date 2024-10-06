package StepDefinitions;

import PageObjects.Forms;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static Utilities.DriverUtilities.*;

public class FormIterateStepDef extends Forms {
    @Given("User is in the webpage")
    public void userIsInTheWebpage() throws IOException {
        openingFramepage();
    }

    @When("User enters the {string}")
    public void userEntersThe(String firstName)  throws IOException{
        enteringTheFirstName(firstName);
    }

    @And("enters the {string}")
    public void entersThe(String arg0) {
    }

    @And("enters an {string}")
    public void entersAn(String arg0) {
    }

    @And("Selects the country Code as {string} in the country code field")
    public void selectsTheCountryCodeAsInTheCountryCodeField(String arg0) {
    }

    @And("Enters {string}")
    public void enters(String arg0) {
    }

    @And("Enters Address {string}{string}{string}{string}")
    public void entersAddress(String arg0, String arg1, String arg2, String arg3) {
    }

    @And("Selects the Country as {string} in the country field")
    public void selectsTheCountryAsInTheCountryField(String arg0) {
    }

    @And("Selected the {string}")
    public void selectedThe(String arg0) {
    }

    @And("Agreed the terms and Conditions by clicking the checkBox")
    public void agreedTheTermsAndConditionsByClickingTheCheckBox() {
    }

    @Then("Click on the submit button at the end of the webpage")
    public void clickOnTheSubmitButtonAtTheEndOfTheWebpage() {
    }
}
