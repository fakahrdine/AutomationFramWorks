
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
