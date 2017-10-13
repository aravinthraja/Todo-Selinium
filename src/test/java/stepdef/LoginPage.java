package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
  // public static WebDriver driver;

    @Given("^Just a failing scenario$")
    public void i_am_on_Home_Page_of()  {
        // Write code here that turns the phrase above into concrete actions
        //System.setProperty("webdriver.gecko.driver", "geckodriver");
        System.out.println("i am good");
    }

    @When("^I run a failing step$")
    public void i_enter_message_as()  {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.id("message")).sendKeys(arg1);
        System.out.println("i am good");
    }

    @When("^I found this$")
    public void i_found_this() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see success message$")
    public void i_see_success_message()  {
        // Write code here that turns the phrase above into concrete actions
        // String status = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/div")).getAttribute("class");
        System.out.println("i am good");
        //assert(true);

    }

}