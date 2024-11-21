package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class RunLogin extends ProjectSpecificMethod {
	@BeforeTest
	public void setValues() {
		fileName="login";
	}
	@Test(dataProvider="sendData")
	public void runLog(String uName,String pswd) {
		LoginPage lg=new LoginPage();
		//method chaining
		lg.enterUsername(uName).enterPassword(pswd).clickLogin();
	}
}
