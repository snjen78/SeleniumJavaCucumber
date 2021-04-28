package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(   features = ".//Features//Example.feature",
                    glue= "stepDefinitions",
                    tags= "@run or @regression or @smoke",
                    dryRun = true,
                    monochrome = true,
                    plugin = { "pretty","json:target/cucumber.json"}

                )


public class TestRunner {

}
