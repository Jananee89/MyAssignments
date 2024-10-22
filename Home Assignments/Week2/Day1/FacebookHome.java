package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.linkText("https://www.facebook.com/r.php")).click();
		WebElement wb1=driver.findElement(By.xpath("//a[text()='Create new account']"));
		wb1.click();
		driver.findElement(By.name("firstname")).sendKeys("fname");
		driver.findElement(By.name("lastname")).sendKeys("lname");
		driver.findElement(By.name("reg_email__")).sendKeys("9988776655");
		driver.findElement(By.id("password_step_input")).sendKeys("pswd123!");
		WebElement day=driver.findElement(By.id("day"));
		Select sd=new Select(day);
		sd.selectByVisibleText("30");
		
		WebElement month=driver.findElement(By.id("month"));
		Select sm=new Select(month);
		sm.selectByVisibleText("Dec");
		
		WebElement year=driver.findElement(By.id("year"));
		Select sy=new Select(year);
		sy.selectByVisibleText("1989");
		
		//WebElement radio1=driver.findElement(By.id("sex"));
		WebElement radio1=driver.findElement(By.xpath("//input[@value='2']"));
		radio1.click();
		//driver.quit();
	}

}
