package week1.day3;

public class Browser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
		}
	//trying default access modifier
	 void loadurl(){
	System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser ob=new Browser();
		String chr=ob.launchBrowser("Chrome");
		System.out.println("Browser name is " +chr);
		ob.loadurl();
}
}