package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aravinth on 11/10/17.
 */
@CucumberOptions(features = {"src/test/resources/features"},glue = {"src/test/java/stepdef"}, plugin = { "html:target/cucumber-html-report",
        "junit:target/cucumber-junit.xml",
        "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json"
})
@RunWith(Cucumber.class)
public class TestRunner {
}
