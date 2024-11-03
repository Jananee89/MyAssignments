package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/login");
		//login
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click on contacts and merge contacts
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//get the parent window
	    String parentwindow = driver.getWindowHandle();
	    String pw=driver.getTitle();
	    System.out.println("Parent window :" +pw);
	    //click on the widget from contact
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img)[1]")).click();
		//store the details of the child windows in a Set and get it as list
		Set<String> wh=driver.getWindowHandles();
		List<String> whlist=new ArrayList<String>(wh);
		//switch to the 1st window in the list and get the title of child window
		driver.switchTo().window(whlist.get(1));
		String title1=driver.getTitle();
		System.out.println("Window title is : " +title1);
		//click on first result
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		//switch back to parent window
		driver.switchTo().window(parentwindow);
		//click on widget to contact and get the title of child window
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img)[2]")).click();
		//store the details of the child windows in a Set and get it as list
		Set<String> wh2=driver.getWindowHandles();
		List<String> whlist2=new ArrayList<String>(wh2);
		//switch to the 1st window in the list and get the title of child window
		driver.switchTo().window(whlist2.get(1));
		String title2=driver.getTitle();
		System.out.println("Window title is : " +title2);
		//click on second result
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		//switch back to parent window
		driver.switchTo().window(parentwindow);
		//click on mergre
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//switch to alert and print the text in alert box
		Alert al=driver.switchTo().alert();
		System.out.println("Alert text is: " +al.getText());
		//accept the alert
		al.accept();
		//get the title of current page and verify
		String tit=driver.getTitle();
		if(tit.equalsIgnoreCase(pw)) {
			System.out.println("Verified");
		}
		else {
			System.out.println("not verified");
		}

	}

}
