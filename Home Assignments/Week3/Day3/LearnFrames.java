package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//swtich to alert and accept the prompt
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		String txt=	driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println("txt displayed after accepting alert :" +txt);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to alert and dismiss the prompt
		Alert al2=driver.switchTo().alert();
		System.out.println(al2.getText());
		al.dismiss();
		String txt2=	driver.findElement(By.xpath("//p[text()='You pressed Cancel!']")).getText();
		System.out.println("txt displayed after cancelling alert :" +txt2);
		
		
		
		
	}
	

}
