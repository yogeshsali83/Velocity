package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am common one")
	public void i_am_common_one() {
	    System.out.println("Precondition method");
	}
	
	@Given("User is at login page")
	public void preConditions() {
		System.out.println("Pre conditions got executed");
	}
	
	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String user) {
	   System.out.println("username is = "+ user);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
		System.out.println("username is = "+ pwd);
	}
	
	
	@When("User clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicking on login button");
	}
	
	@Then("User redirects to home page")
	public void validateLogin()
	{
		System.out.println("Validation of login");
	}
	
	@Then("page title should get display")
	public void page_title_should_get_display() {
	   System.out.println("Validating title of the page");
	}

	

}
