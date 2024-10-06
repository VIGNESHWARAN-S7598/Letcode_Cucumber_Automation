package StepDefinitions;

import PageObjects.Buttons;
import Utilities.SeleniumUtilities;
import io.cucumber.java.en.*;
import java.io.IOException;
import static Utilities.WaitUtilities.*;



public class ButtonsStepDef extends Buttons {
    @Given("user is on the buttons test page")
    public void user_is_on_the_buttons_test_page() throws IOException, InterruptedException {
        openingbuttonsPageLink();
        SeleniumUtilities.maximizePage();

    }

    @When("user clicks on the goTohome button")
    public void user_clicks_on_the_go_tohome_button() throws InterruptedException, IOException {
        clickingHomeButton();
    }

    @And("Webpage is navigated to homepage")
    public void webpage_is_navigated_to_homepage() throws IOException, InterruptedException {
        waitPageFor(4000);
        SeleniumUtilities.getPageTitle();
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user navigate back to the buttons test page")
    public void user_navigate_back_to_the_buttons_test_page() throws IOException, InterruptedException {
        waitPageFor(4000);
        SeleniumUtilities.navigateToLastPage();
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("user is at the buttons test page for finding X and Y coordinates")
    public void user_is_at_the_buttons_test_page_for_finding_x_and_y_coordinates() throws InterruptedException, IOException {
        System.out.println("going to get X and Y coordinates for the button");
    }

    @Then("user is getting the X and Y coordinates of the button")
    public void user_is_getting_the_x_and_y_coordinates_of_the_button() throws InterruptedException, IOException {
        gettingXandYCoordinatesButton();
    }

    @Given("user is at the buttons test page for checking the color")
    public void user_is_at_the_buttons_test_page_for_checking_the_color() throws IOException, InterruptedException {
        System.out.println("going to get color for the button");
    }

    @Then("user is getting a color of the button")
    public void user_is_getting_a_color_of_the_button() throws InterruptedException, IOException {
    gettingColorOfButton();
    }

    @Given("user is at the buttons test page for checking the height and width")
    public void user_is_at_the_buttons_test_page_for_checking_the_height_and_width() {
        System.out.println("going to get height and width of the button");
    }

    @Then("user is getting the height and Width of the Button")
    public void user_is_getting_the_height_and_width_of_the_button() throws InterruptedException, IOException {
        gettingsizeOfButton();
    }

    @Given("user is at the buttons test page for checking the button")
    public void user_is_at_the_buttons_test_page_for_checking_the_button() {
        System.out.println("going to check the button");
    }

    @Then("user checked whether the button is disabled or not")
    public void user_checked_whether_the_button_is_disabled_or_not() throws InterruptedException, IOException {
        checkingAvailabilityofButton();
    }


    @Given("user is at the buttons test page for clicking and holding the button")
    public void userIsAtTheButtonsTestPageForClickingAndHoldingTheButton() {
        System.out.println("user is at the buttons test page");
    }

    @Then("user click and Holding the button")
    public void userClickAndHoldingTheButton() throws IOException, InterruptedException {
        clickingAndHoldingButton();
        waitPageFor(2000);
        SeleniumUtilities.closePage();
    }



}
