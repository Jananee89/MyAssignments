package week1.day3;

public class Egde {

	public static void main(String[] args) {
		//accessing public and default methods from Browser Class
		Browser obe=new Browser();
		String ed=obe.launchBrowser("Egde");
		System.out.println("Browser name is " +ed);
		obe.loadurl();
		
		//accessing default access modifier method from Library Class
		Library obj=new Library();
		obj.addBook("HP");
		obj.issueBook();

	}

}
