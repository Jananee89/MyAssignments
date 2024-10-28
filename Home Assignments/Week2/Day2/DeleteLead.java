package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//launch the url
		driver.get("http://leaftaps.com/opentaps/");
		//enter login details
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//leads tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//find using phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter area code and phone number
		driver.findElement(By.name("phoneAreaCode")).sendKeys("44");
		driver.findElement(By.name("phoneNumber")).sendKeys("9988776655");
		//click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//locate the lead id
		WebElement leadid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		//get the lead id text and print
		String lid=leadid.getText();
		System.out.println("Lead ID cpatured is " +lid);
		//select the lead id
		driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=14782\"])[2]")).click();
		
		//delete the lead id
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//verify the deleted lead id in find leads section
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//verification message for lead id deleted
		String norec=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(norec.equals("No records to display")) {
			System.out.println("Deletion success");
		}
		else{
			System.out.println("Deletion unsuccessful");
		}
	
		
	}

}
