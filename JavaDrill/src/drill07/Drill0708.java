package drill07;

public class Drill0708 {
	public static void main(String[] args) {
		BookVer2 book = new BookVer2("Java基礎","田中太郎");
		book.displayInfo();
	}
}

class BookVer2{
	private String title;
	private String author;
	
	public BookVer2(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
	}
}
