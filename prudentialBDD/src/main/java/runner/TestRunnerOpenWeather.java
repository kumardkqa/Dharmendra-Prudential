package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:/workspace_Test/prudentialBDD/src/main/java/feature",
		glue = {"stepDefinitions"},
		//tags = {""},
		format = {"pretty", 
				"html:target/cucumber-reports/cucumber-pretty", 
				"json:target/cucumber-reports/CucumbeTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
				},
		monochrome = true,
		strict = true,
		dryRun = false,
		plugin = "json:target/cucumber-reports/CucumbeTestReport.json"
								
		
		)		

public class TestRunnerOpenWeather{
	

}
