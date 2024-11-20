package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccountPage selectAccountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
		return new CreateAccountPage(driver);
	
	}
}
