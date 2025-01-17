Feature: Testing Contant List App

  Background: 
    Given User is on login page
    When User clicking on signup button

  Scenario: Scenario1
    Then user entering email ID and password
    And user click on submit button

  Scenario: Scenario2
    Then user entering firstname and lastname
    And user click on cancel button
