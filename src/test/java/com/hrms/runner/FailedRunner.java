package com.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "@target"
				+ "/failed.text",
		
		glue = "com/hrms/steps", 
		
		monochrome = true,

		plugin = { "pretty",

				"html:target/cucumber-default-report"

		}

)

public class FailedRunner {

}
