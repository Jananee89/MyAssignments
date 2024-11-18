package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerSFStatic {
	@CucumberOptions(features={"src/test/java/feature/SFEditStatic.feature"}, glue="step_definition",
			publish=true,monochrome=true)
	public class RunnerClass extends AbstractTestNGCucumberTests{
		
	}
}
