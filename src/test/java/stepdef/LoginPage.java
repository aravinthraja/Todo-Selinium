package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class LoginPage {
  // public static WebDriver driver;

    public static WebDriver driver;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        System.out.println("launching firefox browser");
//
//        System.setProperty("webdriver.gecko.driver", "./geckodriver");
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        FirefoxOptions options = new FirefoxOptions();
//
//        options.addPreference("log", "{level: trace}");
//
//        capabilities.setCapability("marionette", true);
//        capabilities.setCapability("moz:firefoxOptions", options);
//
//        driver = new FirefoxDriver(capabilities);

        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "./geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
         driver = new FirefoxDriver(firefoxOptions);
        if(driver!=null)
            driver.navigate().to("https://my.setmore.com");

          //  driver.close();
        //}
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("http://www.store.demoqa.com");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
       // driver.navigate().to("https://my.setmore.com");
        System.out.println("Login Page");
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_UserName_and_Password(String username, String password) throws Throwable {

        System.out.println("user_enters_"+username+"_and_"+password);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.className("signin_btn")).click();

    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {

        System.out.println("Login message_displayed_Login_Successfully");
        WebDriverWait wait = new WebDriverWait(driver, 160);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("upgrade_btn")));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(title);
        Assert.assertEquals(title,"Setmore Calendar");
        System.out.println("Login message_displayed_Login_Successfully");
        //driver.close();
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
        System.out.println("user_LogOut_from_the_Application Successfully");
        if(driver != null) {
            driver.findElement(By.id("account_menu")).click();
            WebElement we = driver.findElement(By.id("sign_out"));
                    if(we != null){
                        //WebElement w = we.findElement(By.tagName("a"));
                        WebDriverWait wait = new WebDriverWait(driver, 160);
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a"))).click();
                    }
                    else{
                        System.out.println("No we");
                    }

        }
        else{
            System.out.println("No dridever");
        }


    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("LogOut Successfully 2");
        driver.close();
    }

}