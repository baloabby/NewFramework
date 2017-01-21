Feature: Search Test

  Background: 
    Given I am on the Homepage
    And I click on My Account Link
    And I see a welcome message

  @search
  Scenario Outline: As a user I want to search for an item in quick Find field, so as to see some reference to that item in the result summary
    And I type "<product>" in the search widget
    And I click search icon
    Then I  see Product name displayed
    Examples: 
      | product |
      | samsung |
      | DVD     |
      | Books   |
      | CD      |
