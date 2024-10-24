package week2.day3;

public class LoginTestData extends TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData ob=new LoginTestData();
		ob.enterCredentials();
		ob.navigateToHomePage();
		ob.enterUsername();
		ob.enterPassword();

	}
	public void enterUsername() {
		System.out.println("Inside enterUsername method of LoginTestData class");
	}
	public void enterPassword() {
		System.out.println("Inside enterPassword method of LoginTestData class");
	}

}
