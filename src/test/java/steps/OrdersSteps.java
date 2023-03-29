package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("user should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   System.out.println("Background Given");
	}

	@When("user click on orders button")
	public void user_click_on_orders_button() {
		 System.out.println("Background when");
	}

	@Then("user should redirect to the orders page")
	public void user_should_redirect_to_the_orders_page() {
		 System.out.println("Background then");
	}

	@When("user click on the orderid")
	public void user_click_on_the_orderid() {
	   System.out.println("Scenario 1 when statement");
	}

	@Then("user should track the package")
	public void user_should_track_the_package() {
		  System.out.println("Scenario 1 then statement");
	}

	@When("user click on past order button")
	public void user_click_on_past_order_button() {
		  System.out.println("Scenario 2 when statement");
	}

	@Then("user should see the information")
	public void user_should_see_the_information() {
		  System.out.println("Scenario 2 then statement");
	}

}
