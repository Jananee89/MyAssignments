package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Login extends BaseClass {
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver=new ChromeDriver();
	   
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("Load the url")
	public void load_the_url()  {
		 driver.get("http://leaftaps.com/opentaps/control/main");
	
	}
	
	@Given("enter the username as {string}")
	public void enter_the_username_as(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@Given("enter the password as {string}")
	public void enter_the_password_as(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@Then("click on login")
	public void click_on_login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	}
	
	@Then("Welcome page is displayed")
	public void welcome_page_is_displayed() {
		
	    String welcome=driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
	    if(welcome.contains("Welcome")) {
	    	System.out.println("Login is successful");
	    }
	    else {
	    	System.out.println("Login unsuccessful");
	    }
	    
	}
	
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@But("Welcome page is not displayed")
	public void welcome_page_is_not_displayed() {
		String welcome=driver.findElement(By.xpath("//p[contains(text(),'following error occurred during login')]")).getText();
	    if(welcome.contains("error occured during login")) {
	    	System.out.println("Login is successful");
	    }
	    else {
	    	System.out.println("Login unsuccessful");
	    }
	    
}
}
