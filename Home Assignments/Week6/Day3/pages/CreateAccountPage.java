package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod{
	
	

	public CreateAccountPage createAccount()  {
		getDriver().findElement(By.linkText("Accounts")).click();
		getDriver().findElement(By.linkText("Create Account")).click();
		return this;
	}
	
	public CreateAccountPage accName(String accName) {
		getDriver().findElement(By.id("accountName")).sendKeys(accName);
		return this;
	}
	
	public CreateAccountPage desc(String desc) {
		getDriver().findElement(By.name("description")).sendKeys(desc);
		return this;
	}
	
	public CreateAccountPage emp(String emp) {
		getDriver().findElement(By.id("numberEmployees")).sendKeys(emp);
		return this;
	}
	
	public CreateAccountPage off(String off) {
		getDriver().findElement(By.id("officeSiteName")).sendKeys(off);
		return this;
	}
	
	public CreateAccountPage submit() {
		getDriver().findElement(By.className("smallSubmit")).click();
		return this;
	}
	
		
		

	}


