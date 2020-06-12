Feature: hrms login

  @smoke
  Scenario: valid admin login
    When user enter valid admin "Admin" and "Hum@nhrm123"
    And user click on login button
    Then admin user is successfully logged in

  @smoke
  Scenario: valid ess user login
    When user enter valid ess "fakhardine" and "5915Syntax@@"
    And user click on login button
    Then ess user is successfully logged in

  @smoke
  Scenario: Login with invalid credentials
    When I enter invalid username and password and see error message
      | userName | passWord | errorMessage        |
      | hello    | Syntax   | Invalid Credentials |
      | BMW      | 591788MM | Invalid Credentials |
      | Roma14   | janawa77 | Invalid Credentials |
      | google45 | 8976llk  | Invalid Credentials |

  @smoke
  Scenario: login with invalid credentials from excels
  When  user Login with invalid credentials from excel "negativelogindata" excelsheet then user see "Invalid Credentials"
  
    
    
    
    
    
