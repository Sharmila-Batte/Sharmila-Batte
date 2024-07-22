
Feature: Create lead in Vtiger application

  Background: 
    Given user already in login page of vtiger lead for POM
    And user login successfully with valid data of vtiger lead for POM
    And click on navigation bar of vtiger lead for POM
    And go to Marketing and select Leads of vtiger lead for POM

  Scenario Outline: Create new lead with name as <firstName>
    When click on Add Leads button and enter firstname as <firstName> ,last as <lastName> ,number as <number> and click on save button for POM
    And click on Leads link for POM 
    Then verify lead is created for POM
    And close the browser

    Examples: 
      | firstName | lastName | number |
      | Sharmila        | Malkar  |    123 |