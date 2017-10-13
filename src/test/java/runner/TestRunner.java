package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aravinth on 11/10/17.
 */
@CucumberOptions(features = {"src/test/resources/features"},glue = {"src/test/java/stepdef"},format = {"pretty", "html:target/cucumber"})
@RunWith(Cucumber.class)
public class TestRunner {
}
