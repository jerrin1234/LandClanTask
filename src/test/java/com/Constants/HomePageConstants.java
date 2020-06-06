package com.Constants;

import org.openqa.selenium.By;

public interface HomePageConstants {
	  By WELCOMEMESSAGEELEMENT = By.cssSelector(".toolbar span");
	  By ADDUSERBUTTON = By.cssSelector("#btnAdd");
	  By ADDNEWUSERPOPUPWINDOWMESAGE = By.cssSelector(".modal-title");
	  By NEWUSERDETAILS = By.cssSelector("#row_3_txtSurname");
	  By COUNTRYCODEELEMENT = By.cssSelector("#row_3_txtCountry");
	  By DELETEBUTTON = By.cssSelector("#btnDelete");
	  By DIALOGBOXMESSAGE = By.cssSelector(".modal-body label");
	  By DIALOGBOXDELETEBUTTON = By.cssSelector(".btn-secondary");
	  By USERNAME = By.cssSelector("#row_0_txtName");
	  By PRIMARYEDITBUTTON = By.cssSelector("#row_1 #btnEdit");
	  By USERPOSTCODE = By.cssSelector("#row_1_txtPostCode");
	  By ROWELEMNET = By.cssSelector("[id='lisTable'] tr"); 

}
