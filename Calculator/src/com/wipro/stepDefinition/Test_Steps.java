package com.wipro.stepDefinition;

import com.wipro.main.Calculator;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test_Steps {
	private int a;
	private int b;
	private int actual;

@Given("^two numbers (\\d+) and (\\d+)$")
public void two_numbers_and(int arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("first argument is " + arg1);
	System.out.println("second argument is " + arg2);
	this.a = arg1;
	this.b = arg2;
}

@When("^i add the above two numbers$")
public void i_add_the_above_two_numbers() throws Throwable {	
	Calculator calculator = new Calculator();
	
	actual = calculator.add(a,b);
    // Write code here that turns the phrase above into concrete actions

}

@Then("^result should be (\\d+)$")
public void result_should_be(int arg1) throws Throwable {
	Assert.assertTrue("validaton is successful", arg1==actual);
	
    // Write code here that turns the phrase above into concrete actions

}

@When("^i subtract the above two numbers$")
public void i_subtract_the_above_two_numbers() throws Throwable {
   
	Calculator calculator =new Calculator();
	actual=calculator.sub(a,b);
	
	// Write code here that turns the phrase above into concrete actions

}

@When("^i multiplay the above two numbers$")
public void i_multiplay_the_above_two_numbers() throws Throwable {
	Calculator Calculator =new Calculator();
	actual=Calculator.multiply(a,b);
	
	// Write code here that turns the phrase above into concrete actions
   
}



}
