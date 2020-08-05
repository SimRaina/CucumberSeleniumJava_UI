package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
	
	@Before
    public void setUp()
    {
        System.out.println("Launching Browser");
        System.out.println("Login into  Application");
    }

    @After
    public void tearDown()
    {
        System.out.println("Browser Closed");
    }

    
    @Given("user is on add customer page")
    public void user_is_on_add_customer_page() {
        System.out.println("User is on add customer page");

    }

    @When("user fills the customer details")
    public void user_fills_the_customer_details() {
        System.out.println("User fills the customer details");
    }

    @Then("customer is added")
    public void customer_is_added() {
        System.out.println("customer is added");
    }

    @Given("user is on edit customer page")
    public void user_is_on_edit_customer_page() {
        System.out.println("user is on edit customer page");
    }

    @When("user edits the contact details")
    public void user_edits_the_contact_details() {
        System.out.println("user edits the contact details");
    }

    @Then("contact details updated")
    public void contact_details_updated() {
        System.out.println("contact details updated");
    }

    @Given("user is on delete customer page")
    public void user_is_on_delete_customer_page() {

    }

    @When("user delete the customer")
    public void user_delete_the_customer() {
        System.out.println("user is on delete customer page");
    }

    @Then("customer deleted")
    public void customer_deleted() {
        System.out.println("customer deleted");
    }
}