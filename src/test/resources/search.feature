Feature: Search
  As an end user
  I want to search a product
  So that I can view products page

  Scenario: Verify user should be able view his searched product
    Given user is on homepage
    When user searches product
    Then user should navigate to products page
    And user should view products in that page

