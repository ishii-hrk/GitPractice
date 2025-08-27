package drill07;

public class Drill0713 {
	public static void main(String[] args) {
		Animal elephant = new Animal("elephant", 21);
		Animal dog = new Animal("dog",8);
		
		elephant.displayInfo();
		dog.displayInfo();
	}
}

class Animal{
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("This animal is " + name);
		System.out.println("This age is " + age);
	}
}