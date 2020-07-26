$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/APIFeaturs/ApiWorkFlow.feature");
formatter.feature({
  "name": "Syntax HRMS API End to END WorkFlow",
  "description": "  Description :this feature tests verifies Synatax Hrms web services \n  the workflow consistes of the followingg sequesntal calls",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.TokenGenerationSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create an employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Workflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create an employee",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.ApiWorkFlowAllSteps.a_request_is_prepared_to_create_an_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a Post call is made to create an employee",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.ApiWorkFlowAllSteps.a_Post_ca_is_made_to_create_an_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code for creating is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.ApiWorkFlowAllSteps.the_status_code_for_creating_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is created and response contains key \"Message\" and value \"Entry Created\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.ApiWorkFlowAllSteps.the_employee_is_created_and_response_contains_key_and_value(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee ID \"Employee[0].employee_id\" is stored as a global variable to be used fo other calls",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.steps.practice.ApiWorkFlowAllSteps.employee_ID_is_stored_as_a_global_variable_to_be_used_fo_other_calls(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});