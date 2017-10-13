package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by aravinth on 14/10/17.
 */
public class CreateAccount {

    @Given("^i am good$")
    public void i_am_good() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i am good");
    }

    @When("^i am bad")
    public void i_am_bad() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i am good");
    }

    @Then("^i see fast$")
    public void i_see_fast() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i am good");
    }
}
