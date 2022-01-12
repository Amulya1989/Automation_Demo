package stepdefinations;

import base.BaseClass;
import base.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class CreatePromo extends BaseClass {
	
	public static boolean headless = true;
	
	
	@Given("^User Login to CMS application$")
	public void user_Login_to_CMS_application() throws Throwable {
	    Hooks.LoginCMS();
	    throw new PendingException();
	}

}
