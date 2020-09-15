package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"feature"},		
glue= {"com.facebook.stepDefination"},	
tags{"@Facebook"},
monochrome=true,dryRun=false
		)

public class TestRunner {

}
