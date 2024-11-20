package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod{

	@Test
	public void runLog() {
		LoginPage lg=new LoginPage(driver);
		//method chaining
		lg.enterUsername().enterPassword().clickLogin();
		
	}
}
