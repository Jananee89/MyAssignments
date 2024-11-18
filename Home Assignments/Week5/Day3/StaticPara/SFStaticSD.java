package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SFStaticSD extends SFBaseClass{

	@Given("enter username as {string}")
	public void enter_username_as_vidyar_testleaf_com(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
		
	}

	@And("enter password as {string}")
	public void enter_password_as_sales(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@And("Search for the account using unique account name {string}")
	public void search_for_the_account_using_unique_account_name(String acname) {
	    driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(acname);
	    driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(Keys.ENTER);
	    System.out.println("Entered unique account name in search");
	    
	}

	@And("Click the dropdown icon next to the account and select Edit")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() throws InterruptedException {
		
	    WebElement edit=driver.findElement(By.xpath("(//a[@data-refid='recordId'])[1]"));
	    driver.executeScript("arguments[0].click();" ,edit);
	    Thread.sleep(3000);
	    WebElement dd=driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border-filled fix-slds-button_icon-border-filled slds-button_last'])[1]"));
	    driver.executeScript("arguments[0].click();" ,dd);
	    System.out.println("Clicked on dropdown");
	    
	    driver.findElement(By.xpath("//span[text()='Edit']")).click();
	    System.out.println("Clicked on edit");
	}

	@And("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
	    WebElement tp=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[2]"));
	    driver.executeScript("arguments[0].click();" ,tp);
	    driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	    System.out.println("updated type");
	}

	@And("Set Industry to Healthcare")
	public void set_industry_to_healthcare() {
		WebElement ind=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[4]"));
		 driver.executeScript("arguments[0].click();" ,ind);
		WebElement hc=driver.findElement(By.xpath("//span[text()='Healthcare']"));
		Actions a1=new Actions(driver);
		a1.scrollToElement(hc).perform();
		hc.click();
		System.out.println("updated industry");
	}

	@And("Enter the Billing Address {string}")
	public void enter_the_billing_address(String badd) {
	    WebElement btext=driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]"));
	    Actions bill=new Actions(driver);
	    bill.scrollToElement(btext).perform();
	    btext.clear();
	    btext.sendKeys(badd);
	    System.out.println("updated billing address");
	}

	@And("Enter the Shipping Address {string}")
	public void enter_the_shipping_address(String sadd) {
		WebElement stext=driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		stext.clear();
		stext.sendKeys(sadd);
		System.out.println("updated shipping address");
	}

	@And("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
		WebElement cp=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[5]"));
		driver.executeScript("arguments[0].click();" ,cp);
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		System.out.println("updated customer priority");
	}

	@And("Set SLA to Silver")
	public void set_sla_to_silver() {
		WebElement sla=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[6]"));
		driver.executeScript("arguments[0].click();" ,sla);
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		System.out.println("updated SLA");
	}

	@And("Set Active to NO")
	public void set_active_to_no() {
		WebElement act=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[8]"));
		driver.executeScript("arguments[0].click();" ,act);
		driver.findElement(By.xpath("//span[text()='No']")).click();
		System.out.println("updated set active");
	}

	@And("Enter a unique number in the Phone field {string}")
	public void enter_a_unique_number_in_the_phone_field(String pnum) {
		WebElement ph=driver.findElement(By.xpath("//input[@name='Phone']"));
		Actions p=new Actions(driver);
		p.scrollToElement(ph).perform();
		ph.clear();
		ph.sendKeys(pnum);
		System.out.println("updated ph number");
	}

	@And("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
	    WebElement up=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[7]"));
	    driver.executeScript("arguments[0].click();" ,up);
	    driver.findElement(By.xpath("//span[text()='No']")).click();
	    System.out.println("updated upsell");
	}

	@And("Click Save")
	public void click_save() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	    Thread.sleep(3000);
	}

	@And("verify the phone number")
	public void verify_the_phone_number() {
	    String ph=driver.findElement(By.xpath("//p[text()='Phone']/following-sibling::p")).getText();
	    System.out.println(ph);
	    if(ph.isBlank()) {
	    	System.out.println("ph no is not verified");
	}
	    else {
	    	System.out.println("ph no is verified");
	    }
	}

}
