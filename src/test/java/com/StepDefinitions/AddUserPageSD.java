package com.StepDefinitions;
import com.CucumberRunner.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddUserPageSD extends BaseClass {
	@When("^I enter all valid credentials $")
	public void i_enter_all_valid_credentials(DataTable newUserDetailsTable) throws Throwable {
		addUserPage.enter_all_valid_credentials(newUserDetailsTable); 
	}

	@When("^I click on 'save Button'$")
	public void i_click_on_save_Button() throws Throwable {
		addUserPage.click_on_save_Button(); 
	}
	@Given("^I am in 'add new user' page$")
	public void i_am_in_add_new_user_page() throws Throwable {
		homePage.verifyHomePage();
		homePage.click_on_AddUser_Button();
		homePage.verify_Add_New_User_popup_window();
	}

	@Then("^I should see 'United Kingdom' selected as default$")
	public void i_should_see_United_Kingdom_selected_as_default() throws Throwable {
		addUserPage.verify_United_Kingdom_selected_as_default(); 
	}

	@When("^I select country$")
	public void i_select_country() throws Throwable {
		addUserPage.select_country();
	}
	@When("^I change the address of the user$")
	public void i_change_the_address_of_the_user(DataTable addressDetails) throws Throwable {
		addUserPage.change_the_address_of_the_user(addressDetails);	
	}
	



}
