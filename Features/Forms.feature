Feature: Checking the Forms Webpage
  @FormEdit @Execute
  Scenario: Entering the details in the given form
    Given User is in the web page
    When User enters the first name firstname
    And enters the last name
    And enters an email
    And Selects the country Code as "India (+91)"
    And Enters phone no
    And Enters Address
    And Selects the Country as "India"
    And Enters DOB
    And Selected the gender
    And Agreed the terms and Conditions
    Then Click on the submit button







