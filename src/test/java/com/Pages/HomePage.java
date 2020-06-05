package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.CucumberRunner.BaseClass;

public class HomePage extends BaseClass {
	public void verifyHomePage() {
		Assert.assertEquals("Welcome", driver.findElement(By.cssSelector(".toolbar span")).getText()); 
	}
public void click_on_AddUser_Button() {
	 driver.findElement(By.cssSelector("#btnAdd")).click();
}
public void verify_Add_New_User_popup_window() {
	Assert.assertEquals("Add New User", driver.findElement(By.cssSelector(".modal-title")).getText()); 
}
	public void verify_the_new_user_added() {
		Assert.assertEquals("Selenium", driver.findElement(By.cssSelector("#row_3_txtSurname")).getText());  
	}
	
	public void verify_new_user_country_code_should_appear_along_with_the_other_details() {
		Assert.assertEquals("TV", driver.findElement(By.cssSelector("#row_3_txtCountry")).getText());
	}
}
