package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod {
	
	public void viewacc() {
		
		
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
	}
	

}
