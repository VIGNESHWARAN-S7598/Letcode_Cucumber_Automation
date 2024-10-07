package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/svign/IdeaProjects/Cucumber_Automation/src/main/java/Features",
        glue = {"StepDefinitions","Hooks"},
        tags = "@Execute",
        plugin ={"html:report/WebReport.html"}


       )
public class Letcode_Runner {


}
