Feature: This feature file is create to cover testing of OrangeHRM PIM flow

  Background: 
    Given User is on OrangeHRM login page of OrangeHRM PIM POM
    And User login successfully with valid data for OrangeHRM PIM POM and clicks on login button of OrangeHRM PIM POM
    And user clicks on PIM link of OrangeHRM PIM POM
  @Smoke
  Scenario Outline: Create PIM and validate it
    When User click on add button of OrangeHRM PIM POM
    And Type input firstnm as <firstnm> ,lastnm as <lastnm> ,empid as <empId> and click on save button of PIM create of OrangeHRM PIM POM
    Then Navigate to PIM home page of OrangeHRM PIM POM
    And Search newly created empid as <empId> of PIM create and Click on search button PIM create of OrangeHRM PIM POM
    And Verify the result of PIM create for OrangeHRM POM
    And close the browser

    Examples: 
      | firstnm  | lastnm | empId |
      | Sharmila | Malkar |  4545 |

  Scenario Outline: Update PIM and Validate it
    When Search created empid as <empId> of PIM edit of OrangeHRM PIM POM
    And select firstcheckbox and click on edit buton symbol of PIM edit of OrangeHRM PIM POM
    And click on job and click on jobTitle of PIM edit of OrangeHRM PIM POM
    Then Click on PIM for verification of OrangeHRM PIM POM
    And search Employee id as <empId> of PIM edit of OrangeHRM PIM POM
    And verify the result of PIM edit of OrangeHRM PIM POM
    And close the browser

    Examples: 
      | empId |
      |  4545 |
      
    Scenario Outline:  Delete PIM and validate it
    When Search created empId as <empId> of PIM delete of OrangeHRM PIM POM
    And click on firstcheckbox and delete symbol of PIM delete of OrangeHRM PIM POM
    Then For verification search created empId as <empId> of PIM delete of OrangeHRM PIM POM
    And Verify the result of PIM delete of OrangeHRM PIM POM
    And close the browser
    
    Examples:
    |empId|
    |4545|
