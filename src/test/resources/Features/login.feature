Feature: Feature to test login functionality

  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage

  Scenario Outline: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to homepage

    Examples: # The scenario will run with these 2 parameter values below
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
