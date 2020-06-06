package com.StepDefinitions;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

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
		homePage.verify_new_user_country_code_should_appear_along_with_the_other_details(); 
	}
	@When("^I click 'Delete Button' on any user$")
	public void i_click_Delete_Button_on_any_user() throws Throwable {
		homePage.click_Delete_Button_on_any_user();
	}
	@Then("^The authentication popup window should appear$")
	public void the_authentication_popup_window_should_appear() throws Throwable {
		homePage.verify_authentication_popup_window_appear();
	}

	@Then("^I click 'Delete Button' on the authentication window$")
	public void i_click_Delete_Button_on_the_authentication_window() throws Throwable {
		homePage.click_on_Delete_Button_on_the_authentication_window();
	}

	@Then("^User details should delete from the user list$")
	public void user_details_should_delete_from_the_user_list() throws Throwable {
		homePage.verify_user_deleted_from_the_user_list();
    } 
    
	






}
