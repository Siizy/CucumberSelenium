package pageTests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	@Given("^User is on login page$")
	public void user_is_on_login_page() {
	    System.out.println("user_is_on_login_page");	    
	}

	@When("^User types username and password$")
	public void user_types_username_and_password()  {
	    System.out.println("user_types_username_and_password");
	}

	@Then("^user should land to Homepage$")
	public void user_should_land_to_Homepage()  {
		System.out.println("user_should_land_to_Homepage");  
	}
}
