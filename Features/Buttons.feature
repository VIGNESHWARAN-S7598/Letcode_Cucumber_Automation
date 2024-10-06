@Buttons @Execute
Feature: testing the button WebElements

  @Homebutton
  Scenario: clicking on the home Button
    Given user is on the buttons test page
    When user clicks on the goTohome button
    And Webpage is navigated to homepage
    Then user navigate back to the buttons test page

  @XandY
  Scenario: getting X and Y coordinates of the Button
    Given user is at the buttons test page for finding X and Y coordinates
    Then user is getting the X and Y coordinates of the button

  @ColorButton
  Scenario: getting a color of the Button
    Given user is at the buttons test page for checking the color
    Then user is getting a color of the button

  @HeightWidthButton
  Scenario: getting the height and Width of the Button
    Given user is at the buttons test page for checking the height and width
    Then user is getting the height and Width of the Button

  @DisabledButton
  Scenario: Checking the button is disabled or not
    Given user is at the buttons test page for checking the button
    Then user checked whether the button is disabled or not

#  @ClickandHoldButton
#  Scenario : Clicking and hold the button
#    Given user is at the buttons test page for clicking and holding the button
#    Then user click and Holding the button



