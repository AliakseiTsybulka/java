package com.orangehrm.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	
	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
		System.out.println("I am on Google page");
	}

	@When("I type search item")
	public void i_type_search_item() {
		System.out.println("I search for an item");
	}

	@When("I click on the google search button")
	public void i_click_on_the_google_search_button() {
	    System.out.println("Clicked search button");
	}

	@Then("I see search results are displayed")
	public void i_see_search_results_are_displayed() {
	    System.out.println("results are displayed");
	}
}