package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import base.BaseClass;
import base.Hooks;
import commonFunctions.contactManagment;

public class CreateContact  extends BaseClass {

	public static boolean headless = true;	
	
	@Given("^user login to salesforce application$")
	public void user_login_to_salesforce_application() throws Throwable {
		
		Hooks.LoginSalesforce();
	}
	
	
	

	@When("^user navigate to create contact page and create contact \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_navigate_to_create_contact_page_and_create_contact(String FirstName, String LastName, String EmailId, String PhoneNo) throws Throwable {
	    contactManagment.createContact(FirstName, LastName, EmailId, PhoneNo);
	}
	
}
