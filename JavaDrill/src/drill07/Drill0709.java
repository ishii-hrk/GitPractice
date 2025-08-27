package drill07;

public class Drill0709 {
	public static void main(String[] args) {
		PersonVer2 person = new PersonVer2("Rento",5);
		person.displayInfo();
		
		BookVer3 book = new BookVer3("Marmaid","Roland");
		book.displayInfo();
	}

}

class PersonVer2{
	private String name;
	private int age;
	
	public PersonVer2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}
}

class BookVer3{
	private String title;
	private String author;
	
	public BookVer3(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
	}
}

