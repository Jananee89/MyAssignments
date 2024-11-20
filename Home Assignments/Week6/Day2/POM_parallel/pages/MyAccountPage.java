package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod {

	public MyAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyAccountPage myaccount() {
	driver.findElement(By.xpath("//a[contains(text(),'My Teams')]")).click();
	String title=driver.getTitle();
	System.out.println("the current title is: " +title);
	if(title.equals("Accounts | opentaps CRM"))
	{
		System.out.println("myaccounts page title is verified");
	}
	else
	{
		System.out.println("myaccounts page title is not verified");
	}
	return this;
	}
	
	
}
