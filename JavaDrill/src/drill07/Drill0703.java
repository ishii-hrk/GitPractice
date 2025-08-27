package drill07;


public class Drill0703 {
	public static void main(String[] args) {
		Book book = new Book("基本情報","石井",1995);
		book.displayInfo();
	}

}

class Book{
	private String title;
	private String author;
	private int year;
	
	public Book(String title,String author,int year) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setYear(year);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void displayInfo() {
		System.out.println("タイトル:" + title);
		System.out.println("著者:" + author);
		System.out.println("出版年:" + year);
	}
	
	
}
