package com.StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.CucumberRunner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
String BaseURL = "http://localhost:8080/testcase/";

@Before
public void start() {
	System.setProperty("webdriver.chrome.driver", "/Users/jerrinkottavilarajan/Documents/LandClanLtd/LandClanTask/src/test/resources/Drivers/chromedriver");
	 driver = new ChromeDriver();
	 driver.get(BaseURL);
	 driver.manage().window().maximize();
	 driver.manage().getCookies();
}

@After
public void destroy() {
	driver.close();
}

}
