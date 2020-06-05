package com.StepDefinitions;
import com.CucumberRunner.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSD extends BaseClass{
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
		homePage.verifyHomePage();
	}

	@When("^I click on 'AddUser' Button$")
	public void i_click_on_AddUser_Button() throws Throwable {
		homePage.click_on_AddUser_Button();
	}
	@When("^I should see the 'Add New User' popup window$")
	public void i_should_see_the_Add_New_User_popup_window() throws Throwable {
		homePage.verify_Add_New_User_popup_window();
	}
	
	@Then("^The new user should add$")
	public void the_new_user_should_add() throws Throwable {
		homePage.verify_the_new_user_added();
	}
	@Then("^The new user country code should appear along with the other details$")
	public void the_new_user_country_code_should_appear_along_with_the_other_details() throws Throwable {
		 
	}


}
