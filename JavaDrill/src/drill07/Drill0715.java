package drill07;

import java.util.ArrayList;
import java.util.List;

public class Drill0715 {
	public static void main(String[] args) {
		University university1 = new University();
		University university2 = new University();
		University university3 = new University();
		
		Student2 student1 = new Student2("Chris");
		Student2 student2 = new Student2("Gats");
		Student2 student3 = new Student2("Lian");
		
		university1.addStudents(student1);
		university2.addStudents(student2);
		university3.addStudents(student3);
		
		university1.displayStudents();
		university2.displayStudents();
		university3.displayStudents();
		
	}

}

class Student2{
	
	private String name;
	
	public Student2(String name) {
		this.name = name;
	}
	
	public void showName() {
		System.out.println(name);
	}
}

class University{
	 
	List<Student2> students = new ArrayList<>();
	
	public void addStudents(Student2 name) {
		students.add(name);
	}
	
	public void displayStudents() {
		System.out.println("学生情報");
		students.forEach(s -> s.showName());
	}
}
