package com.mmt.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
					features= {"C:\\Users\\hp\\eclipse-workspace\\BDDMakeMyTrip\\src\\main\\resources\\feature\\MakeMyTrip.feature"},
					glue= {"com.mmt.stepdefinition"},
					plugin = {"html:reports/","pretty"}
		
		)

public class TestRunner {

}
