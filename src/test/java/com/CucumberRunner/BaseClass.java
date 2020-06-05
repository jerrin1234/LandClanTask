package com.CucumberRunner;

import org.openqa.selenium.WebDriver;

import com.Pages.AddUserPage;
import com.Pages.HomePage;

public class BaseClass {
	public static WebDriver driver;
	public static HomePage homePage = new HomePage();
	public static AddUserPage addUserPage = new AddUserPage();
	
   
}
