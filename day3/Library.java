package week1.day3;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library ob=new Library();
		ob.addBook("Sapiens");
		ob.issueBook();

	}
	String addBook(String bookTitle){
		System.out.println(bookTitle+ " Book added successfully");
		return bookTitle;
	}
	
	void issueBook(){
		System.out.println("Book issued successfully");
	}
}
