package step_definition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LeadsSD extends BaseClass{
	
	
	
	

	//create lead
	@And("click on createlink lead")
	public void click_on_createlink_lead() {
		System.out.println("Executing create lead----");
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("enter the company name as (.*)$")
	public void enter_the_company_name_as_testleaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("enter the firstname as (.*)$")
	public void enter_the_firstname_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("enter the last name (.*)$")
	public void enter_the_last_name_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);  
	}
	
	@Given("enter phone number (.*)$")
			public void enter_phone_number(String phno) {
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);  
			}
			

	@When("click on the create lead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead created");
	}
	
	
	//edit lead
	@And("click on find leads link")
	public void click_on_find_leads_link() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@And("click on phone tab")
	public void click_on_phone_tab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@And("enter the phone number as (.*)$")
	public void enter_the_phone_number_as(String ph) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}

	@And("click on find leads")
	public void click_on_find_leads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@And("select the resulting lead")
	public void select_the_resulting_lead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@And("click on edit")
	public void click_on_edit() {
		System.out.println("Executing edit lead-----");
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("update the company name to (.*)$")
	public void update_the_company_name_to_infosys(String comp) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(comp);
	}

	@When("click on update button")
	public void click_on_update_button() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead updated");
	}

	
	//delete
	@And("click on delete")
	public void click_on_delete() {
		System.out.println("Executiing delete lead----");
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Lead deleted");
	}

	
	

}
