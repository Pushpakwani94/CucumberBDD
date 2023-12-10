package com.pom.stepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "D:\\RestAssured\\RestAssured\\CucumberWithBDD\\Feature\\login.feature",
   //path of step definition file
	dryRun = false,
	glue = "com.pom.stepDef",
	monochrome = true,
	tags="@smoke"
       
 
 
   )

public class TestRunnerFile {
	

}
