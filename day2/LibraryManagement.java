package week1.day2;
//assignment session 1 day 2
public class LibraryManagement {
//creating another class Library Management
	public static void main(String[] args) {
	
		Library library_management=new Library();//creating object for the different class in the same package
		String book_title= library_management.addBook("Thriller and suspense"); //calling the method addBook and passing one string argument to it as an input
		library_management.issueBook();//calling the method issueBook using the created object

	}

}
