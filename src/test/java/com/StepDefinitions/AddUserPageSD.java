package com.StepDefinitions;
import com.CucumberRunner.BaseClass;
import cucumber.api.DataTable;
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


}
