package com.pom.stepDef;

import org.junit.runner.manipulation.Ordering.Context;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDef {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("hello");
		
	}
	@Given("some other precondition")
	public void some_other_precondition() {
		
	}
	@When("I complete action")
	public void i_complete_action() {
	   
	}
	@When("some other action")
	public void some_other_action() {
	   
	}
	@When("yet another action")
	public void yet_another_action() {
	  
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
	  
	}
	
	


}
