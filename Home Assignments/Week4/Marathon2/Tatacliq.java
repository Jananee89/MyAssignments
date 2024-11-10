package wek4.day5.marathon2;

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

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();
		
		//mouse hover on Brands
		WebElement brands=driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions bmh=new Actions(driver);
		bmh.moveToElement(brands).perform();
		
		//mouse hover on watches and accessories
		WebElement watches=driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions wmh=new Actions(driver);
		wmh.moveToElement(watches).perform();
		
		//click on first option in featured brands
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		//sort by new arrivals
		driver.findElement(By.className("SelectBoxDesktop__base")).click();
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		
		//choose categories as men
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		Thread.sleep(3000);
		
		//create list to get watch prices
		List<WebElement> watchlist=driver.findElements(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)"));
		
		//list size
		int size=watchlist.size();
		System.out.println(size);
		
		
		//print watch prices by getting from list
		for(int i=0;i<size;i++) {
			String price=watchlist.get(i).getText();
			System.out.println("List of watch prices" +i);
			System.out.println(price);
			
		}
		
		
		//getting price 1
		String watchPrice1=watchlist.get(0).getText();
		System.out.println("Watch price is:------ " +watchPrice1);
		
		//first watch result
		driver.findElement(By.className("ProductModule__base")).click();
		
		//get windows and switch driver to new window
		Set<String> wh=driver.getWindowHandles();
		List<String> whlist=new ArrayList<String>(wh);
		//switch to the 1st window in the list and get the title of child window
		driver.switchTo().window(whlist.get(1));
		Thread.sleep(3000);
		
		//get window title
		String title1=driver.getTitle();
		System.out.println("Window title is : " +title1);
		
		//Add to bag
		WebElement addToBag =driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		addToBag.click();
		
		
		//getting price 2
		String watchPrice2=driver.findElement(By.className("ProductDetailsMainCard__price")).getText();
		System.out.println("Watch price after adding to cart is: ------ " +watchPrice2);
		
		//validate prices
		if(watchPrice2.contains(watchPrice1)){
			System.out.println("Prices verified");
		}
		else {
			System.out.println("Prices din't match");
		}
		
		//get cart count
		String cartCount=driver.findElement(By.className("DesktopHeader__cartCount")).getText();
		System.out.println("Cart count is: " +cartCount);		

		//click on cart icon
		driver.findElement(By.className("DesktopHeader__cartCount")).click();
		
		Thread.sleep(2000);
		
		//Screenshot
		TakesScreenshot st=(TakesScreenshot)driver;
		File screenshotAs = st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\Jananee\\Testleaf\\Documents\\Week4\\Day5\\Marathon\\ScreenShot.png"));
		
		//Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(whlist.get(0));
		driver.close();
		
	}

}

