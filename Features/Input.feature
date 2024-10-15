@Inputs @Execute
  Feature: Testing the input fields in the webpage
  @enterText
    Scenario: Entering the text in an input filed
      Given user is on the webpage
      And user clicks the input field
      Then enter the text
    @apendText
    Scenario: Apending the text in an input filed
      Given user is on the webpage
      And user clicks the input field
      Then append the text in an input field with the given text
    @findText
    Scenario: Finding text in an input filed
      Given user is on the webpage
      And user clicks the input field
      Then gets the text in an input field
    @clearText
    Scenario: Clearing text in an input filed
      Given user is on the webpage
      And user clicks the input field
      Then clears the text in an input field
    @disabledField
    Scenario: Checking whether an input filed is disabled or not
      Given user is on the webpage
      And user clicks the input field
      Then checks whether an input filed is disabled or not
    @readOnlyField
    Scenario: Checking whether an input filed is read only or not
      Given user is on the webpage
      And user clicks the input field
      Then checks whether an input filed is read only or not