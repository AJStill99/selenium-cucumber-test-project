Feature: Login feature
  Scenario: User can login correctly with valid details
    Given user is on login page
    When I enter user email correctly
    When I enter user password correctly
    When I click login button
    Then user should be logged in

  Scenario: User cannot login with incorrect details
    Given user is on login page
    When I enter user email incorrectly
    When I enter user password incorrectly
    When I click login button
    Then User will not be logged in