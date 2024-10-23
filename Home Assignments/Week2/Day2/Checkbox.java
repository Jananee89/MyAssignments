package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on basic checkbox
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		//notification checkbox
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		//verify checked message
		String ajaxtooltip=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("text from tooltip: " +ajaxtooltip);
		if(ajaxtooltip.equals("Checked"))
		{
		
		System.out.println("Ajax checkbox is selected");
	}
		else
		{
			System.out.println("Ajax checkbox is not selected");	
		}
		
		//tri-state checkbox
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div/div/div/div[2]")).click();
		
		//toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//verify toggle checked message
		String toggleswitchtooltip=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("text from tooltip for toggleswitch: " +toggleswitchtooltip);
		if(toggleswitchtooltip.equals("Checked"))
		{
		
		System.out.println("Toogle switch  is selected");
	}
		else
		{
			System.out.println("Toggle switch is not selected");	
		}
		
		//Disabled checkbox
		WebElement verifyDisable=driver.findElement(By.xpath("//input[@disabled='disabled']"));
		
		
		if(verifyDisable.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		//multiple select check box
		WebElement selectMultiple=driver.findElement(By.xpath("//ul[@data-label='Cities']"));
		selectMultiple.click();
		driver.findElement(By.xpath("//li[1]/label")).click();
		String c1=driver.findElement(By.xpath("//li[1]/label")).getText();
		System.out.println("c1 " +c1);
		driver.findElement(By.xpath("//li[2]/label")).click();
		String c2=driver.findElement(By.xpath("//li[2]/label")).getText();
		System.out.println("c2 " +c2);
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		//verify multiple select
		if(c1.equals("Miami"))
		{
			System.out.println("Miami is selected in multiple select");
		}
		else
		{
			System.out.println("Miami didnot get selected");
		}
		
		if(c2.equals("London"))
		{
			System.out.println("London is selected in multiple select");
		}
		else
		{
			System.out.println("London didnot get selected");
		}
		
		driver.close();
}
}