Feature: Contact us
  As an end user
  I want to navigate to ontact us page
  So that I can send message to customer service


  Scenario: Verify user should be able to send message to customer service
    Given user is on homepage
    When user selects contact us link
    Then user should navigate to contact us page
    When user enters all fields
    And selects send link
    Then user should see the confirmation message
