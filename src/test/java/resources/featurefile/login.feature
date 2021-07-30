Feature: Login functionality
  As a user i want to login successfully on VirginGames website

  @Smoke
  Scenario Outline: User should see error message with invalid credentials
    Given I am on Home page
    When I click on login link
    And I enter  "<userName>" in username field
    And I enter  "<password>" in password field
    And I click on login button
    Then I should see error message "<errorMessage>"
    Examples:
      | userName  | password   | errorMessage                                                              |
      | primetest | primetest1 | Please try again, your username/email or password has not been recognised |
      |           |            | Please try again, your username/email or password has not been recognised |
     |           | silenium1  | Please try again, your username/email or password has not been recognised |
