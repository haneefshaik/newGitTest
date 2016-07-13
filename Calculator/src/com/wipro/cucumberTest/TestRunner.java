package com.wipro.cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"com.wipro.stepDefinition"}
		)

public class TestRunner {

}
