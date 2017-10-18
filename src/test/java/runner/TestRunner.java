package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import stepdef.LoginPage;

/**
 * Created by aravinth on 11/10/17.
 */

@CucumberOptions(features = {"src/test/resources/features"},
        glue = "stepdef" ,
        plugin = { "html:target/cucumber-html-report",
        "junit:target/cucumber-junit.xml",
        "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json"
})
public class TestRunner extends AbstractTestNGCucumberTests {

}
