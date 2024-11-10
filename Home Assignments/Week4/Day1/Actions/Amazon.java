package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 10 pro",Keys.ENTER);
		//price
		String price=driver.findElement(By.xpath("//span[@class='a-price-whole'] [1]")).getText();
		System.out.println("Product price: " +price);
		
		//rating
		String rating=driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println("Product rating: " +rating);
		
	
		
		//first link
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/div)[1]")).click();
		//switch to new window
		Set<String> wh=driver.getWindowHandles();
		List<String> whlist=new ArrayList<String>(wh);
		//switch to the 1st window in the list and get the title of child window
		driver.switchTo().window(whlist.get(1));
		Thread.sleep(3000);
		String title1=driver.getTitle();
		System.out.println("Window title is : " +title1);
	
		
		//add to cart
		
		WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		
		//scroll to add to cart button and click
		Actions a=new Actions(driver);
		a.scrollToElement(addToCart).perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addToCart.click();
		
		
		//add explicit wait of checkout page for contents to load
		WebElement close = driver.findElement(By.id("attach-close_sideSheet-link"));
		WebElement proceed=driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		WebElement pro = wait.until(ExpectedConditions.visibilityOf(proceed));
		
		if(pro.isDisplayed()) {
			//subtotal
			String subtotal=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
			System.out.println(subtotal);
			//removing ₹ and converting back to string
			String[] tot=subtotal.split("₹");
			String t= String.join("", tot);
			//removing decimals 00
			String finalprice=t.replace(".00", "");
			
			System.out.println(finalprice);
			//verify  cart subtotal
			if(price.equals(finalprice)) {
				System.out.println("Subtotal is correct");
				close.click();
				
			}	
			else {
				System.out.println("Item not added to cart");
			}
		}
		
		
		driver.close();
		
		
		
		
		
				
	}

}
