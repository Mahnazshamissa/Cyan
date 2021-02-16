Feature: LoginFeature

  Scenario: Login with valid username and valid password
    Given I navigate to the login page
    And I enter the following for Login
      | username | password |
      | tomsmith | SuperSecretPassword! |
    And I click on login button
    Then I should see the userform page


 Scenario Outline: Login with different username and password
    Given I navigate to the login page
    And I enter <username> and <password>
    And I click on login button
    Then I should see the userform page

   Examples:
     | username | password |
     | tomsmith | SuperSecretPassword! |
     | tomsmith | LowSecretPassword |
     | MaxMustermann | SuperSecretPassword! |
     | MaxMustermann | LowSecretPassword |
