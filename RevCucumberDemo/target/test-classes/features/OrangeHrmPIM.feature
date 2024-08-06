Feature: This feature file is create to cover testing of OrangeHRM PIM flow

  Background: 
    Given User is on OrangeHRM login page
    And user enter valid data for OrangeHRM login as "Admin" and "admin123"
    And user clicks on login button of OrangeHRM
    And user clicks on PIM link

  Scenario Outline: Create PIM and validate it
    When User click on add button of OrangeHRM
    And Type input firstnm as <firstnm> ,lastnm as <lastnm> ,empid as <empId> and click on save button of PIM create
    Then Navigate to PIM home page
    And Search newly created empid as<empId> of PIM create
    And Click on search button PIM create
    And Verify the result of PIM create
    And close the browser

    Examples: 
      | firstnm  | lastnm | empId |
      | Sharmila | Malkar |  4545 |

  Scenario Outline: Update PIM and Validate it
    When Search created empid as <empId> of PIM edit
    And select firstcheckbox and click on edit buton symbol of PIM edit
    And click on job and click on jobTitle of PIM edit
    And select jobTitle
    And Click on save button of PIM edit
    Then Click on PIM for verification
    And search Employee id as <empId> of PIM edit
    And verify the result of PIM edit
    And close the browser

    Examples: 
      | empId |
      |  4545 |
      
    Scenario Outline:  Delete PIM and validate it
    When Search created empId as <empId> of PIM delete
    And click on firstcheckbox and delete symbol of PIM delete
    And click on yes button of delete pop up of PIM delete
    Then For verification search created empId as <empId> of PIM delete
    And Verify the result of PIM delete 
    And close the browser
    
    Examples:
    |empId|
    |4545|
