Feature: Create Contact in Vtiger application

  Background: 
    Given user already in login page
    And user login successfully with valid data
    And click on navigation bar
    And go to Marketing and select Contacts

  Scenario Outline: Create new contact and validate it
    When click on Add Contacts button and enter firstname as <firstName> ,last as <lastName> ,number as <number> and click on save button
    And click on All link
    Then verify contact is created with <lastName>
    And close the browser
    
     Examples: 
      | firstName | lastName | number |
      | QA        | Champak  |    123 |
    

  Scenario Outline: update contact and validate it
  When click on contact link
  And click on first checkbox
  And click on edit logo
  And enter company name as <companyName>
  And click on save button of contact
  Then search  with firstnmInputFieldUpdate as <firstName> ,last as <lastName> ,company name as<companyName>
  And click on search button of contact
  And verify contact is updated
  And close the browser
  
    Examples: 
      | firstName | lastName | companyName |
      | QA        | Champak  |    LNT |
  
  

  Scenario: Delete new contact and validate it
    When click on select all contacts checkbox
    And click on delete logo
    And user will get a popup to comfirm deletion, select Yes
    Then verify that all contacts deleted
    And close the browser
  