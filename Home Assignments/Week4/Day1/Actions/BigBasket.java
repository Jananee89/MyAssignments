package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com");
		
		//shop by category
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Thread.sleep(3000);
		//mouse over Foodgrains, Oil & Masala
		WebElement food=driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions fd=new Actions(driver);
		fd.moveToElement(food).perform();
	
		//mouse over Rice & Rice Products
		WebElement rice=driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		Actions ri=new Actions(driver);
		ri.moveToElement(rice).perform();
		
		//select Boiled & Steam Rice
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		Thread.sleep(3000);
		//select bbroyal
		WebElement bb=driver.findElement(By.id("i-BBRoyal"));
		Actions bbroyal=new Actions(driver);
		bbroyal.moveToElement(bb).perform();
		bb.click();
		
		Thread.sleep(3000);
		//select Tamil Ponni Boiled Rice
		WebElement ponni=driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		Actions po=new Actions(driver);
		po.moveToElement(ponni).perform();
		ponni.click();
		
		//switch to new window
		Set<String> wh=driver.getWindowHandles();
		List<String> whlist=new ArrayList<String>(wh);
		
		
		//switch to the 1st window in the list and get the title of child window
		driver.switchTo().window(whlist.get(1));
		Thread.sleep(3000);
		String title1=driver.getTitle();
		System.out.println("Window title is : " +title1);
		
		//select 5kg bag
		WebElement weight=driver.findElement(By.xpath("//span[text()='5 kg']"));
		
		Actions kg=new Actions(driver);
		kg.scrollToElement(weight).perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(weight));
		weight.click();
		
		//note the price
		String price=driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[5]")).getText();
		
		
		//add to cart
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		
		//verify success message
		String success=driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println("item added to cart message: " +success);
		if(success.contains("An item has been added to your basket successfully"))
		{
			System.out.println("Item added to cart successfully");
		}
		else {
			System.out.println("Item not added");
		
		}
		
		//screenshot
		TakesScreenshot st=(TakesScreenshot)driver;
		File screenshotAs = st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\Jananee\\Testleaf\\Documents\\Week4\\Day5\\Marathon\\ScreenShotbigbasket.png"));
		
					
		//close current window
		driver.close();
		
		//close main window
		driver.switchTo().window(whlist.get(0));
		driver.close();
		
	}

}
