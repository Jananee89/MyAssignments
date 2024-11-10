package wek4.day5.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");
		
		//Login with valid credentials username as admin and password 

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		Thread.sleep(5000);
		//handle shadow root elements
		Shadow sh=new Shadow(driver);
		
		//Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator
		sh.findElementByXPath("//div[text()='All']").click();
		
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		
		

		//switch to iframe
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		//Click on  mobiles and Select Apple iphone13pro 
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		
		//Choose yes option in lost or broken iPhone, enter the mobile number
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("998776655");
		
		//Select Unlimited from the dropdown in Monthly data allowance
		WebElement sel=driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select op=new Select(sel);
		op.selectByValue("unlimited");
		
		//Update color field to SierraBlue and storage field to 512GB

		driver.findElement(By.xpath("//label[contains(text(),'Sierra Blue')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'512 GB')]")).click();
		
		//Click on Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
		//Verify order is placed 
		String ordertxt=driver.findElement(By.xpath("//span[contains(text(),'your request has been submitted')]")).getText();
		if(ordertxt.contains("your request has been submitted")) {
			System.out.println("Order placed successfully");
		}
		else {
			System.out.println("Order not placed");
		}
		
		//copy the request number
		String reqid=driver.findElement(By.id("requesturl")).getText();
		System.out.println("Request id is: " +reqid);
		
		//Take a Snapshot of order placed page
		TakesScreenshot st=(TakesScreenshot)driver;
		File screenshotAs = st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\Jananee\\Testleaf\\Documents\\Week4\\Day5\\Marathon\\ScreenShotmobile.png"));
		
		driver.close();
		
	}

}
