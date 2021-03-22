Feature: Test login functionality.

  Scenario Outline: Check login is sucessful with valid credentials
    #Because we are using paramenters then we can call it an Outline.
    Given browser is opened
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to homepage

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |

      