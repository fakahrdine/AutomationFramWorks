package com.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//resources//features",

		glue = "com.hrms.steps",

		dryRun = false, monochrome = true, tags = { "@temp" }

)


public class TestRunner {

}
