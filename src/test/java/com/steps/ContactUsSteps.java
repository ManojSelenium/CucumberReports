package com.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {

	@Before
	public void before() {
		System.out.println("################");
		System.out.println("***************");
	}
	
	
	@When("^user click on contact us$")
	public void clickContactUs() {
		System.out.println("Contact Us Clicked");
	}
	
	@Then("^user should see contact us page$")
	public void contactUsPageDisplayed() {
		System.out.println("Contact US page Displayed");
	}
}
