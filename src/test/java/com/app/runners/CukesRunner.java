package com.app.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/reports/cucumber-report.html",
				"json:target/reports/cucumber.json"


		},
		tags = "@tag", 
		features = "src/test/resources/com/app/features/",
		glue = "com/app/step_definitions",
		dryRun = false,
		monochrome = true
		)
public class CukesRunner{

}
