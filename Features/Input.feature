@Inputs @Execute
  Feature: Testing the input fields in the webpage
  @enterText
    Scenario: Entering the text in an input filed
      Given user is on the webpage for entering text
      And user clicks the input field for entering text
      Then enter the text
    @apendText
    Scenario: Apending the text in an input filed
      Given user is on the webpage for appending text
      And user clicks the input field for appending with an existing text
      Then append the text in an input field with the given text
    @findText
    Scenario: Finding text in an input filed
      Given user is on the webpage for finding text
      And user clicks the input field for finding the text in the field
      Then gets the text in an input field
    @clearText
    Scenario: Clearing text in an input filed
      Given user is on the webpage to clear text
      And user clicks the input field to clear the text
      Then clears the text in an input field
    @disabledField
    Scenario: Checking whether an input filed is disabled or not
      Given user is on the webpage to find the field was disabled or not
      And user clicks the input field for checking
      Then checks whether an input filed is disabled or not
    @readOnlyField
    Scenario: Checking whether an input filed is read only or not
      Given user is on the webpage to check the field
      And user clicks the input field for checking whether it is read only
      Then checks whether an input filed is read only or not