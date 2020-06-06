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
	public void click_Delete_Button_on_any_user() {
		driver.findElement(By.cssSelector("#btnDelete")).click();   
	}
	public void verify_dialog_box_appear() {
		Assert.assertEquals("Are you sure to delete selected record?", driver.findElement(By.cssSelector(".modal-body label")).getText()); 
	}
	public void click_Delete_Button_on_the_dialog_box() {
		driver.findElement(By.cssSelector(".btn-secondary")).click();
	}
	public void verify_user_deleted_from_the_user_list() {
		String expectedValue = ("Mark");
		String actualValue = driver.findElement(By.cssSelector("#row_0_txtName")).getText(); 
		Assert.assertTrue("User details deleted",actualValue.contains(expectedValue));
	}
	public void click_Edit_Button_on_the_user_profile() {
		driver.findElement(By.cssSelector("#row_1 #btnEdit")).click();
	}
	
	public void verify_user_new_details_updated_on_the_selected_user_profile() {
		Assert.assertEquals("E6 3DP", driver.findElement(By.cssSelector("#row_1_txtPostCode")).getText()); 
	}
}
