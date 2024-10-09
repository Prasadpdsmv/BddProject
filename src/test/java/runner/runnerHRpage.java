package runner;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
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

public class runnerHRpage {

}
