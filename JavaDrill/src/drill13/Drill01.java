package drill13;

public class Drill01 {

	public static void main(String[] args) {
		//与えられた文字列を逆順にするプログラム
		String value = "Hello";
		
		StringBuilder sb = new StringBuilder(value);
		System.out.println(sb.reverse());

	}

}
