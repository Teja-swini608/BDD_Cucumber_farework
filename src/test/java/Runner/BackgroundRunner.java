package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"Background.feature"},
		glue= {"Background.java"},
		
		dryRun=false,
		
		monochrome=true
		
		)



public class BackgroundRunner {

}
