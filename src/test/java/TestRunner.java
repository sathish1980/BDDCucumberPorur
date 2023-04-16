import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/",
glue="stepdefenition",monochrome=true,publish=true,tags="~@Sanity")
public class TestRunner {

}