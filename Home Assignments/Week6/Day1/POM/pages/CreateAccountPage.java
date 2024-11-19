package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod{
	
	public void createAccount() throws InterruptedException {
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("SeleniumTest89");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		
		

	}

}
