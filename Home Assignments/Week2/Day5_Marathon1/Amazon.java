package week2.day5.marathon1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Launch the browser
		driver.get("https://www.amazon.in/");
		
		//type bags for boys and select
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Bags for boys");
		search.sendKeys(Keys.ENTER);

		//print no:of results
		String results=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("total number of results is: " +results);
		
		//select first two brands
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		Thread.sleep(3000);
		
		//select sort by newest arrivals
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		//choose newest arrivals
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		Thread.sleep(3000);
		//Bag details
		String bag=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).getText();
		System.out.println("Bag info is: " +bag);
		//price
		String disprice=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Discounted Price is: " +disprice);
		//pagetitle
		String pagetitle=driver.getTitle();
		System.out.println("Page title is: " +pagetitle);
		driver.close();
	}

}
