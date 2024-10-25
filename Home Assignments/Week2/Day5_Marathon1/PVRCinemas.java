package week2.day5.marathon1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Launch the browser
		driver.get("https://www.pvrcinemas.com/");
		
		//Get the city selected
		String city=driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).getText();
		System.out.println(city);
		
		//Check if city is Chennai
		if(city.equals("Chennai")) {
			System.out.println("City selected is Chennai");
		}
		else 
		{
			driver.findElement(By.className("p-dropdown-label p-inputtext p-placeholder")).click();
			
			//select Chennai
			driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
			System.out.println("City is selected now as Chennai");			
		}
		
		//Select Cinema under quick book
		driver.findElement(By.xpath("(//div[@class='date-show']/span)[2]")).click();
		
				
		//Select Cinema
		driver.findElement(By.xpath("((//span[contains(text(),'Cinema')])/parent::div)[2]")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		//Select date as tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//Select movie
		driver.findElement(By.xpath("(//span[text()='BLACK'])[2]")).click();
		
		//Select showtime
		driver.findElement(By.xpath("//span[text()='07:20 PM']")).click();
		
		//Book button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Accept
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//Select seat
		WebElement seat =driver.findElement(By.xpath("(//span[text()='8'])[6]"));
		String seatno=seat.getText();
		seat.click();
		System.out.println(seatno);
		
		
		
		//Click on proceed
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		
		//print seatno
		String seatinfo=driver.findElement(By.xpath("//p[text()='F8']")).getText();
		System.out.println("Selected seat no is: " +seatinfo);
		
		//Grand total
		String grandtotal= driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println("Grand total is: " +grandtotal);

		//click on proceed
		driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
		
		//close popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//pagetitle
		String title=driver.getTitle();
		System.out.println("Page title is: " +title);
		
		driver.close();
		
	}

}
