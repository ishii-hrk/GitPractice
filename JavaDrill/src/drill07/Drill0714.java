package drill07;

import java.util.ArrayList;
import java.util.List;

public class Drill0714 {
	public static void main(String[] args) {
		BookVer4 book1 = new BookVer4("Java基礎","Chris",2023);
		BookVer4 book2 = new BookVer4("Linux基礎","David",2022);
		BookVer4 book3 = new BookVer4("Python基礎","Elen",2024);
		BookVer4 book4 = new BookVer4("JavaScript基礎","Chris",2020);
	
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.displayBooks();
	}
}

class BookVer4{
	
	private String title;
	private String author;
	private int publicationYear;
	
	public BookVer4(String title,String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear; 
	}
	
	public void displayInfo() {
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
		System.out.println("PublicationYear:" + publicationYear);
	}
}

class Library{
	private List<BookVer4> books = new ArrayList<>();
	
	public void addBook(BookVer4 book) {
		books.add(book);
	}
	
	public void displayBooks() {
		books.forEach(book -> book.displayInfo());
	}
}