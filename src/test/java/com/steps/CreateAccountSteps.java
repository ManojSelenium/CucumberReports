package com.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountSteps {

	
	@Given("^user is on home page$")
	public void userOnHomePage() {
		System.out.println("User is on Home Page");
	}
	
	@When("^user click on signin$")
	public void clickSignin() {
		System.out.println("User Clicked SignIn Link");
	}
	
	@Then("^user should see login page$")
	public void loginPageDisplayed() {
		System.out.println("Login Page Displayed");
	}
	
	@Given("^user launch the browser$")
	public void launchBrowser() {
		System.out.println("*********************");
	}
	
	@And("^user click on edit button$")
	public void clickEditButton() {
		System.out.println("Click on Edit Button");
	}
}
