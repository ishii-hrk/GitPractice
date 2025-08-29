package drill08;

public class Drill0816 {
	public static void main(String[] args) {
		Person p = new Person("Yuka");
		System.out.println("First:" + p.getName());
		String newName = "hiroki";
		p.changeName(newName);
		System.out.println("changed" + p.getName());
	}

}

class Person{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
}
