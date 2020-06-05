package com.CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features" ,
        glue = {"com.StepDefinitions"},
        tags = {"@Smoke"},
        plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" }
		)

public class CucumberSmokePackRunner {

}
