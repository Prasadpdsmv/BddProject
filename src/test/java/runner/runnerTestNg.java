package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumberHtmlReport",
                "html:target/cucumberHtmlReport",     //  for html result
                "pretty:target/cucumber-json-report.json"   // for json result
        },
        features = "src/test/resources/Features",
        glue = {"org.hrmWebsiteStepdefinitions",   // predefined step definitions package
        },
        tags="@test2"

)
@Test
public class runnerTestNg extends AbstractTestNGCucumberTests {

}
