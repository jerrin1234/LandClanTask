package com.StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import com.CucumberRunner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
String BaseURL = "https://www.superdry.com/";

@Before
public void start() {
	System.setProperty("http://localhost:8080/testcase/", "/Users/jerrinkottavilarajan/Documents/LandClanLtd/LandClanTask/src/test/resources/Drivers/chromedriver");
	 driver = new ChromeDriver();
	 driver.get(BaseURL);
	 driver.manage().window().maximize();
	 driver.manage().getCookies();
}

@After
public void close() {
	driver.close();
}

}
