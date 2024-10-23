package week2.day2;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//select favorite browser
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		
		//verify unselect
		driver.findElement(By.xpath("(//label[text()='Chennai'])[1]")).click();
		WebElement unsel=driver.findElement(By.xpath("(//label[text()='Chennai'])[1]"));
		unsel.click();
		if(unsel.isSelected())
		{
			System.out.println("Radio button is still selected");
		}
		else
		{
			System.out.println("Radio button is unselected");
		}
		
		//identify default radio button
		Boolean chr = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option1']")).isSelected();
		System.out.println("CHR "+chr);
		Boolean ff = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option2']")).isSelected();
		System.out.println("FF "+ff);
		Boolean saf = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option3']")).isSelected();
		System.out.println("SAF " +saf);
		Boolean ed = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option4']")).isSelected();
		System.out.println("EDGE " +ed);
		if(chr==true)
		{
			System.out.println("Chorme is enabled by default " +chr);
		}
		else if(ff==true)
		{
			System.out.println("firefox is enabled by default " +ff);
		}
		else if(saf==true)
		{
			System.out.println("Safari is enabled by default " +saf);
		}
		else
		{
			System.out.println("Edge is enabled by default " +ed);
		}
		
		//check and select age group
		Boolean ag1 = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='1-20 Years']")).isSelected();
		Boolean ag2 = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='21-40 Years']")).isSelected();
		Boolean ag3 = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='41-60 Years']")).isSelected();
		
		if(ag1==true||ag2==true||ag3==true)
		{
			System.out.println("Age group is already selected");
			System.out.println("1-20" +ag1);
			System.out.println("21-40" +ag2);
			System.out.println("41-60" +ag3);
		}
		else
		{
			driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		}
		driver.close();
	}
		

}
