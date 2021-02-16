Feature: Login Functionality Feature

  In order to ensure Login Functionality works,
  I want to run the cucumber test to verify it is working

  @positiveScenario
  Scenario: Login with valid username and valid password
    Given user navigates to http://the-internet.herokuapp.com/login
    When user logs in using Username as <username> and Password <password>
    And user enters the following for Login
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    And user clicks on login button
    Then login should be successful


  @negaviveScenario
  Scenario Outline: Login with different username and password
   Given user navigates to http://the-internet.herokuapp.com/login
   When user logs in using Username as <username> and Password <password>
   And user clicks on login button
   Then error message should throw

   Examples:
     | username | password |
     | tomsmith | LowSecretPassword |
     | MaxMustermann | SuperSecretPassword! |
     | MaxMustermann | LowSecretPassword |
