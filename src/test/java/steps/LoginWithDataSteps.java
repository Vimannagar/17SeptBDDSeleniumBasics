package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("user should be at the login screen")
	public void user_should_be_at_the_login_screen() {
	   System.out.println("given statement");
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	  System.out.println("when statement for username and value is "+uname); 
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
		System.out.println("when statement for password and value is "+pwd);
	}

	@When("user click on  {int} login button")
	public void user_click_on_login_button(Integer int1) {
	   System.out.println("When statement for login button and value is"+ int1);
	}

	@Then("user should get logged in")
	public void user_should_get_logged_in() {
	   System.out.println("then statement");
	}

}
