package drill08;

public class Drill0814 {
	public static void main(String[] args) {
		String grade = calculateGrade(85);
		System.out.println(grade);
	}
	
	public static String calculateGrade(int score) {
		//scoreの値に応じて成績を返す
		if(score >= 90) {
			return "A";
		}else if(score >= 80) {
			return "B";
		}else if(score >= 70) {
			return "C";
		}else if(score >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
}
