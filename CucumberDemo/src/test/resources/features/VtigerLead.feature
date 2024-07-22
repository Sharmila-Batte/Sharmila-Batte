
Feature: Create lead in Vtiger application

  Background: 
    Given user already in login page of vtiger lead
    And user login successfully with valid data of vtiger lead
    And click on navigation bar of vtiger lead
    And go to Marketing and select Leads of vtiger lead

  Scenario Outline: Create new lead with name as <firstName>
    When click on Add Leads button and enter firstname as <firstName> ,last as <lastName> ,number as <number> and click on save button
    And click on Leads link
    Then verify lead is created
    And close the browser

    Examples: 
      | firstName | lastName | number |
      | Sharmila        | Malkar  |    123 |

