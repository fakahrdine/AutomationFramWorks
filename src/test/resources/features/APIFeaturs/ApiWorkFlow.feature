Feature: Syntax HRMS API End to END WorkFlow
  
  Description :this feature tests verifies Synatax Hrms web services 
  the workflow consistes of the followingg sequesntal calls

  Background: 
    Given a JWT is generated

  @Workflow
  Scenario: Create an employee
    Given a request is prepared to create an employee
    When a Post call is made to create an employee
    Then the status code for creating is 201
    And the employee is created and response contains key "Message" and value "Entry Created"
    And employee ID "Employee[0].employee_id" is stored as a global variable to be used fo other calls

  Scenario: Retrieving created employee
    Given a request is prepared to retriev the created employee
    When a Get call is made to retrieve the created employee
    Then the status code for retrieving the created employee is 200
    And the retrieved employee Id at "employee[0].employee_id" matches the globally stored employee Id
    And the retrieved data matches the data used to create an employee
