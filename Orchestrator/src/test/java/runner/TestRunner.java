package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", dryRun = false, glue = { "stepDefinitions" },monochrome=true, plugin = {"pretty",
        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","json:target/cucumber-reports/cucumber.json" }
)


public class TestRunner {
}
