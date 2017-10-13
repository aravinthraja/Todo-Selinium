package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aravinth on 11/10/17.
 */
@CucumberOptions(features = {"src/test/resources/features"},glue = {"src/test/java/stepdef"}, plugin = { "html:build/cucumber-html-report",
        "junit:build/cucumber-junit.xml",
        "json:build/cucumber.json",
        "pretty:build/cucumber-pretty.txt",
        "usage:build/cucumber-usage.json"
})
@RunWith(Cucumber.class)
public class TestRunner {
}
