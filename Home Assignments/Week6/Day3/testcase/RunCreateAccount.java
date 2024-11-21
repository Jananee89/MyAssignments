package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.CreateAccountPage;
import pages.LoginPage;

public class RunCreateAccount extends ProjectSpecificMethod{
	@BeforeTest
	public void setValues() {
		fileName="createacc";
	}
	@Test(dataProvider="sendData")
	public void runCreateAcc(String uName,String pswd,String accName,String desc,String emp,String off) throws InterruptedException {
		LoginPage lg=new LoginPage();
		//method chaining
		lg.enterUsername(uName).enterPassword(pswd).clickLogin().clickCrmsfa();
		Thread.sleep(3000);
		
		CreateAccountPage ca=new CreateAccountPage();
		ca.createAccount().accName(accName).desc(desc).emp(emp).off(off).submit();
	}
	
}
