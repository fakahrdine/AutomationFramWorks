@searchEmployee @Spring13
Feature: Employee Search

  Background: 
    Given user is logged in with valid admin credentails
    And user navigate to emoloyee list page

  @regression
  Scenario: Search employee by
    When user enters valid employee id "10317"
    And clicks on search botton
    Then user see employee information is displayed

  @regression
  Scenario: Search employee by name
    When user enters valid employee name "Farid Aryob"
    And clicks on search botton
    Then user see employee information is displayed
