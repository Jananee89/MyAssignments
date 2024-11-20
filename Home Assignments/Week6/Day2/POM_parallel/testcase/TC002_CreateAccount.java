package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC002_CreateAccount extends ProjectSpecificMethod{

	@Test
	public void runCreateAcc() throws InterruptedException {
		LoginPage lg=new LoginPage(driver);
		//method chaining
		lg.enterUsername().enterPassword().clickLogin().clickCrmsfa().selectAccountsTab().createAccount().viewacc();
		
	}
}
