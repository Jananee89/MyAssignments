package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public void enterUsername ()  {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
	}
	
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
