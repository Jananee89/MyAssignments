package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement accname1=driver.findElement(By.id("accountName"));
		String acstr="SeleniumTest12";
		accname1.sendKeys(acstr);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement el1=driver.findElement(By.name("industryEnumId"));
		Select sel1=new Select(el1);
		sel1.selectByIndex(3);
		WebElement el2=driver.findElement(By.name("ownershipEnumId"));
		Select sel2=new Select(el2);
		sel2.selectByVisibleText("S-Corporation");
		WebElement el3=driver.findElement(By.id("dataSourceId"));
		Select sel3=new Select(el3);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement el4=driver.findElement(By.id("marketingCampaignId"));
		Select sel4=new Select(el4);
		sel4.selectByIndex(6);
		WebElement el5=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel5=new Select(el5);
		sel5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println("the current title is: " +title);
		
		String accname=driver.findElement(By.xpath("//span[contains(text(),'SeleniumTest12')]")).getText();
		
		System.out.println("Account name is:" +accname);
		if(accname.contains(acstr))
			
		{
			System.out.println("Account name is displayed correctly");
		}
		else
		{
			System.out.println("Account name is displayed incorrectly");
		}
		driver.quit();
		
		
		
		
		
		
		
		
		}

}
