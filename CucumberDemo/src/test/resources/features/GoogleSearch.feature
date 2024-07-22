Feature: This covers multiple search validation on Google

  Scenario Outline: Validate search functionality in google with <text>
    Given user already opened Web browser and having google search page opened
    When user search text as <text> on google
    And user clicks on enter
    Then user should navigate to google home page having title as <expectedTitle>
    And close the browser

    Examples: 
      | text               | expectedTitle                      |
      | Software testing   | Software testing - Google Search   |
      | Manual testing     | Manual testing - Google Search     |
      | Automation testing | Automation testing - Google Search |
