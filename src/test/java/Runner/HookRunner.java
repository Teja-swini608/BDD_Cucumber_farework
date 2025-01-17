package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"Hook.feature"},
		glue= {"Hook.java"},
		
		dryRun=false,
		
		monochrome=true
		
		)

public class HookRunner {

}
