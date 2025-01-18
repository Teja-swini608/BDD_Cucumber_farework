Feature: Testing Contant list App

  Scenario: Testing Login Funcationaly
    Given user is on login page
    When user enters username
    And user enters password
    Then user clicks on loginbutton
    Then user verifying the title