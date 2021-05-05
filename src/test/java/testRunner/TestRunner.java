package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(   features = ".//Features//Example.feature",
                    // if running parallel test- set path to features folder not feature file
                    glue= "stepDefinitions",
                    tags= "@run or @regression or @smoke",
                    dryRun = false,
                    monochrome = true,
                    plugin = { "pretty","json:target/cucumber.json"}

                )


public class TestRunner {

}
