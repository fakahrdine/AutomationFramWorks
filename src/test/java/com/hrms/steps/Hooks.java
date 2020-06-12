package com.hrms.steps;

import org.openqa.selenium.interactions.SendKeysAction;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonFunctions;

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

			pic = CommonFunctions.takeScreenShot("failed//" + scenario.getName());

		} else {
			pic = CommonFunctions.takeScreenShot("passed//" + scenario.getName());

		}
		scenario.attach(pic, "img//png", scenario.getName());

		BaseClass.tearDown();

	}

}
