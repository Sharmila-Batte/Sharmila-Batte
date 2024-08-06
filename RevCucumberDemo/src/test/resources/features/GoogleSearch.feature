Feature: Covers multiple search validation of google
  @Smoke
  Scenario Outline: validate search functionality with<text>
    Given User already opened web browser and having google search page opened
    When User search text as <text> on google
    And user click on enter
    Then User should navigate to google home page having title <expectedTitle>
    And close the browser

    Examples: 
      | text               | expectedTitle                      |
      | Software Testing   | Software Testing - Google Search   |
      | Manual Testing     | Manual Testing - Google Search     |
      | Automation testing |Automation testing - Google Search |
