package com.Pages;
import java.util.Map;
import org.junit.Assert;
import com.Constants.AddUserConstants;
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
    action.updateElement(AddUserConstants.NAMETEXTBOX, nameValue);
    action.updateElement(AddUserConstants.SURNAMETEXTBOX, surnameValue);
    action.updateElement(AddUserConstants.ADDRESSTEXTBOX, addressValue);
    action.updateElement(AddUserConstants.POSTCODETEXTBOX, postcodevalue);
    action.updateElement(AddUserConstants.CITYTEXTBOX, cityVALUE);
    action.dropeDown(AddUserConstants.COUNTRYDROPDOWN, 226);
    
}
    public void click_on_save_Button() {
	action.clickOnElement(AddUserConstants.SAVEBUTTON);
}

    public void verify_United_Kingdom_selected_as_default() {
	Assert.assertEquals("United Kingdom", get.getElementText(AddUserConstants.DEFAULTCOUNTRYTEXT)); 
}
    public void select_country() {
	action.dropeDown(AddUserConstants.COUNTRYDROPDOWN, 220); 
}
    public void change_the_address_of_the_user(DataTable addressDetails) {
	Map<String,String> newAddress = addressDetails.asMap(String.class, String.class);
	String addressValue = newAddress.get("Address");
	String postcodevalue = newAddress.get("Post Code");
	action.updateElement(AddUserConstants.ADDRESSTEXTBOX, addressValue);
	action.updateElement(AddUserConstants.POSTCODETEXTBOX, postcodevalue);
}

}
