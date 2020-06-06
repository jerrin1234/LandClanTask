package com.Constants;

import org.openqa.selenium.By;

public interface AddUserConstants {
	By NAMETEXTBOX = By.cssSelector("#txtName");
	By SURNAMETEXTBOX = By.cssSelector("#txtSurname");
	By ADDRESSTEXTBOX = By.cssSelector("#txtAddress");
	By POSTCODETEXTBOX = By.cssSelector("#txtPostCode");
	By CITYTEXTBOX = By.cssSelector("#txtCity");
	By COUNTRYDROPDOWN = By.cssSelector("#ddlCountry");
    By SAVEBUTTON = By.cssSelector("#btnSave");
	By DEFAULTCOUNTRYTEXT = By.cssSelector("option[value='225: Object']");
}
