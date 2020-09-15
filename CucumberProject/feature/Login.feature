
@Facebook
Feature: FacebookFeature
  I want to test facebook application

  @LoginTag
  Scenario: Login Scenario
    Given I am user of facebook application
    When I enter valid username
    And I enter valid password
    And I check on login button
    Then User should be able to login successfully
