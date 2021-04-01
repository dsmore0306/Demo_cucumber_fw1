package com.automatopm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="classpath:features",
		glue="com.automatiom.stepdef",
		tags="@Test1",
		plugin= {"pretty",
				"html:target/html/htmlreport.html",
				"json:target/json/file.json",
		},
		publish=true,
		dryRun=false

		)


public class TestRunner {

}
