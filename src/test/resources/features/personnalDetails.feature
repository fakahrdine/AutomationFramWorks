#Author: your.email@your.domain.com
Feature: view personnal details feature

@Regression
  Scenario Outline: Admin user able to v edit and add all the personnal detals
    Given user logged in into HRMS
    And user is navigated to Add Employee Page
    When user enters employees first "<firstName>" and last "<MiddlName>" and "<LastName>"
    And user clicks save button
    When user add personnal employee details from "personnalDetails" execl sheet

    Examples: 
      | firstName | MiddlName | LastName |
      | Nora      | Karboch   | Noraa    |
      | Hamid     | oghlu     | karazan  |
      | Ahmed     | anwar     | Mohamed  |
      | chakir    | bro       | fakar    |
