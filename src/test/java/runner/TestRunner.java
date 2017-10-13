package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import stepdef.LoginPage;

/**
 * Created by aravinth on 11/10/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        plugin = { "html:target/cucumber-html-report",
        "junit:target/cucumber-junit.xml",
        "json:arget/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json"
})
public class TestRunner {

}
