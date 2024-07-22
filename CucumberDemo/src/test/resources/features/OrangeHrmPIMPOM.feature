Feature: This feature file is create to cover testing of OrangeHRM PIM flow

  Background: 
    Given user is on orangeHRM login page for POM
    And user login successfully with valid data for POM
    And user clicks on PIM link for POM

  Scenario Outline: create PIM and validate it with <empId>
    When user click on add button of OrangeHRM for POM
    And user enters the firstname as <firstName> ,last as <lastName> ,employee id as <empId> and click on save button of PIM create for POM
    Then navigate to PIM home page for POM
    And search newly created employee id as <empId> of PIM create and click on search button for POM
    And verify the result of PIM create for POM
    And close the browser

    Examples: 
      | firstName | lastName | empId |
      | Sharmila  | Malkar   |  4040 |
