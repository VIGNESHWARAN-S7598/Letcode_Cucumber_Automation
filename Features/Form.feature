@FormIterate @Execute
Feature: Checking the Forms Webpage
  Scenario Outline: Entering the details in the given form
    Given User is in the webpage
    When User enters the "<FirstName>"
    And enters the "<LastName>"
    And enters an "<Email>"
    And Selects the country Code as "India (+91)" in the country code field
    And Enters "<Phone_No>"
    And Enters Address "<Address Line_1>""<Address Line_2>""<State>""<Postal_Code>""<Country>"
    And Enters dob as "<DOB>"
    And Selected the "<Gender>"
    And Agreed the terms and Conditions by clicking the checkBox
    Then Click on the submit button at the end of the webpage

#          ________________________________________________________________________________
#---------|      Make sure to Delete the Examples Section After executing the Script      |--------------------------------------------------------------------------
#---------|_______________________________________________________________________________|---------------------------------------------------------------------------
    Examples:
      | FirstName    | LastName   | Email                       | Phone_No          | Address Line_1         | Address Line_2 | State | Postal_Code |Country      |DOB        | Gender |
      | VIGNESHWARAN |sOMASUNDARAM|   SVIGNESHxxxx@GMAIL.COM    |  8220XXXX06       |    351,hvpty, TPK      |     MDU        |   tn  |     9736    |    India    |07051998   |  Male  |
      | gANESH       | Sivakumar  |   ganeshXXX@gmail.com       |  99947XXX10       |     1,KK Nagar         |   Ashok Pillar |  chn  |     8769    |    India    |29081997   |  Male  |

