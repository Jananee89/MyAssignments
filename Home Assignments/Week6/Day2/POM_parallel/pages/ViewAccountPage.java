package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod {
	
	public ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewAccountPage viewacc() {
		
		
		String title=driver.getTitle();
		System.out.println("the current title is: " +title);
		if(title.equals("Account Details | opentaps CRM"))
		{
			System.out.println("view account details page title is verified");
		}
		else
		{
			System.out.println("view account details page title is not verified");
		}
		
		return this;
	}
	

}
