package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/java/Features",
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json" },
glue={"src/test/java/Steps"})
public class TestRunner {
}
