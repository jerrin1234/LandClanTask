package com.Driver;

import org.openqa.selenium.By;

import com.CucumberRunner.BaseClass;

public class Get extends BaseClass {
  public String getElementText (By element) {
	 return driver.findElement(element).getText(); 
  }
 public String getCurrentURL() {
	return driver.getCurrentUrl();
 }
}
