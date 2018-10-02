Feature: Shopping Cart
  As an end user
  I want to navigate to shopping cart page
  So that I can view my shopping cart

  Scenario: Verify user should be able to view his shopping cart
    Given user is on homepage
    When user selects cart link
    Then user should view his shopping cart