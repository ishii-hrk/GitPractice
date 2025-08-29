package drill08;

public class Drill0821 {
	public static void main(String[] args) {
		int num = 8;
		System.out.println(evenOrOdd(num));
	}
	
	public static String evenOrOdd(int num) {
		return num % 2 == 0 ? "偶数" :  "奇数";
	}

}
