package helpers;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// Here we are specifying the location of the feature files
// and plugins to generate report at the specific location

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {""},
        plugin = {"pretty","json:target/cucumber.json","html:target/report"},
        monochrome = true
)
public class TestRunner {
}