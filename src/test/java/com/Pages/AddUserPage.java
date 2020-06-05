package com.Pages;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.CucumberRunner.BaseClass;
import cucumber.api.DataTable;

public class AddUserPage extends BaseClass {
public void enter_all_valid_credentials(DataTable newUserDetailsTable) {
	Map<String,String> newUserDetails = newUserDetailsTable.asMap(String.class, String.class);
	String nameValue = newUserDetails.get("Name");
	String surnameValue = newUserDetails.get("Surname");
	String addressValue = newUserDetails.get("Address");
	String postcodevalue = newUserDetails.get("Post Code");
    String cityVALUE = newUserDetails.get("City");
    driver.findElement(By.cssSelector("#txtName")).clear();
    driver.findElement(By.cssSelector("#txtName")).sendKeys(nameValue);
    driver.findElement(By.cssSelector("#txtSurname")).clear();
    driver.findElement(By.cssSelector("#txtSurname")).sendKeys(surnameValue);
    driver.findElement(By.cssSelector("#txtAddress")).clear();
    driver.findElement(By.cssSelector("#txtAddress")).sendKeys(addressValue);
    driver.findElement(By.cssSelector("#txtPostCode")).clear();
    driver.findElement(By.cssSelector("#txtPostCode")).sendKeys(postcodevalue);
    driver.findElement(By.cssSelector("#txtCity")).clear();
    driver.findElement(By.cssSelector("#txtCity")).sendKeys(cityVALUE);
    Select countryDropDdown = new Select(driver.findElement(By.cssSelector("#ddlCountry")));
    countryDropDdown.selectByIndex(226);
}
public void click_on_save_Button() {
	driver.findElement(By.cssSelector("#btnSave")).click();
}

public void verify_United_Kingdom_selected_as_default() {
	Assert.assertEquals("United Kingdom", driver.findElement(By.cssSelector("option[value='225: Object']")).getText()); 
}
public void select_country() {
	 Select countryDropDdown = new Select(driver.findElement(By.cssSelector("#ddlCountry")));
	 countryDropDdown.selectByIndex(220);
}
}
