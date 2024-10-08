package StepDefinitions;

import PageObjects.Forms;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

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
    public void entersThe(String lastName) throws IOException {
        enteringTheLAstName(lastName);
    }

    @And("enters an {string}")
    public void entersAn(String eMail) throws IOException {
        enteringEmail(eMail);
    }

    @And("Selects the country Code as {string} in the country code field")
    public void selectsTheCountryCodeAsInTheCountryCodeField(String countryCode) throws IOException {
        selectCountryCode(countryCode);
    }

    @And("Enters {string}")
    public void enters(String phoneNo) throws IOException {
        enterPhoneNo(phoneNo);
    }

    @And("Enters Address {string}{string}{string}{string}{string}")
    public void entersAddress(String add1,String add2,String state,String pcode,String country) throws IOException {
        enterAddress(add1,add2,state,pcode,country);
    }

    @And("Enters dob as {string}")
    public void entersDobAs(String DOB) throws IOException {
        enterDOB(DOB);
    }

    @And("Selected the {string}")
    public void selectedThe(String gender) throws IOException, InterruptedException {
        enterGender(gender);
    }

    @And("Agreed the terms and Conditions by clicking the checkBox")
    public void agreedTheTermsAndConditionsByClickingTheCheckBox() throws IOException {
        checkTermsAndConditions();
    }

    @Then("Click on the submit button at the end of the webpage")
    public void clickOnTheSubmitButtonAtTheEndOfTheWebpage() throws IOException {
        submitForm();
    }
}
