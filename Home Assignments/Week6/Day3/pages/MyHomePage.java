package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;

public class MyHomePage extends ProjectSpecificMethod {
	


	
	@And ("click on leads link")
	public MyLeads clickLeadsTab() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeads();
	}
	
}
