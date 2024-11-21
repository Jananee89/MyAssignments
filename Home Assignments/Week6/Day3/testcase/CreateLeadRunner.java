package testcase;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class CreateLeadRunner {
	@CucumberOptions(features="src/main/java/feature/TC002.feature",
			glue={"pages"},
			publish=true,
			monochrome=true)
	public class RunnerCucumber extends ProjectSpecificMethod {

	}
}
