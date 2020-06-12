$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addEmployee.feature");
formatter.feature({
  "name": "Hrms add emplyee functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.user_is_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add new employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees first \"Redonne\" and last \"Omiirre\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.user_enters_employees_first_name_and_last_name(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027firstName\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-J49C07QH\u0027, ip: \u0027172.20.10.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Mohamed\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:61019}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 183ff46daf343ae3c1f3a929e139573f\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027firstName\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.clear(Unknown Source)\r\n\tat com.hrms.utils.CommonFunctions.sendText(CommonFunctions.java:33)\r\n\tat com.hrms.steps.AddEmployeeSteps.user_enters_employees_first_name_and_last_name(AddEmployeeSteps.java:27)\r\n\tat ✽.user enters employees first \"Redonne\" and last \"Omiirre\"(file:///C:/Users/Mohamed/eclipse-workspace/HRMSCUCEMBER/src/test/resources/features/addEmployee.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.employee_is_added_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/hrmsLogin.feature");
formatter.feature({
  "name": "hrms login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "valid admin login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid admin \"Admin\" and \"Hum@nhrm123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enter_valid_admin_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin user is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.admin_user_is_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "valid ess user login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid ess \"fakhardine\" and \"5915Syntax@@\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enter_valid_ess_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ess user is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.ess_user_is_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid username and password and see error message",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.i_enter_invalid_username_and_password_and_see_error_message(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following 4 assertions failed:\r\n1) expected:\u003c\"Invalid [C]redentials\"\u003e but was:\u003c\"Invalid [c]redentials\"\u003e\r\n2) expected:\u003c\"Invalid [C]redentials\"\u003e but was:\u003c\"Invalid [c]redentials\"\u003e\r\n3) expected:\u003c\"Invalid [C]redentials\"\u003e but was:\u003c\"Invalid [c]redentials\"\u003e\r\n4) expected:\u003c\"Invalid [C]redentials\"\u003e but was:\u003c\"Invalid [c]redentials\"\u003e\r\n\r\n\tat org.assertj.core.error.AssertionErrorCreator.multipleSoftAssertionsError(AssertionErrorCreator.java:75)\r\n\tat org.assertj.core.api.AbstractSoftAssertions.assertAll(AbstractSoftAssertions.java:37)\r\n\tat com.hrms.steps.LoginSteps.i_enter_invalid_username_and_password_and_see_error_message(LoginSteps.java:76)\r\n\tat ✽.I enter invalid username and password and see error message(file:///C:/Users/Mohamed/eclipse-workspace/HRMSCUCEMBER/src/test/resources/features/hrmsLogin.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "login with invalid credentials from excels",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user Login with invalid credentials from excel \"negativelogindata\" excelsheet then user see \"Invalid Credentials\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_Login_with_invalid_credentials_from_excel_excelsheet_then_user_see_the_erro_msg(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.assertj.core.api.SoftAssertionError: \r\nThe following assertion failed:\r\n1) expected:\u003c\"Invalid [C]redentials\"\u003e but was:\u003c\"Invalid [c]redentials\"\u003e\r\n\r\n\tat org.assertj.core.error.AssertionErrorCreator.multipleSoftAssertionsError(AssertionErrorCreator.java:75)\r\n\tat org.assertj.core.api.AbstractSoftAssertions.assertAll(AbstractSoftAssertions.java:37)\r\n\tat com.hrms.steps.LoginSteps.user_Login_with_invalid_credentials_from_excel_excelsheet_then_user_see_the_erro_msg(LoginSteps.java:98)\r\n\tat ✽.user Login with invalid credentials from excel \"negativelogindata\" excelsheet then user see \"Invalid Credentials\"(file:///C:/Users/Mohamed/eclipse-workspace/HRMSCUCEMBER/src/test/resources/features/hrmsLogin.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});