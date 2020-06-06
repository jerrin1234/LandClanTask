package com.Pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.*;
import com.Constants.HomePageConstants;
import com.CucumberRunner.BaseClass;

public class HomePage extends BaseClass {
	    public void verifyHomePage() {
		Assert.assertEquals("Welcome", get.getElementText(HomePageConstants.WELCOMEMESSAGEELEMENT)); 
		}
		public void click_on_AddUser_Button() {
		action.clickOnElement(HomePageConstants.ADDUSERBUTTON);
		    }
		public void verify_Add_New_User_popup_window() {   
		Assert.assertEquals("Add New User", get.getElementText(HomePageConstants.ADDNEWUSERPOPUPWINDOWMESAGE));
		    }
		public void verify_the_new_user_added() {
		Assert.assertEquals("Selenium", get.getElementText(HomePageConstants.NEWUSERDETAILS));  
		}
		public void verify_new_user_country_code_should_appear_along_with_the_other_details() {
		Assert.assertEquals("TV", get.getElementText(HomePageConstants.COUNTRYCODEELEMENT));
		}
		public void click_Delete_Button_on_any_user() {
		action.clickOnElement(HomePageConstants.DELETEBUTTON);  
		}
		public void verify_dialog_box_appear() {
		Assert.assertEquals("Are you sure to delete selected record?", get.getElementText(HomePageConstants.DIALOGBOXMESSAGE)); 
		}
		public void click_Delete_Button_on_the_dialog_box() {
		action.clickOnElement(HomePageConstants.DIALOGBOXDELETEBUTTON); 
		}
		public void verify_user_deleted_from_the_user_list() throws Throwable {
		List<WebElement> rows = driver.findElements(HomePageConstants.ROWELEMNET);
		int actualSize= rows.size();
		int expectedSize=2;
		Assert.assertEquals(expectedSize, actualSize-1);
		
		}
		public void click_Edit_Button_on_the_user_profile() {
		action.clickOnElement(HomePageConstants.PRIMARYEDITBUTTON); 
		}
		public void verify_user_new_details_updated_on_the_selected_user_profile() {
		Assert.assertEquals("E6 3DP", get.getElementText(HomePageConstants.USERPOSTCODE)); 
		}


}
