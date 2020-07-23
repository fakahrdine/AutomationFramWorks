Feature: Name Validations Ui Against Db

  @Regression
  Scenario: First Name Validations agians Db
    When user enter valid admin "Admin" and "Hum@nhrm123"
    And user click on login button
    And user navigate to emoloyee list page
    When user enters valid employee id "14595"
    And clicks on search botton
    Then verify table is displayed
    And get firstname from table
    When get firstname from database
    Then validate firstname from UI against db
