@SmokeScenario #These are tags 
Feature: Feature to test login functionality

  @SmokeTest  #Similar thing they are tags
  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage

