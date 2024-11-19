package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod {

	public void myaccount() {
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
	}
	
}
