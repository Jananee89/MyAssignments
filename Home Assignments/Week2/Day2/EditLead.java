package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fname");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lname");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("ComputerScience");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		//select Newyork state
		WebElement st=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(st);
		state.selectByVisibleText("New York");
				
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//clear description
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		//update important notice
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("deleted desc");
		driver.findElement(By.className("smallSubmit")).click();
		//get title
		String title=driver.getTitle();
		System.out.println("The title of the page is: " +title);
		driver.quit();
		

	}

}
