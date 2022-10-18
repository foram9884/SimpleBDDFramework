package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\bhave\\IdeaProjects\\My Projects\\SimpleBDDFramework\\src\\test\\resources\\Feature\\Registration.feature",
        glue = {"StepDefinitions"}

)



public class TestRunner {
}
