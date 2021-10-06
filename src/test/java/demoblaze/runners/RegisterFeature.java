package demoblaze.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/demoblaze.feature",
        glue = "demoblaze.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@RegressionTest"
        )


public class RegisterFeature {

}
