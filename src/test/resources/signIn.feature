Feature: Sign-In
  As an end user
  I want to navigate to sign-in page
  So that I can sign-in into my account


  Background:
    Given user is on homepage
    When user selects sign-in link

  Scenario:Verify user should be able to create an account
    Then user should navigate to sign-in page
    When enters email address
    And selects create an account
    And enters all personal information
    And selects register
    Then user should navigate to his account page

  Scenario:Verify user should be able to sign in with valid credentials
    When enters all valid credentils
    Then user should successfully sign-in into his account

