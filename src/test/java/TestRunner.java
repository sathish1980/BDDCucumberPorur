import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature/Sample.feature",
glue="stepdefenition",monochrome=true,publish=true,tags="@MakeMyTrip")
public class TestRunner {

}