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

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		//Men'sfashion
		WebElement mfash=driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Actions mf=new Actions(driver);
		mf.moveToElement(mfash).perform();
		
		//Sports shoes
		driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]")).click();
		
		//get count of sports shoes
		String shoecount=driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Shoe count is: " +shoecount);
		
		//select training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//sort low to high
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		Thread.sleep(3000);
		
		//verify sorted correctly
		String pr1=driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
		System.out.println("price1: " +pr1);
		String upr1=pr1.replace("Rs. ", "");
		int price1=Integer.parseInt(upr1);
		
		String pr2=driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
		System.out.println("price2: " +pr2);
		String upr2=pr2.replace("Rs. ", "");
		int price2=Integer.parseInt(upr2);
		
		if(price1<price2) {
			System.out.println("Sorted correctly from low to high");
		}
		
		else {
			System.out.println("Not sorted correctly");
		}
		
		
		//set min and max range
		WebElement minval = driver.findElement(By.name("fromVal"));
		minval.clear();
		String minv="500";
		minval.sendKeys(minv);
		WebElement maxval = driver.findElement(By.name("toVal"));
		maxval.clear();
		String maxv="2000";
		maxval.sendKeys(maxv);
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(2000);
		//select colour
		WebElement colour1=driver.findElement(By.xpath("//span[@class='filter-color-tile White&Blue ']"));
		Actions col=new Actions(driver);
		col.scrollToElement(colour1).perform();
		String c1=colour1.getText();
		driver.findElement(By.xpath("//span[contains(@class,'filter-color-tile White&Blue')]")).click();
			
		
		//verify if filters are applied correctly
		String filter1=driver.findElement(By.xpath("(//a[text()='Rs. 500 - Rs. 2000'])[1]")).getText();
		if(filter1.contains(minv)&&filter1.contains(maxv))
		{
			System.out.println("Price filter applied correctly");
		}
		else
		{
			System.out.println("Price filter is not correct");
		}
		
		String filter2=driver.findElement(By.xpath("(//a[text()='White & Blue'])[1]")).getText();
		if(filter2.contains(c1))
		{
			System.out.println("Colour filter applied correctly");
		}
		else
		{
			System.out.println("Colour filter is not correct");
		}
		
		//mouse hover on first result
		WebElement fshoe=driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		Actions mh=new Actions(driver);
		mh.moveToElement(fshoe).perform();
		
		//select quick view
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		
		Thread.sleep(2000);			
			
		//cost			
		String cost=driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Cost is :" +cost);
		
		//discount
		String dis=driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText();
		System.out.println("Discount is :" +dis);
		
		//screenshot
		TakesScreenshot st=(TakesScreenshot)driver;
		File screenshotAs = st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\Jananee\\Testleaf\\Documents\\Week4\\Day5\\Marathon\\ScreenShotsnapdeal.png"));
		
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		driver.close();
		
		
		
	}
	

}
