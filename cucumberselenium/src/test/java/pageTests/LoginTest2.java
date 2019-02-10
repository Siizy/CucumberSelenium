package pageTests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest2 {

	@Given("^User is on login CRM page$")
	public void user_is_on_login_page()  {
		System.out.println("User is on login CRM page");	   
	}

}
