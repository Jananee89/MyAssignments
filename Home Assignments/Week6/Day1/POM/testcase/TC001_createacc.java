package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyHomePage;
import pages.ViewAccountPage;
import pages.WelcomePage;

public class TC001_createacc extends ProjectSpecificMethod {

	@Test
	public void runTC001Createacc() throws InterruptedException {
		
		LoginPage lp=new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		WelcomePage wp=new WelcomePage();
		wp.clickCrmsfa();
		
		MyHomePage mhp=new MyHomePage();
		mhp.selectAccountsTab();
		
		CreateAccountPage cap=new CreateAccountPage();
		cap.createAccount();
		
		ViewAccountPage vap=new ViewAccountPage();
		vap.viewacc();
		
		MyAccountPage map=new MyAccountPage();
		map.myaccount();
		
		
	}
}
