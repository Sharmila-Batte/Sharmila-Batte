Feature: This feature file is create to cover testing of OrangeHRM PIM flow

  Background: 
    Given user is on orangeHRM login page
    And enters valid data for login as "Admin" and "admin123"
    And clicks on login button of OrangeHRM
    And user clicks on PIM link

  Scenario Outline: create PIM and validate it with <empId>
    When user click on add button of OrangeHRM
    And user enters the firstname as <firstName> ,last as <lastName> ,employee id as <empId> and click on save button of PIM create
    Then navigate to PIM home page
    And search newly created employee id as <empId> of PIM create
    And click on search button of PIM create
    And verify the result of PIM create
    And close the browser

    Examples: 
      | firstName | lastName | empId |
      | Sharmila  | Malkar   |  4040 |

  Scenario Outline: update PIM and validate it
    When search for newly created Employee id as <empId> of PIM update
    And click on search button of PIM Edit
    And click on firstchcekbox and click on edit symbol
    And click on job and  click on jobtitle dropdown
    And select job title
    And Click on save button of PIM Edit
    Then Click on PIM for verify
    And search Employee id as <empId> and jobtitle as <jobtitle>
    And Click on Search button of PIM edit to check updated record
    And verify the result of PIM edit
    And close the browser

    Examples: 
      | empId | jobtitle          |
      |  4040 | Account Assistant |

  Scenario Outline: delete PIM and validate it
    When search for newly created Employee id as <empId> for PIM delete and click on search button of PIM delete
    And click on firstchcekbox and click on delete symbol of PIM delete
    And click on yes button of confirmaion pop-up
    And verify the result of PIM delete
    And close the browser

    Examples: 
      | empId |
      |  4040 |
