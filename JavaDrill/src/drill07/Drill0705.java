package drill07;

public class Drill0705 {

}

class Student{
	
	private int id;
	private String name;
	private char grade;
	
	public Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void displayGrade() {
		System.out.println(name + "の成績は" + grade + "です。");
	}
	
	public void updateGrade(char newGrade) {
		this.grade = newGrade;
	}
}
