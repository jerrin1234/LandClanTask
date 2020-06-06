package com.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.CucumberRunner.BaseClass;

public class Action extends BaseClass {
	
	public void clickOnElement(By element) {
	driver.findElement(element).click();
		
	}
   public void updateElement(By element,String value) {
	driver.findElement(element).clear();		  
	driver.findElement(element).sendKeys(value);
}
   public void dropeDown(By element, int index) {
	Select sizeDropDown =new Select(driver.findElement(element));
	sizeDropDown.selectByIndex(index); 
   }
   

}
