package com.hrms.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/features/APIFeaturs",

		glue = "com/hrms/API/steps/practice",

		
		dryRun = false, monochrome = true,
		tags = "@Workflow"
		
   
  ,plugin = {
		"pretty",
		 "html:target/cucumber-default-report",
		  "json:target/cucumber.json"
		  
  }

)

public class ApiWorkFlowRunner {

}
