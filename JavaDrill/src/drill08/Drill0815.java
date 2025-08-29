package drill08;

public class Drill0815 {
	public static void main(String[] args) {
		String word = concatenateStrings("私の","名前は","石井です");
		System.out.println(word);
	}
	
	public static String concatenateStrings(String str1, String str2, String str3) {
		return str1 + str2 + str3;
	}

}
