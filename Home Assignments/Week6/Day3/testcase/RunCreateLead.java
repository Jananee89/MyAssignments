package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class RunCreateLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setValues() {
		fileName="createlead";
	}
	@Test(dataProvider="sendData")
	public void runCL(String uName,String pswd,String CName,String fName,String Lname) {
		LoginPage lg=new LoginPage();
		//method chaining
		lg.enterUsername(uName).enterPassword(pswd).clickLogin().clickCrmsfa().clickLeadsTab().clickCreateLead().entercName(CName).enterfName(fName).enterlName(Lname).clickSubmit();
		
		//WelcomePage wl=new WelcomePage();
		//wl.clickCrmsfa();
		
	}
	
	
}
