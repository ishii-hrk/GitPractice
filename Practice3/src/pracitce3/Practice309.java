package pracitce3;

public class Practice309 {
	public static void main(String[] args) {
        // 学校の設立
        School school = new School("Java学園");
        
        // 生徒が続々と入学
        school.enterSchool("春日");
        school.enterSchool("若林");
        school.enterSchool("遠藤");
        school.enterSchool("田中");
        school.enterSchool("渡辺");
        
        // 定員オーバー
        school.enterSchool("山下");
        System.out.println();
        
        // 在校生の紹介
        school.introduce();
    }
}

// ここに学校クラスを作成してください
class School{
	public static final int CAPACITY = 5;
	
	private String name;
	private Student[] students;
	
	// さらに、生徒ネストクラスを作成してください
		private class Student{
			int id;
			String name;
			
			public Student(int id, String name) {
				this.id = id;
				this.name = name;
			}
			
			@Override
			public String toString() {
				return School.this.name + "学園に在学している出席番号" 
						+ id + "の" + name + "です。";
			}
		}
	
	public School(String name) {
		this.name = name;
		students = new Student[CAPACITY];
	}
	
	public void enterSchool(final String name) {
		for(int i = 0; i < students.length; i++)
			if(students[i] == null) {
				students[i] = new Student(i + 1,name);
				System.out.println(name + "さんが" + this.name + "に入学しました");
				return;
			}
		System.out.println("定員オーバーで" + name + "さんは" + this.name + "に入学できません");	
	}
	
	public void introduce() {
	for(int i = 0; i < students.length; i++) {
		if(students != null) {
			System.out.println(students[i]);
		}else {
			break;
		}
	}
}	
}


