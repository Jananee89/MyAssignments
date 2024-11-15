package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class LeadsRunner {
	@CucumberOptions(features="src/test/java/feature/Leads.feature",
			glue={"step_definition", "hooksimplementation"},
			publish=true,
			monochrome=true)
	public class RunnerCucumber extends AbstractTestNGCucumberTests {

	}
}
