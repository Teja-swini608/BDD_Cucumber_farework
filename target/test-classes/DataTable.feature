Feature: Testing Contant List App

  Scenario: Testing Login Funcationaly with Datatable
    Given User is on Loginpage
    When User enters username & password
      | rushabha@gmail.com | Rushabha@123 |
    Then User clicks on submit button
    Then User verifies the title
    And User click on Sign up button
    Then User is entering personal info
      | First Name | Teju               |
      | Last Name  | desh               |
      | Email      | teju2003@gmail.com |
      | password   | Teju@123           |
  Then User click on Submit button