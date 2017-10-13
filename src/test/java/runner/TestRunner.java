package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import stepdef.LoginPage;

/**
 * Created by aravinth on 11/10/17.
 */
@RunWith(Cucumber.class)

@CucumberOptions(  monochrome = true,
        tags = "@tags",
        features = "src/test/resources/features/",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "step.def" )
public class TestRunner {

}
