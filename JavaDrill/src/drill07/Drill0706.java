package drill07;

import java.util.ArrayList;
import java.util.List;

public class Drill0706 {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Alex",25));
		personList.add(new Person("Alice",36));
		personList.add(new Person("Bob",52));
		personList.add(new Person("Ken",43));
		
		personList.forEach(p -> p.displayInfo());
		
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}
}
