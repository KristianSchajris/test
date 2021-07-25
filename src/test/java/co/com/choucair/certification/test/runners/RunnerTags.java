package co.com.choucair.certification.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resource/feature/demo.feature",
        tags = "@tag1",
        glue = "co.com.choucair.certification.test",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
