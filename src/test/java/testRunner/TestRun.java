package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
				(
						
				features=".//Features/MyAccountChangePwd.feature",
				glue="stepDefinitions",
				dryRun=true,
				monochrome=true,
				plugin= {"pretty","html:test-output","html:target/cucumber-reports"},
				publish = true,
				tags = ""
				
				)



public class TestRun {

}
