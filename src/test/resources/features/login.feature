Feature: Login feature
  Scenario: Valid login
    Given user is on login page
    When user enters valid username and password
    Then user should be logged in

  Scenario: Invalid login
    Given user is on login page
    When user enter invalid username and password
    Then User will not be logged in