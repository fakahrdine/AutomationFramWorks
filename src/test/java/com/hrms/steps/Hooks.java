package com.hrms.steps;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before

	public void start() {

		BaseClass.setUP();

	}

	@After

	public void end(Scenario scenario) {
		// senario will hold the information about your scenarios
		byte[] pic;
		if (scenario.isFailed()) {

			pic = CommonMethods.takeScreenShot("failed//" + scenario.getName());

		} else {
			pic = CommonMethods.takeScreenShot("passed//" + scenario.getName());

		}
		scenario.attach(pic, "img//png", scenario.getName());

		BaseClass.tearDown();

	}

}
