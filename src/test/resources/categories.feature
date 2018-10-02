Feature: Categories
  As an end user
  I want to navigate to categories page
  So that I can view products

  Background: Given user is on homepage

  Scenario: Verify user should be able to view products on WOMEN page
    When user selects WOMEN link
    Then user should naviagte to WOMEN page
    And user should view products of WOMEN page

  Scenario: Verify user should be able to view products on DRESSES page
    When user selects DRESSES link
    Then user should naviagte to DRESSES page
    And user should view products of DRESSES page

  Scenario: Verify user should be able to view products on T-SHIRTS page
    When user selects T-SHIRTS link
    Then user should naviagte to T-SHIRTS page
    And user should view products of T-SHIRTS page