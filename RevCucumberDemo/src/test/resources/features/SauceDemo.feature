Feature: This will cover SauceDemo Login functionality

  Scenario Outline: Validate login functionality of SauceDemo with<flow>
    Given User is already in login page of SauceDemo
    When User enters username as<username>
    And User enters password as<password>
    And user clicks on login button of sauce demo
    Then User should navigate to home page of SauceDemo with URL as<expectedURL>
    And User close the browser

    Examples: 
      | flow    | username        | password     | expectedURL   |
      | valid   | standard_user   | secret_sauce | inventory     |
      | invalid | locked_out_user | secret_sauce | saucedemo.com |
      | invalid | problem_user    | secret_sauce | saucedemo.com |
