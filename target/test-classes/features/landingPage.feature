
Feature: landing page user interface

   @Regression
  Scenario: User should see the main menu taps
    When user enter valid admin "Admin" and "Hum@nhrm123"
    And user click on login button
    Then user should see the diffrent main menu taps
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashbaord | Directory |
