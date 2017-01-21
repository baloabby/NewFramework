Feature: Login User Test

  Background: 
    Given I am on the Homepage
    And I click on My Account Link
    And I see a welcome message

  @Login
  Scenario Outline: As a Registered user i want to Login successfully
  When I enter email "<email>" details
  And I enter passwword "<passw>" details
  And I click signin button
  Then I verify that I am logged in
  #And I log out
  #And I close the browser
  #
  Examples:
  | email                | passw       |
  | far_bal123@gmail.com | password123 |
  #@Login
  #Scenario Outline: As a Registered user i want to see an error message when i enter incorrect details
    #When I enter email "<email>" details
    #And I enter passwword "<passw>" details
    #And I click signin button
    #Then I see an error message
    #And I close the browser
#
    #Examples: 
      #| email                | passw       |
      #| far_bal123@gmail.com | password    |
      #| far23@gmail.com      | password123 |
      #|                      | password123 |
      #| far_bal123@gmail.com |             |
      #|                      |             |

