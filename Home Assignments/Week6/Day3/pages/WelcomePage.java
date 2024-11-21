package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethod{
	

	@When ("click on crmsfa link")
	public MyHomePage clickCrmsfa() {
	getDriver().findElement(By.linkText("CRM/SFA")).click();
	return new MyHomePage();
	}
	
}
