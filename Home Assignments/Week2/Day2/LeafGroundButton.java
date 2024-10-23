package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//Verify that the title of the page is ‘dashboard.'
		String title=driver.getTitle();
		System.out.println("the current title is: " +title);
		if(title.equals("Dashboard"))
		{
			System.out.println("Web page title is verified");
		}
		else
		{
			System.out.println("Web page title is not verified");
		}
		driver.navigate().back();
		
		//button with the text ‘Confirm if the button is disabled’ is disabled
		WebElement buttonstatus=driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
		
		if(buttonstatus.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		//position of the button with the text ‘Submit'
		Point submitPosition=driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getLocation();
		System.out.println("Submit button position is: " +submitPosition);
		
		//background color of the button with the text ‘Find the Save button color.'
		String color=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println("Background color of button is: " +color);
		
		//height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size=driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right')]")).getSize();
		System.out.println("Size of the button is: " + " height: " +size.height + " width: " +size.width);
		driver.close();
		
		

		
	}

}
