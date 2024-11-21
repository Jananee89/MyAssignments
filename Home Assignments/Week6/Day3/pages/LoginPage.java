package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	

	@Given ("enter the username as {string}")
	public LoginPage enterUsername (String uName)  {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	@Given ("enter the password as {string}")
	public LoginPage enterPassword(String pswd) {
		getDriver().findElement(By.id("password")).sendKeys(pswd);	
		return this;
	}
	@When ("click on login")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new 	WelcomePage();
	}
}
