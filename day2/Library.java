package week1.day2;

public class Library {
	public String addBook(String bookTitle) 
	{  
		System.out.println("Book added successfully ");//printing the message upon this method is called using the object
		return bookTitle; //returing the bookTitle to the main method once this method is called using the object
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");//printing the message upon this method is called using the object 
	}

	public static void main(String[] args) {
		Library lib=new Library(); //creating object for the class
		String book_title=lib.addBook("Thriller and suspense"); //calling the method addBook and passing one string argument to it as an input
		lib.issueBook();//calling the method issueBook using the created object

	}

}
