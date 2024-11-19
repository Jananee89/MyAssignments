package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public void selectAccountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
	}
}
