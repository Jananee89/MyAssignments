package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Launch the browser
		driver.get("https://www.ajio.com/");
		
		//type bags for boys and select
		WebElement search=driver.findElement(By.name("searchVal"));
		search.sendKeys("Bags");
		search.sendKeys(Keys.ENTER);
		
		//select gender as men and category as fashion bags
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		Thread.sleep(3000);
		//print items found
		String itemscount=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(itemscount);
		//brand name and print in list
		List<WebElement> brand=driver.findElements(By.xpath("//div[@class='brand']"));	
		int size=brand.size();
		System.out.println("Size of list: "+size);
		List<String> bname=	new ArrayList<String>();
		for(WebElement i:brand) {
			String bn=i.getText();
			bname.add(bn);
		}
		System.out.println(bname);
		
		//bag name and print in list
		List<WebElement> bag=driver.findElements(By.xpath("//div[@class='nameCls']"));	
		List<String> bagname=	new ArrayList<String>();
		for(WebElement i:bag) {
			String bgname=i.getText();
			bagname.add(bgname);
		}
		System.out.println(bagname);
	}

}
