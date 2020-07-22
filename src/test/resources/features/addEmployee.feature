#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)--
#Sample Feature Definition Template
Feature: Hrms add emplyee functionality

  Background: 
    Given user logged in into HRMS
    And user is navigated to Add Employee Page

  @smoke
  Scenario: add new employee
    When user enters employees first "Redonne" and last "Omiirre"
    And user clicks save button
    Then employee is added successfully

  @Regression
  Scenario: add employee without id
    When user enters employees first "Rahmaa" and last "Morrocoo"
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

  @Regression
  Scenario: Add Employee and create Login Credentials
    When user enters employees first "Fernando" and last "Alberta"
    And user clicks on create login checkbox
    And user enters login credentials "ZZhoney04" , "9a6CXwkqKyC3B0@@"
    And user clicks save button
    Then employee is added successfully

  @Regression
  Scenario Outline: add multiple new employees
    When user enters employees first "<firstName>" and last "<MiddlName>" and "<LastName>"
    And user clicks save button
    Then employee is added successfully

    Examples: 
      | firstName | MiddlName | LastName |
      | Nora      | Karboch   | Noraa    |
      | Hamid     | oghlu     | karazan  |
      | Ahmed     | anwar     | Mohamed  |
      | chakir    | bro       | fakar    |
