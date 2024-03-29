package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				glue="com.steps",
				format = { "pretty",
			    "json:target/cucumber.json" }, tags = { "~@ignore" })
public class RunnerTest {

}
