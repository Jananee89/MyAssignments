package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceAccountStep {
	public ChromeDriver driver;
	@Given("login to salesforce url")
	public void login_to_salesforce_url() {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
	}

	@Given("enter username vidyar@testleaf.com")
	public void enter_username_vidyar_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}

	@Given("enter password Sales@{int}")
	public void enter_password_sales(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Sales@123");
	}

	@Given("click login button")
	public void click_login_button() {
		driver.findElement(By.id("Login")).click();;
	}

	@Given("select menu button from left corner")
	public void select_menu_button_from_left_corner() {
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Given("click view all")
	public void click_view_all() {
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@Given("click on sales from App launcher")
	public void click_on_sales_from_app_launcher() throws InterruptedException {
	   driver.findElement(By.xpath("//p[text()='Sales']")).click();
	   Thread.sleep(3000);
	   System.out.println("Clicked on sales---");
	   
	}

	@Given("click on accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
	    WebElement acc=driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
	    Thread.sleep(3000);
	    //JavascriptExecutor executor = (JavascriptExecutor)driver;
	    driver.executeScript("arguments[0].click();", acc);
	    System.out.println("Clicked on Accounts---");
	}

	@Given("click on New button")
	public void click_on_new_button() {
		
	   driver.findElement(By.xpath("//div[text()='New']")).click();
	    
	  
	}

	@Given("enter your name as account name")
	public void enter_your_name_as_account_name() {
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Jack");
	}

	@Given("select Ownership as public")
	public void select_ownership_as_public() {
		
		WebElement none=driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		driver.executeScript("arguments[0].click();" ,none);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("click on save")
	public void click_on_save() throws InterruptedException {
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	    Thread.sleep(3000);
	}

	@Then("verify account name")
	public void verify_account_name() {
	    String accName=driver.findElement(By.xpath("//lightning-formatted-text[contains(text(),'Jack')]")).getText();
	    System.out.println("Account name created is: " +accName);
	    if(accName.equalsIgnoreCase("Jack")) {
	    	System.out.println("Account name verified successfully");
	    }
	    else {
	    	System.out.println("Account name not verified");
	    }
	    driver.close();
	}

	
}
