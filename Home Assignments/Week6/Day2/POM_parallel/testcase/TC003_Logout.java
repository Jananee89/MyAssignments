package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC003_Logout extends ProjectSpecificMethod {

	@Test
	public void runLogout() {
		LoginPage lg=new LoginPage(driver);
		//method chaining
		lg.enterUsername().enterPassword().clickLogin().clickLogout();
		
	}
}
