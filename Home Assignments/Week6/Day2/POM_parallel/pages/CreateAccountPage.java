package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod{
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewAccountPage createAccount() throws InterruptedException {
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("SeleniumTest819");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		return new ViewAccountPage(driver);
		
		

	}

}
