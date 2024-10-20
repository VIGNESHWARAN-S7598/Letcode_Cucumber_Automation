package StepDefinitions;

import PageObjects.Input_Fieds;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;




public class InputStepDef extends Input_Fieds {
    @Given("user is on the webpage for entering text")
    public void user_is_on_the_webpage_for_entering_text() throws IOException {
        openWebPage("inputpage");
        maximizeWebpage();
        if(driver().getTitle().equals("Interact with Input fields")){
            System.out.println("user is in an input webpage");
        }else{
            System.out.println("user is not in an input webpage");
        }
    }
    @Given("user clicks the input field for entering text")
    public void user_clicks_the_input_field_for_entering_text() throws IOException {
        PageFactory.initElements(driver(),this);
        if(fullNameField.isEnabled()){
            System.out.println("Input field to enter text is available on webPage");
        }else{
            System.out.println("field not avaialble");
        }

    }
    @Then("enter the text")
    public void enter_the_text() throws IOException {
        enterTextInInputField();
    }


    @Given("user is on the webpage for appending text")
    public void user_is_on_the_webpage_for_appending_text() throws IOException {
        if(driver().getTitle().equals("Interact with Input fields")){
            System.out.println("user is in an input webpage");
        }else{
            System.out.println("user is not in an input webpage");
        }

    }
    @Given("user clicks the input field for appending with an existing text")
    public void user_clicks_the_input_field_for_appending_with_an_existing_text() throws IOException {
        PageFactory.initElements(driver(),this);
        if(appendTextField.isEnabled()){
            System.out.println("Input field to append text is available on webPage");
        }else{
            System.out.println("field not avaialble");
        }
    }
    @Then("append the text in an input field with the given text")
    public void append_the_text_in_an_input_field_with_the_given_text() throws IOException {
        PageFactory.initElements(driver(),this);
        appendTextField.sendKeys(" I am good.How are you?");
    }



    @Given("user is on the webpage for finding text")
    public void user_is_on_the_webpage_for_finding_text() throws IOException {
        if(driver().getTitle().equals("Interact with Input fields")){
            System.out.println("user is in an input webpage");
        }else{
            System.out.println("user is not in an input webpage");
        }
    }
    @Given("user clicks the input field for finding the text in the field")
    public void user_clicks_the_input_field_for_finding_the_text_in_the_field() throws IOException {
        PageFactory.initElements(driver(),this);
        if(findTextField.isEnabled()){
            System.out.println("Input field to find text is available on webPage");
        }else{
            System.out.println("field not avaialble");
        }
    }
    @Then("gets the text in an input field")
    public void gets_the_text_in_an_input_field() throws IOException {
        PageFactory.initElements(driver(),this);
        System.out.println("Text in a field: "+findTextField.getAttribute("value"));
    }



    @Given("user is on the webpage to clear text")
    public void user_is_on_the_webpage_to_clear_text() throws IOException {

        if(driver().getTitle().equals("Interact with Input fields")){
            System.out.println("user is in an input webpage");
        }else{
            System.out.println("user is not in an input webpage");
        }

    }
    @Given("user clicks the input field to clear the text")
    public void user_clicks_the_input_field_to_clear_the_text() throws IOException {
        PageFactory.initElements(driver(),this);
        if(clearTextField.isEnabled()){
            System.out.println("clearing text field is available on webPage");
        }else {
            System.out.println("field not avaialble");
        }
    }
    @Then("clears the text in an input field")
    public void clears_the_text_in_an_input_field() throws IOException {
        PageFactory.initElements(driver(),this);
        clearTextField.clear();
    }



    @Given("user is on the webpage to find the field was disabled or not")
    public void user_is_on_the_webpage_to_find_the_field_was_disabled_or_not() throws IOException {
        if(driver().getTitle().equals("Interact with Input fields")){
            System.out.println("user is in an input webpage");
        }else{
            System.out.println("user is not in an input webpage");
        }
    }
    @Given("user clicks the input field for checking")
    public void user_clicks_the_input_field_for_checking() throws IOException {
        PageFactory.initElements(driver(),this);
        if(disabledTextField.isDisplayed()){
            System.out.println("disabled text field is available on webPage");
        }else {
            System.out.println("field not avaialble");
        }
    }
    @Then("checks whether an input filed is disabled or not")
    public void checks_whether_an_input_filed_is_disabled_or_not() throws IOException {
        PageFactory.initElements(driver(),this);
        if(disabledTextField.isEnabled()){
            System.out.println("text field is enabled");
        }else {
            System.out.println("text field is disabled");
        }
    }



    @Given("user is on the webpage to check the field")
    public void user_is_on_the_webpage_to_check_the_field() throws IOException {
        if(driver().getTitle().equals("Interact with Input fields")){
            System.out.println("user is in an input webpage");
        }else{
            System.out.println("user is not in an input webpage");
        }
    }
    @Given("user clicks the input field for checking whether it is read only")
    public void user_clicks_the_input_field_for_checking_whether_it_is_read_only() throws IOException {
        PageFactory.initElements(driver(),this);
        if(readOnlyTextField.isDisplayed()){
            System.out.println("read only text field is available on webPage");
        }else {
            System.out.println("field not avaialble");
        }
    }
    @Then("checks whether an input filed is read only or not")
    public void checks_whether_an_input_filed_is_read_only_or_not() throws IOException {
        PageFactory.initElements(driver(),this);
        if(readOnlyTextField.getAttribute("readonly")!=null){
            System.out.println("the field is read only");
        }else{
            System.out.println("the field is not read only");
        }
    }




}
