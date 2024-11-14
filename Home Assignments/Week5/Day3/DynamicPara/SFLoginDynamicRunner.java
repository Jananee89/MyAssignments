package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class SFLoginDynamicRunner {
	@CucumberOptions(features={"src/test/java/feature/SFLogin.feature","src/test/java/feature/SFLoginDynamic.feature"}, glue="step_definition",
			publish=true,monochrome=true,tags="not @smoke")
	public class RunnerClass extends AbstractTestNGCucumberTests{
		
	}

}
